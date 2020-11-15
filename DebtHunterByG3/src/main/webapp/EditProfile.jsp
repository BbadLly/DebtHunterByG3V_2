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
		<title>Debt Hunter - Edit</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- LINEARICONS -->
		<link rel="stylesheet" href="Regis/fonts/linearicons/style.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="Regis/css/style.css">
                 
    </head>
    <body>
        <div class="wrapper">
			<div class="inner">
				<form action="EditProfile" method="POST">
                                    <center><h1>Edit Profile</h1></center>
                                    <br>
                             <div class="form-holder">
                                                    <span class="lnr lnr-user"></span>
						<input type="text" class="form-control" placeholder="Firstname" name="firstname"  value="" required/>
					</div>
                                        <div class="form-holder">
						<span class="lnr lnr-user"></span>
						<input type="text" class="form-control" placeholder="Lastname" name="lastname" value="" required/>
					</div>
					<div class="form-holder">
						<span class="lnr lnr-phone-handset"></span>
						<input type="text" class="form-control" placeholder="Tel" name="tel" value="" required/>
					</div>
                                        
                                        
                                        
                                        
                                        <button type="submit" name="Confirm">
						<span>CONFIRM</span>
					</button>
                                    
                                    <br>
                                    <center><a href="Main.jsp"> Back</a></center>
                                    
        </form>
			</div>
			
		</div>
                    <script src="Regis/js/jquery-3.3.1.min.js"></script>
                    <script src="Regis/js/main.js"></script>
    </body>
</html>
