public class Productos {
    private String nombreP;
    private double precio;

    public Productos() {
    }

    public Productos(String nombreP, double precio) {
        this.nombreP = nombreP;
        this.precio = precio;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
