<%-- 
    Document   : Register
    Created on : Oct 13, 2020, 8:57:45 PM
    Author     : GuideKai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="utf-8">
		<title>RegistrationForm_v10 by Colorlib</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- LINEARICONS -->
		<link rel="stylesheet" href="Regis/fonts/linearicons/style.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="Regis/css/style.css">
                 <script>
                    function myfunction() {
                    var pass1 = document.getElementById("password").value;
                    var pass2 = document.getElementById("confirmed").value;
                if (pass1 !== pass2) {
                    alert("Passwords Do not match");
                } else {
                    alert("You're right !!");
                }
            }
        ;
        </script> 
    </head>
    <body>
        <div class="wrapper">
			<div class="inner">
				<img src="Regis/images/image-1.png" alt="" class="image-1">
				<form action="AddUserToDB" method="POST">
					<h3>New Account?</h3>
                                        <div class="form-holder">
						<span class="lnr lnr-envelope"></span>
						<input type="email" class="form-control" placeholder="Mail" name="email" required/>
					</div>
                                        <div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="password" class="form-control" placeholder="Password" name="password" id="password" required/>
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="password" class="form-control" placeholder="Confirm Password" name="confirmed" id="confirmed" onkeyup="return myfunction()" required/>
					</div>
                                        <span id='message'></span>
                                        
                                        <div class="form-holder">
						<span class="lnr lnr-user"></span>
						<input type="text" class="form-control" placeholder="firstname" name="firstname" required/>
					</div>
                                        <div class="form-holder">
						<span class="lnr lnr-user"></span>
						<input type="text" class="form-control" placeholder="lastname" name="lastname" required/>
					</div>
                                        <div class="form-holder">
						<span class="lnr lnr-phone-handset"></span>
						<input type="text" class="form-control" placeholder="Phone Number" name="tel" value=""/>
					</div>
                                        <button type="submit" name="Accept">
						<span>Register</span>
					</button>
				</form>               
                                <img src="Regis/images/image-2.png" alt="" class="image-2">
			</div>
			
		</div>
                    <script src="Regis/js/jquery-3.3.1.min.js"></script>
                    <script src="Regis/js/main.js"></script>
    </body>
</html>
