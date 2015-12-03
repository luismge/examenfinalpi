package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.dao.GestionDAO;

public class enviar_email extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
         GestionDAO gestioncito = new GestionDAO();
         //String correoAdministrador = request.getParameter("correoAdministrador");
         String nombre = request.getParameter("correoEmpleado");
         String apellido_paterno = request.getParameter("ap_paterno");
         String apellido_materno = request.getParameter("ap_materno");
         String genero = request.getParameter("genero");
         int edad = Integer.parseInt(request.getParameter("edad"));
         int tipo_tarjeta = Integer.parseInt(request.getParameter("tipo_tarjeta"));
         String correo = request.getParameter("correo");
         String contrasena = request.getParameter("contrasena");
         //(String de, String clave, String para, String mensaje, String asunto)
         gestioncito.enviarCorreo("cinepalta2@gmail.com", "djpeligro10", correo, 
         "<!DOCTYPE html>\n" +
         "<!--\n" +
         "To change this license header, choose License Headers in Project Properties.\n" +
         "To change this template file, choose Tools | Templates\n" +
         "and open the template in the editor.\n" +
         "-->\n" +

         "        <html>\n"+
         "<head>\n"+
         "<title>CINE PALTA</title>\n"+
         "<meta charset=\"UTF-8\">\n"+
         "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"+
         "<style type=\"text/css\">"+
         "body {\n"+
         "background-image: url(http://acantiladodebarranco.pe/images/mensaje1.png)\n"+
         "background-repeat: no-repeat;\n"+
         "}\n"+
         "</style>\n"+
         "</head>\n"+
         "<body>\n"+

         "<div class=\"container\">\n"+  
         "<div class=\"row\" style=\"margin-left: 60px; margin-top: 30px;\">\n"+
         "<div class=\"col-lg-12\" style=\"width: 500px;\">\n"+
         "<p style=\"text-align: center; font-size: 16px;\">Ud. ha sido registrado a nuestro sistema web, le enviamos su usuario y su contraseña para que pueda acceder. No olvide que estos datos son personales:</p>\n"+
         "<p style=\"text-align: center; font-size: 16px;\">Su usuario es <span style=\"font-weight: bold; color: #ff3333\"> "+ correo + "</span> y su contraseña es <span style=\"font-weight: bold; color: #ff3333\">"+ contrasena +"</span></p>\n"+
         "                </div>\n"+
         "</div>\n"+
         "</div>\n"+
         "</body>\n"+
         "</html>\n"+
        
         "" , "CONFIRMACIÓN DE REGISTRO - CINEPALTA - PROGRAMACIÓN INTERNET");
       
        
         response.sendRedirect("cliente_guardado.jsp");
        
         }
         */
    }
}
