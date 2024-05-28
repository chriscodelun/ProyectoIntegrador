import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VectorCelularesDefectuosos {
    private CelularesDefectuosos vectorDefectuosos[];
    private int n;

    /*
     *     public VectorCelulares(Celulares[] vectorDefectuosos) {
        this.vectorDefectuosos = vectorDefectuosos;
    }
     */
    public VectorCelularesDefectuosos(int tamano)
    {
        vectorDefectuosos=new CelularesDefectuosos [tamano];
        n=tamano;
    }
    public void capturarCelularesDefectuosos()
	{
 
		for(int i=0;i<n;i++)
		{
			vectorDefectuosos[i]=new CelularesDefectuosos();
		}
        
	}
    public void mostrarCelularesDefectuosos()
	{
        String salida="";
		for(int i=0;i<n;i++)
		{
			salida+=vectorDefectuosos[i].datosCelDef()+"\n";
		}
        JOptionPane.showMessageDialog(null, salida);
		
		JTextArea area=new JTextArea(10,30);
		area.setText(salida);
		JScrollPane scroll=new JScrollPane(area);
		JOptionPane.showMessageDialog(null,scroll);
		
	}
    public void cambiarMotivoCelDef()
    {
        String motivo = JOptionPane.showInputDialog("Ingrese el numero de serie del celular al que le cambiara el motivo de defecto");
        for (int i = 0; i < n; i++) {
            if (motivo.equalsIgnoreCase(vectorDefectuosos[i].getNumSerie())) {
                String nuevoMotivo = JOptionPane.showInputDialog("Ingrese el nuevo motivo");
                vectorDefectuosos[i].setMotivo(nuevoMotivo);
            }
        }
    }


    
    
}
