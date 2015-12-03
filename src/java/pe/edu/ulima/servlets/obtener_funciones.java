
package pe.edu.ulima.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.Funcion;
import pe.edu.ulima.dao.GestionDAO;

public class obtener_funciones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        GestionDAO gestioncito = new GestionDAO();
        List<Funcion> funciones = gestioncito.obtenerFunciones();
        
        RequestDispatcher rd = request.getRequestDispatcher("cartelera.jsp");
        request.setAttribute("listaFunciones", funciones);  
        rd.forward(request, response);   
    }
  
}
