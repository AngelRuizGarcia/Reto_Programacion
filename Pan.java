public class Pan {

    protected String nombreProducto;
    protected int cantidadProducto;
    protected int cantidadRestante;
    protected double precioProducto;  

    public Pan() {
    }

    public Pan(String nombreProducto, int cantidadProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.cantidadRestante = cantidadProducto;
    }

 


}
