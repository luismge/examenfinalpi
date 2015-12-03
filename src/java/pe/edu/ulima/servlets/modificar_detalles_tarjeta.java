package pe.edu.ulima.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.Tarjeta;
import pe.edu.ulima.dao.GestionDAO;

public class modificar_detalles_tarjeta extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GestionDAO gestion = new GestionDAO();
        int idTarjeta = Integer.parseInt(request.getParameter("idTarjeta2"));

        Tarjeta tarjetita = gestion.obtenerTarjeta(idTarjeta);      

        RequestDispatcher rd = request.getRequestDispatcher("tarjeta_modificada.jsp");
        request.setAttribute("tarjeta2", tarjetita);

        rd.forward(request, response);
    }

}
