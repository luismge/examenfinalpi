
package pe.edu.ulima.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.Funcion;
import pe.edu.ulima.FuncionPelicula;
import pe.edu.ulima.Pelicula;
import pe.edu.ulima.Tarjeta;
import pe.edu.ulima.Usuario;
import pe.edu.ulima.Venta;
import pe.edu.ulima.dao.GestionDAO;


public class llenar_registros extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Pelicula pel1= new Pelicula();
        
        pel1.setNombre("Lovely Bones");
        pel1.setTituloOriginal("The Avengers");
        pel1.setGenero("Drama");
        pel1.setDirector("James Cameron");  
        pel1.setDuracion("144");
        pel1.setPrecio(15.0f);
        pel1.setCensura(18);
        pel1.setSinopsis("ahglajgnajbn");
        pel1.setPais("pais");
        pel1.setImg("imagen");
        
        
        Funcion fun1 = new Funcion();
        //set atributes
        fun1.setHora("14:50");
        fun1.setFecha("03-09-15");
        
        
        Tarjeta tar1 = new Tarjeta();
        //set atributes
        tar1.setNombre("tarjeta");
        tar1.setAtencion("atencion");
        tar1.setPrecio(15.5f);
        tar1.setDulceria("dulceria");
        tar1.setCumpleanos("01/Oct/2000");
        tar1.setCalendario("calendario");
        tar1.setImg("tarjeta1.png");
        
        Usuario user1 = new Usuario();
        //set atributes
        user1.setApellidoP("Casas");
        user1.setApellidoM("Flores");
        user1.setNombres("Pepe");
        user1.setEdad(26);
        user1.setGenero("M");
        user1.setCorreo("pepe@gmail.com");
        user1.setContrasena("123456");
        user1.setIdTarjeta(tar1);
        
        FuncionPelicula pf1= new FuncionPelicula();
        //set atributes
        pf1.setIdFuncion(fun1);
        pf1.setIdpelicula(pel1);
        pf1.setSala("3");
                
        Venta vent1 = new Venta();
        //set atributes
        vent1.setPrecioU(13.0f);
        vent1.setCantEntradas(4);
        vent1.setMontoTotal(3.0f);
        vent1.setIdFuncionPelicula(pf1);
        vent1.setIdUsuario(user1);

        GestionDAO dao = new GestionDAO();
        
        dao.registrarPelicula(pel1);
        dao.registrarFuncion(fun1);
        dao.registrarTarjeta(tar1);
        dao.registrarUsuario(user1);
        dao.registrarFuncionPelicula(pf1);
        dao.registrarVenta(vent1);
        
        response.sendRedirect("registros_ingresados.jsp");
        }
        
    }

