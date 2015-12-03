
package pe.edu.ulima;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table(name = "Pelicula")
    public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idPelicula;
    @Column
    private String nombre;
    @Column
    private String tituloOriginal;
    @Column
    private String genero;
    @Column
    private String director;
    @Column
    private String duracion;
    @Column
    private float precio;
    @Column
    private int censura;
    @Column
    private String sinopsis;
    @Column
    private String pais;
    @Column
    private String img;

    public Pelicula() {
    }

    public Pelicula(String nombre, String tituloOriginal, String genero, String director, String duracion, float precio, int censura, String sinopsis, String pais, String img) {
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
        this.precio = precio;
        this.censura = censura;
        this.sinopsis = sinopsis;
        this.pais = pais;
        this.img = img;
    }

    public long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCensura() {
        return censura;
    }

    public void setCensura(int censura) {
        this.censura = censura;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    

}
