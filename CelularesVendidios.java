import javax.swing.JOptionPane;

public class CelularesVendidios extends Celulares{
    private String fechaVenta;
    private int precioVenta;
    
    public CelularesVendidios() {
        boolean ban=true;
        fechaVenta=JOptionPane.showInputDialog("Ingrese la fecha de la venta del celular");
        while (ban) {
            try{
                precioVenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de venta: "));
                ban=false;
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Vuelva a ingresar el precio,(solo valores numericos)");
            }
        }
        
    }
    public CelularesVendidios(String fechaVenta, int precioVenta) {
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
    }
    public CelularesVendidios(String marca, String modelo, String numSerie, String fechaVenta, int precioVenta) {
        super(marca, modelo, numSerie);
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
    }
    public String datosCelVendido()
    {
        return fechaVenta+" "+precioVenta;
    }

    
}
