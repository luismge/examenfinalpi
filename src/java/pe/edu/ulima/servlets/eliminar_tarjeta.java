
package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.dao.GestionDAO;

public class eliminar_tarjeta extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        GestionDAO gestion = new GestionDAO();
        int idTarjeta = Integer.parseInt(request.getParameter("idTarjeta3"));
        
        gestion.eliminarTarjetaSegunID(idTarjeta);

        response.sendRedirect("tarjeta_eliminada.jsp");
        
    }
}
