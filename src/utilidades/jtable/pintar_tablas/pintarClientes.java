package utilidades.jtable.pintar_tablas;

import java.awt.Color;
import java.awt.Font;
import utilidades.jtable.color_intercalado.colorIntercaladoCeldasJTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import vista.frmClientes;
import static vista.frmClientes.tbListaClientes;

public class pintarClientes {
    public static void pintar(){
        try {
            //Crear modelo de la tabla
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
            tbListaClientes.setDefaultRenderer(Double.class, c); 
            tbListaClientes.setDefaultRenderer(String.class, c); 
            tbListaClientes.setDefaultRenderer(Integer.class, c);
                       
            //Colorear celdas
            for (int i = 0; i<frmClientes.tbListaClientes.getColumnCount(); i++){
                tbListaClientes.getColumnModel().getColumn(i).setCellRenderer(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //Método para editar el Header del jtable
    public static void editarHeaderJtable(){
        JTableHeader header = tbListaClientes.getTableHeader();
        header.setFont(new Font("Roboto", Font.BOLD, 16));
        header.setForeground(new Color(0xF1F1F1));
        header.setOpaque(false);
        tbListaClientes.getTableHeader().setBackground(new Color(0x100F0F));
    }
}
