package curso.modelo.entidades;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("Prototype")
public class Cliente {

    private int id;
    private String nombre;
    private int edad;
    private List<Pedido> listPedido;

    public Cliente() {
    }

    public Cliente(int id, String nombre, int edad, List<Pedido> listPedido) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.listPedido = listPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Pedido> getListPedido() {
        return listPedido;
    }

    public void setListPedido(List<Pedido> listPedido) {
        this.listPedido = listPedido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", listPedido=" + listPedido +
                '}';
    }
}
