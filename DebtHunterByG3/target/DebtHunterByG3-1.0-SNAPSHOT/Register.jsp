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
                 <script type="text/javascript">

  function checkForm(form)
  {
    if(form.password.value != "" && form.password.value == form.confirmed.value) {
      if(form.password.value.length < 6) {
        alert("Error: Password must contain at least six characters!");
        form.password.focus();
        return false;
      }
      re = /[0-9]/;
      if(!re.test(form.password.value)) {
        alert("Error: password must contain at least one number (0-9)!");
        form.password.focus();
        return false;
      }
      re = /[a-z]/;
      if(!re.test(form.password.value)) {
        alert("Error: password must contain at least one lowercase letter (a-z)!");
        form.password.focus();
        return false;
      }
      re = /[A-Z]/;
      if(!re.test(form.password.value)) {
        alert("Error: password must contain at least one uppercase letter (A-Z)!");
        form.password.focus();
        return false;
      }
    } else {
      alert("Error: Please check that you've entered and confirmed your password!");
      form.password.focus();
      return false;
    }

    alert("Regis Successful");
    return true;
  }
        </script> 
    </head>
    <body>
        <div class="wrapper">
			<div class="inner">
<!--				<img src="Regis/images/image-1.png" alt="" class="image-1">-->
				<form action="AddUserToDB" method="POST" onsubmit="return checkForm(this);">
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
