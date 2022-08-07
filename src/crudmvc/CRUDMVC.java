package crudmvc;

import Modelo.ConsultasProducto;
import Modelo.Add_Producto;
import Vista.Frm_Add_Producto;
import Controlador.ContrProducto;
import Modelo.AddCompras;
import Modelo.ConsultasCompras;
import Vista.FrmCompras;
import Controlador.ContrCompras;
import Vista.Lobby;
public class CRUDMVC {

    public static void main(String[] args) {
        
        Lobby menu = new Lobby();
        menu.setVisible(true);
        
        /*Add_Producto mod = new Add_Producto();
        ConsultasProducto modC = new ConsultasProducto();
        Frm_Add_Producto frm = new Frm_Add_Producto();
        
        ContrProducto ctrl = new ContrProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
        AddCompras com = new AddCompras();
        ConsultasCompras modCC = new ConsultasCompras();
        FrmCompras frmC = new FrmCompras();
        
        ContrCompras ctrlCom = new ContrCompras(com, modCC, frmC);
        ctrlCom.iniciar();
        frmC.setVisible(true);*/
        
        
    }
    
}
