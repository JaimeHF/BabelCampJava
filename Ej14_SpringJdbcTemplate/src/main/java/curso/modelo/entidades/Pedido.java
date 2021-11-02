package curso.modelo.entidades;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope("Prototype")
public class Pedido {

    private int id;
    private double importe;
    private Date fecha;


    public Pedido() {
    }

    public Pedido(int id, double importe, Date fecha, int clienteId) {
        this.id = id;
        this.importe = importe;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void getFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", importe=" + importe +
                ", fecha=" + fecha +
                '}';
    }

    public void getFecha(java.sql.Date fecha) {
    }
}
