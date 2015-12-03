<%-- 
    Document   : tarjeta_detalles
    Created on : 02-dic-2015, 15:32:43
    Author     : JuanCarlos
--%>

<%@page import="java.util.List"%>
<%@page import="pe.edu.ulima.Tarjeta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>.:Programación Internet:.</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/modern-business.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html" style="font-weight: bolder; color: white">CINE PALTA</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="index.html">INICIO</a>
                        </li>
                        <li>
                            <a href="gestion_cartelera">GESTIONAR CARTELERA</a>
                        </li>
                        <li>
                            <a href="gestion_tarjetas">GESTIONAR TARJETAS</a>
                        </li>
                        <li>
                            <a href="cerrar_sesion.jsp" style="color: orange">CERRAR SESIÓN</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <!-- Header Carousel -->
        <header id="myCarousel" class="carousel slide">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                <div class="item active">
                    <div class="fill" style="background-image:url('http://acantiladodebarranco.pe/images/slider-1.jpg');"></div>          
                </div>
                <div class="item">
                    <div class="fill" style="background-image:url('http://acantiladodebarranco.pe/images/slider-2.jpg');"></div>  
                </div>
                <div class="item">
                    <div class="fill" style="background-image:url('http://acantiladodebarranco.pe/images/slider-3.jpg');"></div>   
                </div>

            </div>

            <!-- Controls -->
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                <span class="icon-prev"></span>
            </a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">
                <span class="icon-next"></span>
            </a>
        </header>

        <!-- Page Content -->
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">DETALLES DE LA TARJETA:
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="ingreso_al_sistema_admin.jsp">INICIO</a>
                        </li>
                        <li class="active">Es necesario que seleccione todos los campos</li>
                    </ol>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <h3>
                        <a href="#">Información de las tarjetas:</a>
                    </h3> 
                </div>
            </div>
            <div class="row">  
                <% Tarjeta tarjeta = (Tarjeta) request.getAttribute("tarjeta"); %>
                <form method="POST" action="#">
                    <div class="col-lg-6">
                        <p>Id</p>
                        <input type="text" class="form-control" name="nombre" value="<%=tarjeta.getIdTarjeta() %>" required="" disabled/>  
                        <p>Nombre:</p>
                        <input type="text" class="form-control" name="nombre" value="<%=tarjeta.getNombre()%>" required="" disabled/>
                        <p>Atención:</p>
                        <input type="text" class="form-control" name="atencion" value="<%=tarjeta.getAtencion()%>" required="" disabled/>
                        <p>Precio:</p>
                        <input type="number" class="form-control" name="precio" value="<%=tarjeta.getPrecio()%>" required="" disabled/>
                        <p>Dulcería:</p>
                        <input type="text" class="form-control" name="dulceria" value="<%=tarjeta.getDulceria()%>" required="" disabled/>
                        <p>Cumpleaños:</p>
                        <input type="text" class="form-control" name="cumpleanos" value="<%=tarjeta.getCumpleanos()%>" required="" disabled/>
                        <p>Calendario:</p>
                        <input type="text" class="form-control" name="calendario" value="<%=tarjeta.getCalendario()%>" required="" disabled/>
                    </div>
                    <div class="col-lg-6">
                        <div style="text-align: center; padding-top: 100px;">
                            <img src="img/<%=tarjeta.getImg()%>" alt=""/>
                        </div>    
                    </div>
                </form>       
            </div>
            
            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <p>Copyright &copy; Alumnos del curso "Programación Internet" / Profesor: Hernán Quintana / Universidad de Lima</p>
                    </div>
                </div>
            </footer>
        </div>
        <!-- /.container -->

        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Script to Activate the Carousel -->
        <script>
            $('.carousel').carousel({
                interval: 5000 //changes the speed
            })
        </script>

    </body>

</html>
