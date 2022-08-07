
package Controlador;

import java.awt.event.ActionListener;
import Modelo.ConsultasCompras;
import Vista.FrmCompras;
import Modelo.AddCompras;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ContrCompras implements ActionListener{
    private AddCompras com;
    private ConsultasCompras modC;
    private FrmCompras frm;

    //Constructor declarando los Action a los botones
    public ContrCompras(AddCompras com, ConsultasCompras modC, FrmCompras frm) {
        this.com = com;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnEditar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscarCodCompra.addActionListener(this);
    }
    
    //Iniciar la vista
    public void iniciar(){
        frm.setTitle("Compras");
        //posición centrada de la ventana
        frm.setLocationRelativeTo(null);
        System.out.println("?");
//Ocultar campo de texto        
//frm.txtCodigoCompra.setVisible(false);
    }
    
    @Override
    //Escucha de los botones CRUD
    public void actionPerformed(ActionEvent e){
        
        //Si se cumple la condicion quiere decir que se presionó el botón
        if(e.getSource() == frm.btnGuardar){
            
            //Tomar los valores de los textField(getText) y meterlos en el modelo(set)
            //com.setCodigo(Integer.parseInt(frm.txtCodigoCompra.getText()));
            com.setFecha(frm.txtFecha.getText());
            com.setCompra_kg(Double.parseDouble(frm.txtCompraKG.getText()));
            com.setObservaciones(frm.jtextObservaciones.getText());
            
            //Llamr método `registrar` del modelo "Consultas" para pasarle los valores anteiores e insertarlos en la DB
            if(modC.registrar(com)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.btnLimpiar){
            limpiar();
        }
    }
    
    public void limpiar(){
        frm.txtCodigoCompra.setText(null);
        frm.txtFecha.setText(null);
        frm.txtCodigoProducto.setText(null);
        frm.txtNombreProducto.setText(null);
        frm.txtCompraKG.setText(null);
        frm.txtPrecioCompra.setText(null);
        frm.txtPrecioVenta.setText(null);
        frm.txtTotalCompra.setText(null);
        frm.jtextObservaciones.setText(null);
        frm.txtCampoBuscar.setText(null);
    }
}
