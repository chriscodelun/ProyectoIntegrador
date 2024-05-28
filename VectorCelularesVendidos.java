import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VectorCelularesVendidos {
    private CelularesVendidios vectorVendidos[];
    private int n;
    public VectorCelularesVendidos(int tamano)
    {
        vectorVendidos=new CelularesVendidios[tamano];
        n=tamano;
    }
    public void capturarCelularesVendidos()
    {
        for(int i=0;i<n;i++)
        {
            vectorVendidos[i]=new CelularesVendidios();
        }
    }
    public void mostrarCelularesNuevos()
	{
        String salida="";
		for(int i=0;i<n;i++)
		{
			salida+=vectorVendidos[i].datosCelVendido()+"\n";
		}
        JOptionPane.showMessageDialog(null, salida);
		
		JTextArea area=new JTextArea(10,30);
		area.setText(salida);
		JScrollPane scroll=new JScrollPane(area);
		JOptionPane.showMessageDialog(null,scroll);
		
	}

    
}
