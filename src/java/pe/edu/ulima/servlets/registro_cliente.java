package pe.edu.ulima.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.Tarjeta;
import pe.edu.ulima.Usuario;
import pe.edu.ulima.dao.GestionDAO;

public class registro_cliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GestionDAO gestion = new GestionDAO();

        String nombre = request.getParameter("nombre");
        String apellidoP = request.getParameter("ap_paterno");
        String apellidoM = request.getParameter("ap_materno");
        String genero = request.getParameter("genero");
        int edad = Integer.parseInt(request.getParameter("edad"));
        int tipo_tarjeta = Integer.parseInt(request.getParameter("tipo_tarjeta"));
        String correo = request.getParameter("correo");
        String password = request.getParameter("contrasena");

        boolean estado = gestion.validarCorreo(correo);

        if (estado) {
            response.sendRedirect("usuario_existente.jsp");
        } else {
            Tarjeta tarjeta = gestion.obtenerTarjeta(tipo_tarjeta);

            //Obtenemos un objeto tarjeta cuyo ID sea "tipo_tarjeta"
            Usuario user = new Usuario(apellidoP, apellidoM, nombre, edad, genero, correo, password, tarjeta);
            gestion.registrarUsuario(user);
            response.sendRedirect("cliente_guardado.jsp");
        }

    }

}
