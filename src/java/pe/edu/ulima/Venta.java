
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
@Table(name = "Venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idVenta;
    @Column
    private float precioU;
    @Column
    private int cantEntradas;
    @Column
    private float montoTotal;
    @ManyToOne //(fetch = FetchType.LAZY) 
    private FuncionPelicula idFuncionPelicula;
    @ManyToOne //(fetch = FetchType.LAZY) 
    private Usuario idUsuario;

    public Venta() {
    }

    public Venta(float precioU, int cantEntradas, float montoTotal, FuncionPelicula idFuncionPelicula, Usuario idUsuario) {
        this.precioU = precioU;
        this.cantEntradas = cantEntradas;
        this.montoTotal = montoTotal;
        this.idFuncionPelicula = idFuncionPelicula;
        this.idUsuario = idUsuario;
    }

    public long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(long idVenta) {
        this.idVenta = idVenta;
    }

    public float getPrecioU() {
        return precioU;
    }

    public void setPrecioU(float precioU) {
        this.precioU = precioU;
    }

    public int getCantEntradas() {
        return cantEntradas;
    }

    public void setCantEntradas(int cantEntradas) {
        this.cantEntradas = cantEntradas;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public FuncionPelicula getIdFuncionPelicula() {
        return idFuncionPelicula;
    }

    public void setIdFuncionPelicula(FuncionPelicula idFuncionPelicula) {
        this.idFuncionPelicula = idFuncionPelicula;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    

}

