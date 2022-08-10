
package Controlador;

import java.awt.event.ActionListener;
import Modelo.ConsultasCompras;
import Vista.FrmCompras;
import Modelo.AddCompras;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ContrCompras implements ActionListener{
    private AddCompras com;
    private ConsultasCompras modCom;
    private FrmCompras frmCom;

    //Constructor declarando los Action a los botones
    public ContrCompras(AddCompras com, ConsultasCompras modCom, FrmCompras frmCom) {
        this.com = com;
        this.modCom = modCom;
        this.frmCom = frmCom;
        this.frmCom.btnGuardar.addActionListener(this);
        this.frmCom.btnEditar.addActionListener(this);
        this.frmCom.btnEliminar.addActionListener(this);
        this.frmCom.btnLimpiar.addActionListener(this);
        this.frmCom.btnBuscarCodCompra.addActionListener(this);
    }
  
    
    //Iniciar la vista
    public void iniciar(){
        frmCom.setTitle("Compras");
        //posición centrada de la ventana
        frmCom.setLocationRelativeTo(null);
        //Ocultar campo de texto        
        //frm.txtCodigoCompra.setVisible(false);
        
    }
    
    @Override
    //Escucha de los botones CRUD
    public void actionPerformed(ActionEvent e){
        
        //Si se cumple la condicion quiere decir que se presionó el botón
        if(e.getSource() == frmCom.btnGuardar){
            //Tomar los valores de los textField(getText) y meterlos en el modelo(set)
//          com.setCodigo(Integer.parseInt(frmCom.txtCodigoCompra.getText()));
            //com.setCodigo(frmCom.txtCodigoCompra.getText());
            com.setCodigo(Integer.parseInt(FrmCompras.txtAddCodPro.getText()));
            //com.setFecha(frmCom.txtFecha.getText());
            com.setCompra_kg(Double.parseDouble(frmCom.txtCompraKG.getText()));
            com.setObservaciones(frmCom.jtextObservaciones.getText());
            //System.out.println("?");
            //Llamr método `registrar` del modelo "Consultas" para pasarle los valores anteiores e insertarlos en la DB
            
            if(modCom.registrar(com)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frmCom.btnLimpiar){
            limpiar();
        }
    }
    
    public void limpiar(){
        frmCom.txtCodigoCompra.setText(null);
        frmCom.txtFecha.setText(null);
        frmCom.txtAddCodPro.setText(null);
        frmCom.txtNombreProducto.setText(null);
        frmCom.txtCompraKG.setText(null);
        frmCom.txtPrecioCompra.setText(null);
        frmCom.txtPrecioVenta.setText(null);
        frmCom.txtTotalCompra.setText(null);
        frmCom.jtextObservaciones.setText(null);
        frmCom.txtCampoBuscar.setText(null);
    }
}
