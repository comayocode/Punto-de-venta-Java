package Controlador;

import java.awt.event.ActionListener;
import Modelo.ConsultasProducto;
import Modelo.AddProducto;
import Vista.FrmAddProducto;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import Vista.VistaProductosAgregar;

public class ContrProducto implements ActionListener{
    private AddProducto mod;
    private ConsultasProducto modC;
    private FrmAddProducto frm;
    //private VistaProductosAgregar frm;
    
    public ContrProducto(AddProducto mod, ConsultasProducto modC, FrmAddProducto frm){
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
        /*
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);   
        */
    }
    
    public void iniciar(){
        frm.setTitle("Productos");
        frm.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == frm.btnGuardar){
            mod.setNombre(frm.txtNombre.getText());
            mod.setPrecio_compra(Integer.parseInt(frm.txtPrecio_compra.getText()));
            mod.setPrecio_venta(Integer.parseInt(frm.txtPrecio_venta.getText()));
            
            if(modC.registrar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if(e.getSource() == frm.btnModificar){
            mod.setNombre(frm.txtNombre.getText());
            mod.setPrecio_compra(Integer.parseInt(frm.txtPrecio_compra.getText()));
            mod.setPrecio_venta(Integer.parseInt(frm.txtPrecio_venta.getText()));
            
            if(modC.modificar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if(e.getSource() == frm.btnEliminar){
            mod.setCodigo(Integer.parseInt(frm.txtCodigo.getText()));
            if(modC.eliminar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if(e.getSource() == frm.btnBuscar){
            mod.setNombre(frm.txtNombre.getText());
            if(modC.buscar(mod)){
                
                frm.txtCodigo.setText(String.valueOf(mod.getCodigo()));
                frm.txtNombre.setText(mod.getNombre());
                frm.txtPrecio_compra.setText(String.valueOf(mod.getPrecio_compra()));
                frm.txtPrecio_venta.setText(String.valueOf(mod.getPrecio_venta()));
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron registros");
                limpiar();
            }
        }
        
        if(e.getSource() == frm.btnLimpiar){
            limpiar();
        }
    }
    
    
    
    
    public void limpiar(){
        frm.txtCodigo.setText(null);
        frm.txtNombre.setText(null);
    }

}
