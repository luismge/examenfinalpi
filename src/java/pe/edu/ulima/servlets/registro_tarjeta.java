
package pe.edu.ulima.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.Tarjeta;
import pe.edu.ulima.dao.GestionDAO;


public class registro_tarjeta extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        GestionDAO gestion = new GestionDAO();
        
        String nombre = request.getParameter("nombre");
        String atencion = request.getParameter("atencion");
        float precio = Float.parseFloat(request.getParameter("precio"));
        String dulceria = request.getParameter("dulceria");
        String cumpleanos = request.getParameter("cumpleanos");
        String calendario = request.getParameter("calendario");
        String imagen = request.getParameter("imagen");

        Tarjeta tarjeta = new Tarjeta(nombre, atencion, precio, dulceria, cumpleanos, calendario, imagen);
        
        gestion.registrarTarjeta(tarjeta);
        response.sendRedirect("tarjeta_guardada.jsp");
        
  }
}
