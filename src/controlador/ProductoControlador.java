package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dao.ProductoDAO;
import modelo.vo.ProductoVO;
import vista.frmProductosAgregar;


public class ProductoControlador implements ActionListener{
    
    //Implementar variables y constantes
    private ProductoVO vo;
    private ProductoDAO dao;
    private frmProductosAgregar vista;
    
    //Constructor que recibe modelo y vista
    public ProductoControlador(ProductoVO vo, ProductoDAO dao, frmProductosAgregar vista){
        //Igualar valores con las variables creadas (linea12)
        this.vo = vo;
        this.dao = dao;
        this.vista = vista;
        
        //Declarar acciones para los botones de la vista (requiere poner publico el boton)
        this.vista.btnGuardar.addActionListener(this);
        
    }
    
    //Método para iniciar la vista
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setTitle("Añadir Productos");
    }
    
    //Eventos que escuchan las acciones de los botones
    @Override
    public void actionPerformed(ActionEvent evn){
        //ActionEvent trae el evento del botón que se le dio clic
        
        //Si se cumple esta condicion significa que se le dió clic al botón guardar
        if(evn.getSource() == vista.btnGuardar){
            //Tomar u obtener los valores de las cajas/campos de texto y meterlos en el modeloDAO
            //
            vo.setNombre(vista.txtProducto.getText());
            
            //Llamar el método de registrar
            if(dao.registrar(vo)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
    }
    
    public void limpiar(){
        vista.txtProducto.setText(null);
    }
    
}
