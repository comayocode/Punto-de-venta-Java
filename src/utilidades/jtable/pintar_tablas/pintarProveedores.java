package utilidades.jtable.pintar_tablas;

import java.awt.Color;
import java.awt.Font;
import utilidades.jtable.color_intercalado.colorIntercaladoCeldasJTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import vista.frmProveedores;
import static vista.frmProveedores.tbListaProveedores;

public class pintarProveedores {
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
            tbListaProveedores.setDefaultRenderer(Double.class, c); 
            tbListaProveedores.setDefaultRenderer(String.class, c); 
            tbListaProveedores.setDefaultRenderer(Integer.class, c);
                       
            //Colorear celdas
            for (int i = 0; i<frmProveedores.tbListaProveedores.getColumnCount(); i++){
                tbListaProveedores.getColumnModel().getColumn(i).setCellRenderer(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //Método para editar el Header del jtable
    public static void editarHeaderJtable(){
        JTableHeader header = tbListaProveedores.getTableHeader();
        header.setFont(new Font("Roboto", Font.BOLD, 16));
        header.setForeground(new Color(0xF1F1F1));
        header.setOpaque(false);
        tbListaProveedores.getTableHeader().setBackground(new Color(0x100F0F));
    }
}
