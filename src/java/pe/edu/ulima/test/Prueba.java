package pe.edu.ulima.test;

import pe.edu.ulima.Funcion;
import pe.edu.ulima.FuncionPelicula;
import pe.edu.ulima.Pelicula;
import pe.edu.ulima.Tarjeta;
import pe.edu.ulima.Usuario;
import pe.edu.ulima.Venta;
import pe.edu.ulima.dao.GestionDAO;

public class Prueba {

    public static void main(String[] args) {
        //set atributes
        Pelicula pel1 = new Pelicula();
        Pelicula pel2 = new Pelicula();
        Pelicula pel3 = new Pelicula();

        pel1.setNombre("Lovely Bones");
        pel1.setTituloOriginal("The Avengers");
        pel1.setGenero("Drama");
        pel1.setDirector("James Cameron");
        pel1.setDuracion("144");
        pel1.setPrecio(15.0f);
        pel1.setCensura(18);
        pel1.setSinopsis("Historia basada en...");
        pel1.setPais("USA");
        pel1.setImg("pela1.png");

        pel2.setNombre("The Avengers");
        pel2.setTituloOriginal("Caperucita");
        pel2.setGenero("Acción");
        pel2.setDirector("Tom Crouse");
        pel2.setDuracion("50");
        pel2.setPrecio(18.0f);
        pel2.setCensura(18);
        pel2.setSinopsis("Cuenta la historia...");
        pel2.setPais("Perú");
        pel2.setImg("pela2.png");

        pel3.setNombre("Hulk");
        pel3.setTituloOriginal("La torre");
        pel3.setGenero("Comedia");
        pel3.setDirector("Brad Pitt");
        pel3.setDuracion("70");
        pel3.setPrecio(25.0f);
        pel3.setCensura(14);
        pel3.setSinopsis("Cuenta la historia...");
        pel3.setPais("Chile");
        pel3.setImg("pela3.png");

        Funcion fun1 = new Funcion();
        Funcion fun2 = new Funcion();
        Funcion fun3 = new Funcion();
        //set atributes
        fun1.setHora("18:50");
        fun1.setFecha("03-09-15");

        fun2.setHora("20:30");
        fun2.setFecha("03-09-15");

        fun3.setHora("22:00");
        fun3.setFecha("03-09-15");

        Tarjeta tar1 = new Tarjeta();
        Tarjeta tar2 = new Tarjeta();
        Tarjeta tar3 = new Tarjeta();
        //set atributes
        tar1.setNombre("Celeste");
        tar1.setAtencion("atencion");
        tar1.setPrecio(15.5f);
        tar1.setDulceria("dulceria");
        tar1.setCumpleanos("01/Oct/2000");
        tar1.setCalendario("calendario");
        tar1.setImg("tarjeta1.png");

        tar2.setNombre("Verde");
        tar2.setAtencion("atencion");
        tar2.setPrecio(18.5f);
        tar2.setDulceria("dulceria");
        tar2.setCumpleanos("01/Oct/2000");
        tar2.setCalendario("calendario");
        tar2.setImg("tarjeta2.png");

        tar3.setNombre("Morada");
        tar3.setAtencion("atencion");
        tar3.setPrecio(19.5f);
        tar3.setDulceria("dulceria");
        tar3.setCumpleanos("01/Oct/2000");
        tar3.setCalendario("calendario");
        tar3.setImg("tarjeta3.png");

        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();
        Usuario user3 = new Usuario();
        //set atributes
        user1.setApellidoP("Casas");
        user1.setApellidoM("Flores");
        user1.setNombres("Pepe");
        user1.setEdad(22);
        user1.setGenero("M");
        user1.setCorreo("pepe@gmail.com");
        user1.setContrasena("123456");
        user1.setIdTarjeta(tar1);

        user2.setApellidoP("Rosas");
        user2.setApellidoM("Ávila");
        user2.setNombres("Mario");
        user2.setEdad(26);
        user2.setGenero("M");
        user2.setCorreo("mario@gmail.com");
        user2.setContrasena("123456");
        user2.setIdTarjeta(tar2);

        user3.setApellidoP("Salinas");
        user3.setApellidoM("Sánchez");
        user3.setNombres("María");
        user3.setEdad(36);
        user3.setGenero("F");
        user3.setCorreo("maria@gmail.com");
        user3.setContrasena("123456");
        user3.setIdTarjeta(tar3);

        FuncionPelicula pf1 = new FuncionPelicula();
        FuncionPelicula pf2 = new FuncionPelicula();
        FuncionPelicula pf3 = new FuncionPelicula();
        //set atributes
        pf1.setIdFuncion(fun1);
        pf1.setIdpelicula(pel1);
        pf1.setSala("1");
        
        pf2.setIdFuncion(fun2);
        pf2.setIdpelicula(pel2);
        pf2.setSala("2");
        
        pf3.setIdFuncion(fun3);
        pf3.setIdpelicula(pel3);
        pf3.setSala("3");

        Venta vent1 = new Venta();
        Venta vent2 = new Venta();
        Venta vent3 = new Venta();
        //set atributes
        vent1.setPrecioU(15.0f);
        vent1.setCantEntradas(4);
        vent1.setMontoTotal(60.0f);
        vent1.setIdFuncionPelicula(pf1);
        vent1.setIdUsuario(user1);
        
        vent2.setPrecioU(13.0f);
        vent2.setCantEntradas(4);
        vent2.setMontoTotal(42.0f);
        vent2.setIdFuncionPelicula(pf2);
        vent2.setIdUsuario(user2);
        
        vent3.setPrecioU(18.0f);
        vent3.setCantEntradas(4);
        vent3.setMontoTotal(72.0f);
        vent3.setIdFuncionPelicula(pf3);
        vent3.setIdUsuario(user3);

        GestionDAO dao = new GestionDAO();

        dao.registrarPelicula(pel1);
        dao.registrarFuncion(fun1);
        dao.registrarTarjeta(tar1);
        dao.registrarUsuario(user1);
        dao.registrarFuncionPelicula(pf1);
        dao.registrarVenta(vent1);
        
        dao.registrarPelicula(pel2);
        dao.registrarFuncion(fun2);
        dao.registrarTarjeta(tar2);
        dao.registrarUsuario(user2);
        dao.registrarFuncionPelicula(pf2);
        dao.registrarVenta(vent2);
        
        dao.registrarPelicula(pel3);
        dao.registrarFuncion(fun3);
        dao.registrarTarjeta(tar3);
        dao.registrarUsuario(user3);
        dao.registrarFuncionPelicula(pf3);
        dao.registrarVenta(vent3);

    }

}
