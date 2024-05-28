import javax.swing.JOptionPane;

public class CelularesDefectuosos extends Celulares{
    private String motivo;
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }   
    private String nombreDueno;
    

    public CelularesDefectuosos(String motivo, String nombreDueno) {
        this.motivo = motivo;
        this.nombreDueno = nombreDueno;
    }
    public CelularesDefectuosos(String marca, String modelo, String numSerie, String motivo, String nombreDueno) {
        super(marca, modelo, numSerie);
        this.motivo = motivo;
        this.nombreDueno = nombreDueno;
    }
    public CelularesDefectuosos() {
        //n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de celulares defectuosos"));
        motivo=JOptionPane.showInputDialog("Ingrese el motivo por el cual el celular esta defectuoso");
        nombreDueno=JOptionPane.showInputDialog("Nombre del dueno del celular defectuoso");  
        
    }
    public String getMotivo() {
        return motivo;
    }
    public String getNombreDueno() {
        return nombreDueno;
    }
    public String datosCelDef()
    {
        return nombreDueno+" "+motivo;
    }

}
