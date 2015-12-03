<%-- 
    Document   : tarjetas
    Created on : 29-nov-2015, 20:35:18
    Author     : JuanCarlos
--%>

<%@page import="pe.edu.ulima.Tarjeta"%>
<%@page import="java.util.List"%>
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
                            <a href="obtener_peliculas">CARTELERA</a>
                        </li>
                        <li>
                            <a href="obtener_tarjetas">TARJETAS</a>
                        </li>
                        <li>
                            <a href="inicio_sesion.jsp" style="color: orange">CERRAR SESIÓN</a>
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
                    <h2 class="page-header">NUESTRAS TARJETAS
                    </h2>
                    <ol class="breadcrumb">
                        <li><a href="index.html">Afiliate</a>
                        </li>
                        <li class="active">Disfruta de los beneficios de nuestras tarjetas Cine Palta</li>
                    </ol>
                </div>
            </div>
            <% List<Tarjeta> listaTarjetas = (List<Tarjeta>) request.getAttribute("listaTarjetas"); %>

            <%
                for (Tarjeta tarjeta : listaTarjetas) {

            %>
            <div class="row">
                <div class="col-lg-6">
                    <img src="img/<%=tarjeta.getImg()%>" alt=""/>
                </div>
                <div class="col-lg-6">
                    <div class="row" style="background-color: lightgray;">
                        <div class="col-lg-12">
                            <p style="margin-top: 5px; font-weight: bolder;">Beneficios:</p>
                        </div>
                    </div>
                    <div class="row" style="margin-top: 15px;">
                        <div class="col-lg-4">
                            <p style="color: #286090; font-weight: bold;">Nombre:</p>
                        </div>
                        <div class="col-lg-8">
                            <p style="text-align: justify;"><%=tarjeta.getNombre()%></p>
                        </div>
                    </div>
                    <div class="row" style="margin-top: 15px;">
                        <div class="col-lg-4">
                            <p style="color: #286090; font-weight: bold;">Atención:</p>
                        </div>
                        <div class="col-lg-8">
                            <p style="text-align: justify;"><%=tarjeta.getAtencion()%></p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-4">
                            <p style="color: #286090; font-weight: bold;">Precio de martes:</p>
                        </div>
                        <div class="col-lg-8">
                            <p style="text-align: justify;"><%=tarjeta.getPrecio()%></p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-4">
                            <p style="color: #286090; font-weight: bold;">Dulcería:</p>
                        </div>
                        <div class="col-lg-8">
                            <p style="text-align: justify;"><%=tarjeta.getDulceria()%></p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-4">
                            <p style="color: #286090; font-weight: bold;">Cumpleaños:</p>
                        </div>
                        <div class="col-lg-8">
                            <p style="text-align: justify;"><%=tarjeta.getDulceria()%></p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-4">
                            <p style="color: #286090; font-weight: bold;">Calendario:</p>
                        </div>
                        <div class="col-lg-8">
                            <p style="text-align: justify;"><%=tarjeta.getCalendario()%></p>
                        </div>
                    </div>
                </div>
                
            </div>
            <% }
            %>
            
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="page-header">NUESTROS BENEFICIOS</h2>
                </div>
                <div class="col-lg-12">

                    <ul id="myTab" class="nav nav-tabs nav-justified">
                        <li class="active"><a href="#service-one" data-toggle="tab"><i class="fa fa-tree"></i>confitería</a>
                        </li>
                        <li class=""><a href="#service-two" data-toggle="tab"><i class="fa fa-car"></i>Amplias y cómodas salas</a>
                        </li>
                        <li class=""><a href="#service-three" data-toggle="tab"><i class="fa fa-support"></i>Seguridad garantizada</a>
                        </li>

                    </ul>

                    <div id="myTabContent" class="tab-content">
                        <div class="tab-pane fade active in" id="service-one">
                            <div class="row">

                                <div class="col-md-8">
                                    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">

                                        <!-- Wrapper for slides -->
                                        <div class="carousel-inner">
                                            <div class="item active">
                                                <img class="img-responsive" src="http://acantiladodebarranco.pe/images/servicio1.jpg" alt="">
                                            </div>              
                                        </div>                                
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <h3>Confitería:</h3>
                                    <p>Disfruta de las más variada confitería de nuestros locales en todo el Perú, te ofreceremos promociones todos los fines de semana.</p>
                                    <h3>Detalles:</h3>
                                    <ul>
                                        <li>Pop Corn</li>
                                        <li>Gaseosas</li>
                                        <li>Hot Dog</li>
                                        <li>Y mucho más...</li>
                                    </ul>
                                </div>

                            </div>
                        </div>
                        <div class="tab-pane fade" id="service-two">
                            <div class="row">

                                <div class="col-md-8">
                                    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                        <!-- Wrapper for slides -->
                                        <div class="carousel-inner">
                                            <div class="item active">
                                                <img class="img-responsive" src="http://acantiladodebarranco.pe/images/servicio2.jpg" alt="">
                                            </div>
                                        </div>             
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <h3>Confitería:</h3>
                                    <p>Disfruta de las más variada confitería de nuestros locales en todo el Perú, te ofreceremos promociones todos los fines de semana.</p>
                                    <h3>Detalles:</h3>
                                    <ul>
                                        <li>Pop Corn</li>
                                        <li>Gaseosas</li>
                                        <li>Hot Dog</li>
                                        <li>Y mucho más...</li>
                                    </ul>
                                </div>

                            </div>
                        </div>
                        <div class="tab-pane fade" id="service-three">
                            <div class="row">

                                <div class="col-md-8">
                                    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                        <!-- Wrapper for slides -->
                                        <div class="carousel-inner">
                                            <div class="item active">
                                                <img class="img-responsive" src="http://acantiladodebarranco.pe/images/servicio3.jpg" alt="">
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <h3>Confitería:</h3>
                                    <p>Disfruta de las más variada confitería de nuestros locales en todo el Perú, te ofreceremos promociones todos los fines de semana.</p>
                                    <h3>Detalles:</h3>
                                    <ul>
                                        <li>Pop Corn</li>
                                        <li>Gaseosas</li>
                                        <li>Hot Dog</li>
                                        <li>Y mucho más...</li>
                                    </ul>
                                </div>

                            </div>   
                        </div>
                        <div class="tab-pane fade" id="service-four">
                            <div class="row">

                                <div class="col-md-8">
                                    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                        <!-- Wrapper for slides -->
                                        <div class="carousel-inner">
                                            <div class="item active">
                                                <img class="img-responsive" src="http://acantiladodebarranco.pe/images/servicio4.jpg" alt="">
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-md-4">
                                    <h3>Confitería:</h3>
                                    <p>Disfruta de las más variada confitería de nuestros locales en todo el Perú, te ofreceremos promociones todos los fines de semana.</p>
                                    <h3>Detalles:</h3>
                                    <ul>
                                        <li>Pop Corn</li>
                                        <li>Gaseosas</li>
                                        <li>Hot Dog</li>
                                        <li>Y mucho más...</li>
                                    </ul>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <hr>

            <!-- Call to Action Section -->
            <div class="well">
                <div class="row">
                    <div class="col-md-8">
                        <p>Te invitamos a registrarte a nuestro sistema web y puedas visualizar todas las películas de nuestra cartelera y más.</p>
                    </div>
                    <div class="col-md-4">
                        <a class="btn btn-lg btn-success btn-block" href="registro_cliente.jsp">REGÍSTRATE</a>
                    </div>
                </div>
            </div>

            <hr>

            <!-- Footer -->
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
