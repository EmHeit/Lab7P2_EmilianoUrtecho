public class Usuarios {
    private String nombre;
    private String nombreU;
    private String password;
    private int saldo;

    public Usuarios() {
    }

    public Usuarios(String nombre, String nombreU, String password, int saldo) {
        this.nombre = nombre;
        this.nombreU = nombreU;
        this.password = password;
        this.saldo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuarios: \n\n"
                + "Nombre Original: " + nombre + "\n\n"
                + "Nombre de Usuuario: " + nombreU + "\n\n"
                + "Password: " + password + "\n\n"
                + "Saldo: " + saldo;
    }
    
    public void CrearUsuario(){
        
    }
    
    
}
