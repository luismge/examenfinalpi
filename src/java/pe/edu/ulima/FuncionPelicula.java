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
@Table(name = "FuncionPelicula")
public class FuncionPelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idFuncionPelicula;
    @ManyToOne//(fetch = FetchType.LAZY) 
    private Pelicula idpelicula;
    @ManyToOne//(fetch = FetchType.LAZY) 
    private Funcion idFuncion;
    @Column
    private String sala;

    //Constructores:
    public FuncionPelicula() {
    }

    public FuncionPelicula(Pelicula idpelicula, Funcion idFuncion, String sala) {
        this.idpelicula = idpelicula;
        this.idFuncion = idFuncion;
        this.sala = sala;
    }
    
    //Getter and Setter:
    public long getIdFuncionPelicula() {
        return idFuncionPelicula;
    }

    public void setIdFuncionPelicula(long idFuncionPelicula) {
        this.idFuncionPelicula = idFuncionPelicula;
    }

    public Pelicula getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(Pelicula idpelicula) {
        this.idpelicula = idpelicula;
    }

    public Funcion getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Funcion idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
}
