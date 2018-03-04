<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Admin Login</title>
  <link rel="stylesheet" href="css/admin_styles.css">

</head>

<body>
  <form action="verify_admin_login" method="post">
  <header>Welcome Admin!</header>
  <label>Username </label>
  <input id="email" class="input_field" type="email" name="email">
  <div class="signup"></div>
  <label>Password </label>
  <input id="pass" class="input_field" type="password" name="pass">
  <input type="submit" id="login_button" value="Login">
</form>
</body>

</html>
