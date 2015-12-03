
package pe.edu.ulima.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.Funcion;
import pe.edu.ulima.Pelicula;
import pe.edu.ulima.dao.GestionDAO;

public class obtener_peliculas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //List<Persona> personas = new PersonaDAO().obtenerPersonas();
        /*GestionDAO gestion = new GestionDAO();
        List<Pelicula> peliculas1= gestion.obtenerPeliculas();*/
        List<Pelicula> peliculas = new GestionDAO().obtenerPeliculas();
        //Este servlet envía los datos a "cartelera.jsp"
        RequestDispatcher rd = request.getRequestDispatcher("carteleraLogin.jsp");
        request.setAttribute("listaPeliculas", peliculas);  
        rd.forward(request, response);   
    }

}
