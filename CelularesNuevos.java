import javax.swing.JOptionPane;

public class CelularesNuevos extends Celulares{
    private int precio;
    private String fechaIngreso;
    
    
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    public CelularesNuevos() {
        fechaIngreso=JOptionPane.showInputDialog("Fecha de ingreso del celular");
        precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del celular"));
          
    }
    public String datosCelNuevo()
    {
        return fechaIngreso+" "+precio;
    }
    

    public CelularesNuevos(int precio, String fechaIngreso) {
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
    }
    public CelularesNuevos(String marca, String modelo, String numSerie, int precio, String fechaIngreso) {
        super(marca, modelo, numSerie);
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
    }
    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getFechaIngreso() {
        return fechaIngreso;
    }


    
}
