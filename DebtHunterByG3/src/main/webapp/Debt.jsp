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
		<title>Debt Hunter - Main</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- LINEARICONS -->
		<link rel="stylesheet" href="Regis/fonts/linearicons/style.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="Regis/css/style.css">
                 
    </head>
    <body>
        <div class="wrapper">
			<div class="inner">
				<form action="AddToBoard" method="POST">
                             <div class="form-holder">
						
						<input type="text" class="form-control" placeholder="Debtname" name="debtname"  value="" required/>
					</div>
                                        <div class="form-holder">
						
						<input type="email" class="form-control" placeholder="Debtor" name="email" value="" required/>
					</div>
					<div class="form-holder">
						
						<input type="text" class="form-control" placeholder="Description" name="description" value="" required/>
					</div>
                                        
                                        
                                        <div class="form-holder">
						
						<input type="number" class="form-control" placeholder="Cost" name="cost" value="" required/>
					</div>
                                        <div class="form-holder">
						<label for="start">Within date!!</label>
                                            <input type="date" name="date" min="1999-01-01" max="2050-12-31"/>
					</div>
                                        
                                        <button type="submit" name="Accept">
						<span>ADD</span>
					</button>
        </form>
			</div>
			
		</div>
                    <script src="Regis/js/jquery-3.3.1.min.js"></script>
                    <script src="Regis/js/main.js"></script>
    </body>
</html>
