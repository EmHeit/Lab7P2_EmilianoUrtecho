
import java.util.List;

public class Restaurantes {
    private String nombre;
    private String ubicacion;
    private int saldo;
    private List<Productos> product;

    public Restaurantes() {
    }

    public Restaurantes(String nombre, String ubicacion, int saldo, List<Productos> product) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.saldo = saldo;
        this.product = product;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public List<Productos> getProduct() {
        return product;
    }

    public void setProduct(List<Productos> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Restaurantes\n\n"
                +"Nombre Original: " + nombre + "\n\n"
                + "Ubicacion: " + ubicacion + "\n\n"
                + "Saldo: " + saldo + "\n\n"
                + "Producto: " + product;
    }
    
    
    
}
