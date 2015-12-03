
package pe.edu.ulima;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idTarjeta;
    @Column
    private String nombre;
    @Column
    private String atencion;
    @Column
    private float precio;
    @Column
    private String dulceria;
    @Column
    private String cumpleanos;
    @Column
    private String calendario;
    @Column
    private String img;
    
    public Tarjeta() {
    }

    public Tarjeta(String nombre, String atencion, float precio, String dulceria, String cumpleanos, String calendario, String img) {
        this.nombre = nombre;
        this.atencion = atencion;
        this.precio = precio;
        this.dulceria = dulceria;
        this.cumpleanos = cumpleanos;
        this.calendario = calendario;
        this.img = img;
    }

    public long getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(long idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDulceria() {
        return dulceria;
    }

    public void setDulceria(String dulceria) {
        this.dulceria = dulceria;
    }

    public String getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(String cumpleanos) {
        this.cumpleanos = cumpleanos;
    }

    public String getCalendario() {
        return calendario;
    }

    public void setCalendario(String calendario) {
        this.calendario = calendario;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    

        
}
