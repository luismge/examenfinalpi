
package pe.edu.ulima.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.Tarjeta;
import pe.edu.ulima.dao.GestionDAO;

public class ver_detalles_tarjeta extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       GestionDAO gestion = new GestionDAO();    
       int idTarjeta = Integer.parseInt(request.getParameter("idTarjeta"));
               
       Tarjeta tarjetita = gestion.obtenerTarjeta(idTarjeta);

        RequestDispatcher rd = request.getRequestDispatcher("tarjeta_detalles.jsp");
        request.setAttribute("tarjeta", tarjetita);

        rd.forward(request, response);
    }
    
}
