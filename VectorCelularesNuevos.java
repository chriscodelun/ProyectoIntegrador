import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VectorCelularesNuevos {
    private CelularesNuevos vectorNuevos[];
    private int n;
    public VectorCelularesNuevos(int tamano)
    {
        vectorNuevos=new CelularesNuevos[tamano];
        n=tamano;
    }

    public void capturarCelularesNuevos()
    {
        for(int i=0;i<n;i++)
        {
            vectorNuevos[i]=new CelularesNuevos();
        }
    }
    public void mostrarCelularesNuevos()
	{
        String salida="";
		for(int i=0;i<n;i++)
		{
			salida+=vectorNuevos[i].datosCelNuevo()+"\n";
		}
        JOptionPane.showMessageDialog(null, salida);
		
		JTextArea area=new JTextArea(10,30);
		area.setText(salida);
		JScrollPane scroll=new JScrollPane(area);
		JOptionPane.showMessageDialog(null,scroll);
		
	}
    public void cambirPrecioCelNuevo()
    {
        String numeroSerie=JOptionPane.showInputDialog("Ingrese el nuevo precio del celular");
        for(int i=0;i<n;i++)
        {
            if(numeroSerie.equalsIgnoreCase(vectorNuevos[i].getNumSerie()))
            {
                int nuevoPrecio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio"));
                vectorNuevos[i].setPrecio(nuevoPrecio);
            }
        }
    }
    
}
