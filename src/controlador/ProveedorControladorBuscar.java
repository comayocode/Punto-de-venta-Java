package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dao.ProveedorDAO;
import modelo.vo.ProveedorVO;
import vista.frmProveedores;

public class ProveedorControladorBuscar implements ActionListener{
    private ProveedorVO vo;
    private ProveedorDAO dao;
    private frmProveedores vista;

    public ProveedorControladorBuscar(ProveedorVO vo, ProveedorDAO dao, frmProveedores vista) {
        this.vo = vo;
        this.dao = dao;
        this.vista = vista;
        
        this.vista.txtBuscar.addActionListener(this);

    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setTitle("Añadir Productos");
    }
    
    public void actionPerformed(ActionEvent evn) {
        if(evn.getSource() == vista.txtBuscar){
            if(dao.buscar(vo)){
                
            }
        }
    }
}
