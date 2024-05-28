public class CelularesVendidios extends Celulares{
    private String fechaVenta;
    private int precioVenta;
    public CelularesVendidios(String fechaVenta, int precioVenta) {
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
    }
    public CelularesVendidios(String marca, String modelo, String numSerie, String fechaVenta, int precioVenta) {
        super(marca, modelo, numSerie);
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
    }

    
}
