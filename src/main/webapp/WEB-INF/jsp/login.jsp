<!DOCTYPE html>
<html lang="en">
   <head>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title> Account Creation-Login</title>
      <link href="/css/bootstrap.min.css" rel="stylesheet">
      <link href="/css/main.css" rel="stylesheet">
   </head>
   <body>
      <div id="errors">
      <h1>ONLINE CREATION AND ENROLLEMENT</h1><br>	
      <form>
         <div class="container">   
            <label>User Name</label>
            <input type="text" placeholder="Enter Username" id="userName" required><br>
            <label>Password</label>
            <input type="password" placeholder="Enter your Password" id="password" required><br> 
            <button type="button" id="login">Login</button>   
         </div>
      </form>
      </div>
   </body>
   <footer>
   	<script src="/js/jquery-3.5.1.min.js"></script>
   	<script src="/js/popper.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/login.js"></script>
   </footer>
</html>
