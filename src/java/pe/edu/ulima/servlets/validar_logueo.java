package pe.edu.ulima.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.dao.GestionDAO;

public class validar_logueo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");

        GestionDAO gestioncito = new GestionDAO();

        boolean estado = gestioncito.validarLogueo(correo, contrasena);

        if (estado) {
            //En este caso solo estamos redireccionando a un JSP sin SCRIPTLETS
            //por este motivo usamos "response.sendRedirect"
            //Pero si necesitaramos reenviarlo a un JSP que sí tiene SCRIPTSLETS; entonces,
            //en ese caso sólo necesitariamos ingresar el nombre del SERVLET (este servlet ya tiene un JSP que lo direcciona)
            //Sólo pondríamos así: response.sendRedirect("nombre_de_mi_servlet");
            if (correo.equalsIgnoreCase("admin@tudominio.com") && contrasena.equalsIgnoreCase("admin")) {
                response.sendRedirect("ingreso_al_sistema_admin.jsp");
            }else{
                response.sendRedirect("ingreso_al_sistema.jsp");
            } 
        } else {
            //En este caso redireccionamos a un JSP común SIN SCRIPTLETS por eso sólo
            //ingresamos "registro_cliente_2.jsp""
            response.sendRedirect("no_registrado.jsp");
        }

    }

}

