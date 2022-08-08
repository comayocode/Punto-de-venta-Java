package crudmvc;

import Modelo.ConsultasProducto;
import Modelo.AddProducto;
import Vista.FrmAddProducto;
//import jmenu.FrmAddProducto;
import Controlador.ContrProducto;
import Modelo.AddCompras;
import Modelo.ConsultasCompras;
import Vista.FrmCompras;
import Controlador.ContrCompras;
import jmenu.Lobby;
import javax.swing.UIManager;
public class CRUDMVC {

    public static void main(String[] args) {
        
        AddProducto mod = new AddProducto();
        ConsultasProducto modC = new ConsultasProducto();
        FrmAddProducto frm = new FrmAddProducto();
        ContrProducto ctrl = new ContrProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
        /*ConsultasCompras modCC = new ConsultasCompras();        
        AddCompras com = new AddCompras();
        FrmCompras frmC = new FrmCompras();
        
        ContrCompras ctrlCom = new ContrCompras(com, modCC, frmC);
        ctrlCom.iniciar();*/
        
        
    }
    
}
