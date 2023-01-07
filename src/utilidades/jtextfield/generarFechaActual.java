package utilidades.jtextfield;

import java.text.SimpleDateFormat;
import java.util.Date;
import static vista.frmComprasAgregar.txtFechaGenerada;

public class generarFechaActual {
    
    public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd");
        
        return formatoFecha.format(fecha);
    }
    
}
