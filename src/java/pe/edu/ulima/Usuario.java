
package pe.edu.ulima;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idUsuario;
    @Column
    private String apellidoP;
    @Column
    private String apellidoM;
    @Column
    private String nombres;
    @Column
    private int edad;
    @Column
    private String genero;
    @Column
    private String correo;
    //FALTA AGREGAR EL ATRIBUTO "CONTRASEÑA"
    @Column
    private String contrasena;
    @ManyToOne//(fetch = FetchType.LAZY) 
    private Tarjeta idTarjeta;

    public Usuario() {
    }

    public Usuario(String apellidoP, String apellidoM, String nombres, 
            int edad, String genero, String correo, String contrasena, Tarjeta idTarjeta) {
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.nombres = nombres;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
        this.contrasena = contrasena;
        this.idTarjeta = idTarjeta;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Tarjeta getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Tarjeta idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

        
    
    
}
