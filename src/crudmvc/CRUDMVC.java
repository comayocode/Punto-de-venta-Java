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
import Vista.Lobby;
import Vista.VistaProductosAgregar;
import javax.swing.UIManager;
import jmenu.Menu;
public class CRUDMVC {

    public static void main(String[] args) {
        
        AddProducto mod = new AddProducto();
        ConsultasProducto modC = new ConsultasProducto();
        VistaProductosAgregar frm = new VistaProductosAgregar();
        ContrProducto ctrl = new ContrProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
        ConsultasCompras modCom = new ConsultasCompras();        
        AddCompras com = new AddCompras();
        FrmCompras frmCom = new FrmCompras();
        ContrCompras ctrlCom = new ContrCompras(com, modCom, frmCom);
        ctrlCom.iniciar();
        frmCom.setVisible(true);
        
        //Lobby lobby = new Lobby();
        //lobby.setVisible(true);
    }
    
}
