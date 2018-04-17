package controller;

import dao_impl.item;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ItemModel;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author mukul
 */
public class add_new_item extends HttpServlet {
    
    File file;

    public File upload_file1(FileItem fi, String path) {
        try {
            file = new File(path);
            fi.write(file);
        } catch (Exception e) {
            System.out.print("problem to upload file" + e);
        }
        return file;
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        
        String Path =   "C:/wamp64/www/picture/";
        String foodimage = "";
        
        
        try{
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            
            List list = upload.parseRequest(request);
            Iterator iterator = list.iterator();
            
            String item_name="" ;
            String item_quantity="";
            
            String item_price="";
            String category="";
            String item_desc="" ;
            
            
            
            do {
                if (!iterator.hasNext()) {
                    break;
                }
                FileItem fi = (FileItem) iterator.next();
                if (!fi.isFormField() && !fi.getName().trim().equals("")) {
                                     String field_Name = fi.getFieldName();

                    switch (field_Name) {
                        case "file":
                            String food_img_name = "f" + System.currentTimeMillis() + fi.getName().substring(fi.getName().lastIndexOf("."));
                            foodimage = food_img_name;
                            upload_file1(fi, Path+food_img_name);
                            break;
                        case "n_item":
                            System.out.println(fi.getName());
                            item_name += fi.getName();
                            break;
                        case "n_item_quantity":
                            item_quantity+= fi.getName();
                            break;
                        case "n_item_price":
                            item_price+= fi.getName();
                            break;
                        case "category":
                            category+= fi.getName();
                            break;
                        case "description":
                            item_desc+= fi.getName();
                            break;
                    }
                }
            }while (true);
            
            
            String item_visibility = "1";
            
            
            
            
            
            
            
            ItemModel itemmodel = new ItemModel();
            itemmodel.setItem_name(item_name);
            itemmodel.setItem_quantity(item_quantity);
            itemmodel.setItem_price(item_price);
            itemmodel.setItem_image(foodimage);
            itemmodel.setItem_desc(item_desc);
            itemmodel.setCategory(category);
            itemmodel.setItem_visibility(item_visibility);
            
            item it = new item();
            String status =  it.addItem(itemmodel);
            out.print(status);
            response.sendRedirect("view_stock");
                     
        }
         catch(Exception ex)
        {
            out.println(ex);
        }
        
    
    }
    
}