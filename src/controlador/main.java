package controlador;
import modelo.vo.ProductoVO;
import modelo.dao.ProductoDAO;
import controlador.ProductoControlador;
import vista.frmMenu;
import vista.frmProductosAgregar;

public class main {
    public static void main(String[] args) {
        ProductoVO vo = new ProductoVO();
        ProductoDAO dao = new ProductoDAO();
        frmProductosAgregar vista = new frmProductosAgregar();
        
        ProductoControlador controlador = new ProductoControlador(vo, dao, vista);
        controlador.iniciar();
        vista.setVisible(true);
    }
}
