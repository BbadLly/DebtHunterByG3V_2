<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Debt Hunter</title>
        <meta content="" name="descriptison">
        <meta content="" name="keywords">

      

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assetsHome/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assetsHome/vendor/icofont/icofont.min.css" rel="stylesheet">
        <link href="assetsHome/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assetsHome/vendor/venobox/venobox.css" rel="stylesheet">
        <link href="assetsHome/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="assetsHome/vendor/aos/aos.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="assetsHome/css/styleMain.css" rel="stylesheet">


        <!-- =======================================================
        * Template Name: Ninestars - v2.2.0
        * Template URL: https://bootstrapmade.com/ninestars-free-bootstrap-3-theme-for-creative/
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->
    </head>

    <body>

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top">
            <div class="container-fluid d-flex">

                <div class="logo mr-auto">
                    <h1 class="text-light"><a href="Home"><span>DebtHunter</span></a></h1>
                 
                </div>

                <nav class="nav-menu d-none d-lg-block">
                    <ul>

                        <li><a href="Home">Home</a></li>
                   
                        <li class="drop-down" class="get-started"><a href="Profile">${profile.firstname} ${profile.lastname}</a>
                            <ul>
                                <div class="a1">
                                    <center><h4>My Profile</h4></center><br>
                                    <li> ${user.email} </li><br>
                                <li>${user.tel} </li>
                                </div>
                                <li><a href="EditProfile.jsp">Edit</a></li>
<!--                                <li><a href="Logout">Logout</a></li>-->
                            </ul>
                        </li>
                        <li><a href="Logout">Logout</a></li>
                    </ul>
                </nav><!-- .nav-menu -->
                <style>
                    .a1 {
                        display: block;
  position: relative;
  color: #4e4039;
  padding: 10px 15px;
  transition: 0.3s;
  font-size: 15px;
  font-family: "Open Sans", sans-serif;
 
  
                    }
                </style>
            </div>
        </header><!-- End Header -->


        <a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

        <!-- Vendor JS Files -->
        <script src="assetsHome/vendor/jquery/jquery.min.js"></script>
        <script src="assetsHome/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assetsHome/vendor/jquery.easing/jquery.easing.min.js"></script>
        <script src="assetsHome/vendor/php-email-form/validate.js"></script>
        <script src="assetsHome/vendor/isotope-layout/isotope.pkgd.min.js"></script>
        <script src="assetsHome/vendor/venobox/venobox.min.js"></script>
        <script src="assetsHome/vendor/owl.carousel/owl.carousel.min.js"></script>
        <script src="assetsHome/vendor/aos/aos.js"></script>

        <!-- Template Main JS File -->
        <script src="assetsHome/js/main.js"></script>

    </body>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            font-family: "Lato", sans-serif;
        }

        .sidenav {
            height: 100%;
            width: 160px;
            position: fixed;
            z-index: 1;
            top: 0;
            left: 0;
            background-color: #111;
            overflow-x: hidden;
            padding-top: 100px;
        }

        .sidenav a {
            padding: 6px 8px 6px 16px;
            text-decoration: none;
            font-size: 25px;
            color: #818181;
            display: block;
        }

        .sidenav a:hover {
            color: #F3E367;
        }

        .main {
            margin-left: 160px; /* Same as the width of the sidenav */
            font-size: 28px; /* Increased text to enable scrolling */
            padding: 100px 10px;
        }

        @media screen and (max-height: 450px) {
            .sidenav {padding-top: 15px;}
            .sidenav a {font-size: 18px;}
        }
    </style>
</head>


<div class="sidenav">
    <a href="#Creditors">Creditors</a>
    <a href="#Debtors">Debtors</a>
    <!--  <a href="#clients">Clients</a>
      <a href="#contact">Contact</a>-->
</div>

