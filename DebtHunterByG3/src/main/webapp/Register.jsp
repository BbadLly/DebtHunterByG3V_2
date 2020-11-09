<%-- 
    Document   : Register
    Created on : Oct 13, 2020, 8:57:45 PM
    Author     : GuideKai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Debt Hunter | Sign Up</title>
    </head>
    <body>
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
        <form action="AddUserToDB" method="POST">
            <p>E-mail  <input type="email" name="email" value="" required/> </p>
            <p>Password  <input type="password" name="password" id="password" value="" required/> </p>
            <p>Confirmed Password  <input type="password" name="confirmed" id="confirmed" onkeyup="return myfunction()" required/> </p>
            <span id='message'></span>

            <p>First Name  <input type="text" name="firstname" value="" required/> </p>
            <p>Last Name  <input type="text" name="lastname" value="" required/> </p>
            <p>Tel.  <input type="text" name="tel" value=""/> </p>                
            <p><input type="submit" name="Accept" /> </p>                
        </form>
    </body>
</html>
