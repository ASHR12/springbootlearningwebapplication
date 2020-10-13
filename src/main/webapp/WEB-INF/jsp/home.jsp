<!DOCTYPE html>
<html lang="en">
   <head>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title> Account Creation-Login</title>
      <link href="/css/bootstrap.min.css" rel="stylesheet">
      <link href="/css/main.css" rel="stylesheet">
   </head>
   <body>
      <div class="container" id="errormessage">
      <div id="successmessage"></div> 
         <div class="row">
            <div class="col-lg-3">
               <label>Account Creation</label>
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
                        <label>FIRST NAME</label>
                        <input type="text" placeholder="Enter Firstname" id="fname" required><br>
						<label>LAST NAME</label>
                        <input type="text" placeholder="Enter Lastname" id="lname" required><br>
						<label>AGE</label>
                        <input type="text" placeholder="Enter Age" id="age" required><br>
						<label>Mobile NUMBER</label>
                        <input type="text" placeholder="Enter Mobile number" id="mobileNo" required><br>
						<label>PAN NUMBER</label>
                        <input type="text" placeholder="Enter PAN NO" id="panNo" required><br>
						<label>DATE OF BIRTH</label>
                        <input type="text" placeholder="Enter DOB" id="dob" required><br>
						<label>EMAIL ID</label>
                        <input type="text" placeholder="Enter EMAIL ID" id="emailID" required><br>
						<label>ENROL FOR INTERNET BANKING</label>
							  <input type="radio" id="yesOptionRadio" name="enrollementoption" value="YES" checked>YES
							  <input type="radio" id="noOptionRadio" name="enrollementoption" value="NO">NO
                       <br>
                         <label>User Name</label>
				            <input type="text" placeholder="Enter Username" id="uname" required><br>
				            <label>Password</label>
				            <input type="password" placeholder="Enter your Password" id="psswrd" required><br>
				            <button type="button" id="createaccount">CREATE ACCOUNT</button>  
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
      <script src="/js/accountCreation.js"></script>
   </footer>
</html>