package utilidades.jtable.pintar_tablas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import vista.frmProductos;
import static vista.frmProductos.tbListaProductos;

public class pintarProductos {
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
            tbListaProductos.setDefaultRenderer(Double.class, c); 
            tbListaProductos.setDefaultRenderer(String.class, c); 
            tbListaProductos.setDefaultRenderer(Integer.class, c);
                       
            //Colorear celdas
            for (int i = 0; i<frmProductos.tbListaProductos.getColumnCount(); i++){
                tbListaProductos.getColumnModel().getColumn(i).setCellRenderer(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //Método para editar el Header del jtable
    public static void editarHeaderJtable(){
        JTableHeader header = tbListaProductos.getTableHeader();
        header.setFont(new Font("Roboto", Font.BOLD, 16));
        header.setForeground(new Color(0xF1F1F1));
        header.setOpaque(false);
        tbListaProductos.getTableHeader().setBackground(new Color(0x100F0F));
    }
}
