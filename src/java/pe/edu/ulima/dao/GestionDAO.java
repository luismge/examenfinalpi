package pe.edu.ulima.dao;

import java.util.List;
//import javax.mail.Message;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import pe.edu.ulima.Funcion;
import pe.edu.ulima.FuncionPelicula;
import pe.edu.ulima.Pelicula;
import pe.edu.ulima.Tarjeta;
import pe.edu.ulima.Usuario;
import pe.edu.ulima.Venta;

public class GestionDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    private void conectarse() {
        emf = Persistence.createEntityManagerFactory("Cine_PaltaPU");
        em = emf.createEntityManager();
    }

    private void desconectarse() {
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }

    public void registrarPelicula(Pelicula pelicula) {
        conectarse();

        em.getTransaction().begin();
        em.persist(pelicula);
        em.getTransaction().commit();

        desconectarse();
    }

    public void registrarFuncion(Funcion funcion) {
        conectarse();

        em.getTransaction().begin();
        em.persist(funcion);
        em.getTransaction().commit();

        desconectarse();
    }

    public void registrarUsuario(Usuario usuario) {
        conectarse();

        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();

        desconectarse();
    }

    public void registrarVenta(Venta venta) {
        conectarse();

        em.getTransaction().begin();
        em.persist(venta);
        em.getTransaction().commit();

        desconectarse();
    }

    public void registrarTarjeta(Tarjeta tarjeta) {
        conectarse();

        em.getTransaction().begin();
        em.persist(tarjeta);
        em.getTransaction().commit();

        desconectarse();
    }

    public void registrarFuncionPelicula(FuncionPelicula funcionPelicula) {
        conectarse();

        em.getTransaction().begin();
        em.persist(funcionPelicula);
        em.getTransaction().commit();

        desconectarse();
    }

    public boolean validarLogueo(String correo, String contrasena) {

        conectarse();
        boolean estado = false;
        Query query = em.createQuery(
                "select user from Usuario user where user.correo=:p1 and user.contrasena=:p2");
        query.setParameter("p1", correo);
        query.setParameter("p2", contrasena);

        List<Usuario> usuarios = (List<Usuario>) query.getResultList();
        if (usuarios.size() == 0) {
            estado = false;
        } else {
            estado = true;
        }
        desconectarse();

        return estado;
    }

    public List<Funcion> obtenerFunciones() {
        conectarse();
        List<Funcion> funciones
                = em.createQuery("SELECT f FROM Funcion f").getResultList();
        desconectarse();
        return funciones;
    }

    public List<Pelicula> obtenerPeliculas() {
        conectarse();
        List<Pelicula> peliculas
                = em.createQuery("SELECT p FROM Pelicula p").getResultList();
        desconectarse();
        return peliculas;
    }

    public List<Tarjeta> obtenerTarjetas() {
        conectarse();
        List<Tarjeta> tarjetas
                = em.createQuery("SELECT t FROM Tarjeta t").getResultList();
        desconectarse();
        return tarjetas;
    }

    public Tarjeta obtenerTarjeta(long id) {
        conectarse();

        //Persona persona = em.find(Persona.class, id);
        Query query = em.createQuery(
                "select t from Tarjeta t where t.idTarjeta=:p1");
        query.setParameter("p1", id);
        Tarjeta tarjeta = null;
        try {
            tarjeta = (Tarjeta) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }

        desconectarse();

        return tarjeta;
    }

    public boolean validarCorreo(String correo) {
        conectarse();
        boolean estado = false;
        Query query = em.createQuery(
                "select user from Usuario user where user.correo=:p1");
        query.setParameter("p1", correo);

        List<Usuario> usuarios = (List<Usuario>) query.getResultList();
        if (usuarios.size() == 0) {
            estado = false;
        } else {
            estado = true;
        }
        desconectarse();

        return estado;
    }
    
    public void eliminarTarjetaSegunID(int idTarjeta){
        conectarse();
        
        Tarjeta tarjeta = em.find(Tarjeta.class, idTarjeta);
        em.getTransaction().begin();
        em.remove(tarjeta);
        em.getTransaction().commit();
        
        desconectarse();
    }
    
    public void modificarTarjeta(Tarjeta tarjeta){
        conectarse();
        
        em.getTransaction().begin();
        em.merge(tarjeta);
        em.getTransaction().commit();
        
        desconectarse();
    }
  
    /*
     //Esta clase Email es donde se encuentra toda la lógica.
     public boolean enviarCorreo(String de, String clave, String para, String mensaje, String asunto) {

     boolean enviado = false;

     try {
     String host = "smtp.gmail.com";
     Properties propies = System.getProperties();
     propies.put("mail.smtp.starttls.enable", "true");
     propies.put("mail.smtp.host", host);
     propies.put("mail.smtp.user", de);
     propies.put("mail.smtp.password", clave);
     propies.put("mail.smtp.port", 587);
     propies.put("mail.smtp.auth", "true");
     propies.put("mail.smtp.ssl.trust", host);    
            
     Session sesion;
     sesion = Session.getDefaultInstance(propies, null);

     MimeMessage message = new MimeMessage(sesion);
            
     message.setFrom(new InternetAddress(de));
     message.setRecipient(Message.RecipientType.TO, new InternetAddress(para));
     message.setSubject(asunto);
     message.setContent(mensaje, "text/html; charset=utf-8");
     Transport transport = sesion.getTransport("smtp");
            
     transport.connect(host,de,clave);
     transport.sendMessage(message, message.getAllRecipients());
     transport.close();
     enviado= true;
             
     } catch (Exception ex) {
     ex.printStackTrace();
     }

     return enviado;
     }
     */
}
