package utilidades.jtable.pintar_tablas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import vista.frmComprasLista;
import static vista.frmComprasLista.tbListaCompras;


public class pintarComprasLista {
    public static void pintar(){
        try {
            //Crear modelo de la tabla. POR EL MOMENTO NO HACE NINGUNA FUNCION
            DefaultTableModel modelo = new DefaultTableModel(){
                
                //Desabilitar la edicion en celdas
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            //Nueva instancia de la clase que contiene el formato
            colorIntercaladoCeldasJTable c = new colorIntercaladoCeldasJTable();
        
            //Se obtiene la tabla y se establece el formato para cada tipo de dato
            tbListaCompras.setDefaultRenderer(Double.class, c); 
            tbListaCompras.setDefaultRenderer(String.class, c); 
            tbListaCompras.setDefaultRenderer(Integer.class, c);
            
            //Colorear celdas
            for (int i = 0; i<frmComprasLista.tbListaCompras.getColumnCount(); i++){
                tbListaCompras.getColumnModel().getColumn(i).setCellRenderer(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //Método para editar el Header del jtable
    public static void editarHeaderJtable(){
        JTableHeader header = tbListaCompras.getTableHeader();
        header.setFont(new Font("Roboto", Font.BOLD, 16));
        header.setForeground(new Color(0xF1F1F1));
        header.setOpaque(false);
        tbListaCompras.getTableHeader().setBackground(new Color(0x100F0F));
    }
}