<div class="main">

    <h2 >Creditors</h2>
    <div class="box">
        <a class="button" href="AddDebt">ADD</a>
    </div>
    <div class="div1" id="Creditors">
            <div class="div2"></div>
     
                        
                        <style>
                            .buttonn{
                                border: none;
                                width: 100%;
                                height: 49px;
                                margin-top: 50px;
                                cursor: pointer;
                                display: flex;
                                align-items: center;
                                justify-content: center;
                                padding: 0;
                                background: #f3e357;
                                color: #fff;
                                text-transform: uppercase;
                                font-family: "Muli-SemiBold";
                                font-size: 15px;
                                letter-spacing: 2px;
                                transition: all 0.5s;
                                position: relative;
                                overflow: hidden; }
                            button span {
                                position: relative;
                                z-index: 2; }

                            button:hover{

                                background-color: #dbc200;
                            }
                        </style>

                
            
      


    </div>
    <h2 >Debtors</h2>
    <div class="box">
        <a class="button" href="Test">Board</a>
    </div>
    <div class="div1" id="Debtors">
        <div class="div2"></div>
        

    </div>
</div>
<style>
    .div1 {
        width: 100%;
        height: 50%;
        position: relative;
        background-color: #fff;
        border: 1px solid #e6e6e6;
        border-radius: 25px;
    }
    .div2 {
        width: 20%;
        height: 92%;
        position: relative;
        margin: 15px;
        background-color: #929D9E;
        border: 1px solid #e6e6e6;
        border-radius: 25px;
    }
    }
</style>

<link rel="stylesheet" type="text/css" href="assetsHome/css/Scrollbars.css" />

<!-- latest jQuery direct from google's CDN -->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<!-- the jScrollPane script -->
<script type="text/javascript" src="jquery.jscrollpane.min.js"></script>

<!--instantiate after some browser sniffing to rule out webkit browsers-->
<script type="text/javascript">

    $(document).ready(function () {
        if (!$.browser.webkit) {
            $('.container').jScrollPane();
        }
    });

</script>
<!-- popup-->
<style>
    body {
        font-family: Arial, sans-serif;

        background-size: cover;
        height: 100vh;
    }

    h1 {
        text-align: center;
        font-family: Tahoma, Arial, sans-serif;
        color: #06D85F;
        margin: 80px 0;
    }

    /*.box {
      width: 40%;
      margin: 0 auto;
      background: rgba(255,255,255,0.2);
      padding: 35px;
      border: 2px solid #fff;
      border-radius: 20px/50px;
      background-clip: padding-box;
      text-align: center;
    }*/

    .button {
        font-size: 15px;
        padding: 10px;/*
        color: #fff;
        border: 2px solid #06D85F;
        border-radius: 20px/50px;
        text-decoration: none;
        cursor: pointer;
        transition: all 0.3s ease-out;*/
    }
    /*.button:hover {
      background: #06D85F;
    }*/

    .overlay {
        position: fixed;
        top: 0;
        bottom: 0;
        left: 0;
        right: 0;
        background: rgba(0, 0, 0, 0.7);
        transition: opacity 500ms;
        visibility: hidden;
        opacity: 0;
    }
    .overlay:target {
        visibility: visible;
        opacity: 1;
    }

    .popup {
        margin: 70px auto;
        padding: 20px;
        background: #fff;
        border-radius: 5px;
        width: 30%;
        position: relative;
        transition: all 5s ease-in-out;
    }

    .popup h2 {
        margin-top: 0;
        color: #333;
        font-family: Tahoma, Arial, sans-serif;
    }
    .popup .close {
        position: absolute;
        top: 20px;
        right: 30px;
        transition: all 200ms;
        font-size: 30px;
        font-weight: bold;
        text-decoration: none;
        color: #333;
    }
    .popup .close:hover {
        color: #f3e357;
    }
    .popup .content {
        max-height: 30%;
        overflow: auto;
        font-size: 15px;
    }
    .dateee {
        text-align: center;
    }

    @media screen and (max-width: 700px){
        .box{
            width: 70%;
        }
        .popup{
            width: 70%;
        }
    }
</style>

</body>
</body>
</html> 


</html>