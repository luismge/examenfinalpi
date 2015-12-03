
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

public class obtener_tarjetas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Tarjeta> tarjetas = new GestionDAO().obtenerTarjetas();
        
        RequestDispatcher rd = request.getRequestDispatcher("tarjetas.jsp");
        request.setAttribute("listaTarjetas", tarjetas);  
        rd.forward(request, response);   
        
    }

    }
