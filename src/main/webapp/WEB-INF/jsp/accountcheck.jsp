<!DOCTYPE html>
<html lang="en">
   <head>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title> Account check page</title>
      <link href="/css/bootstrap.min.css" rel="stylesheet">
      <link href="/css/main.css" rel="stylesheet">
   </head>
   <body>
      <div class="container" id="errormsg">
      <div id="successmsg"></div> 
         <div class="row">
            <div class="col-lg-3">
               <label>Account Check</label>
            </div>
            <div class="col-lg-9">
               <label id="welcomeMsg">Hello ${username}</label>
            </div>
         </div>
      <div class="inner-container">
         <div class="row">
            <div class="col-lg-3">
               <ul>
				    <li><a id="accountCreation" title="Account Creation" href="/accountcreation/home">Account Creation</a></li>
   				    <li><a id="accountCheck" title="Account Check" href="/accountcreation/accountcheck">Account Check</a></li>
   				    <li><a id="enrollmentCheck" title="Enrollment Check" href="/accountcreation/enrolmentcheck">Enrollment Check</a></li>
   				</ul>
            </div>
            <div class="form-section col-lg-9">
              <form>
                     <div class="container">   
                        <label>PAN NUMBER</label>
                        <input type="text" placeholder="Enter PAN NUMBER" id="panNumber" required><br>
						<label>MOBILE NUMBER</label>
                        <input type="text" placeholder="Enter MOBILE NUMBER" id="mobileNum" required><br>
						<button type="button" id="checkaccount">CHECK ACCOUNT</button>  
                     </div>
               </form>
            </div>
         </div>
      </div>
      </div>
   </body>
   <footer>
      <script src="/js/jquery-3.5.1.min.js"></script>
      <script src="/js/popper.min.js"></script>
      <script src="/js/bootstrap.min.js"></script>
      <script src="/js/login.js"></script>
   </footer>
</html>