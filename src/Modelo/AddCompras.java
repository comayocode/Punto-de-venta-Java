package Modelo;

public class AddCompras {
    private int codigo;
    private String fecha;
    private int codigo_producto;
    private double compra_kg;
    private int total_compra;
    private String observaciones;

    public int getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public double getCompra_kg() {
        return compra_kg;
    }

    public int getTotal_compra() {
        return total_compra;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public void setCompra_kg(double compra_kg) {
        this.compra_kg = compra_kg;
    }

    public void setTotal_compra(int total_compra) {
        this.total_compra = total_compra;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
    
    
    
    
}
