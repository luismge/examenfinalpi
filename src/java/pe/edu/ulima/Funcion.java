package pe.edu.ulima;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Funcion")
public class Funcion {

    //Atributos:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(name = "hora")
    private String hora;
    @Column(name = "fecha")
    private String fecha;

    //Constructores:
    public Funcion() {
    }

    public Funcion(String hora, String fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }

    //Getter and setter:
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
