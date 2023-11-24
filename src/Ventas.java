
import java.util.ArrayList;
import java.util.List;

public class Ventas {
    ArrayList<Usuarios> usuario;
    ArrayList<Restaurantes> restaurante;
    List<Productos> productos;
    private double precio;

    public Ventas() {
    }

    public Ventas(ArrayList<Usuarios> usuario, ArrayList<Restaurantes> restaurante, List<Productos> productos, double precio) {
        this.usuario = usuario;
        this.restaurante = restaurante;
        this.productos = productos;
        this.precio = precio;
    }

    public ArrayList<Usuarios> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuarios> usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Restaurantes> getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(ArrayList<Restaurantes> restaurante) {
        this.restaurante = restaurante;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
