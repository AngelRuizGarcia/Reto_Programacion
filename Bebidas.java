public class Bebidas {

    protected String nombreProducto;
    protected int cantidadProducto;
    protected int cantidadRestante;
    protected double precioProducto;

    public Bebidas() {
    }


    public Bebidas(String nombreProducto, int cantidadProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.cantidadRestante = cantidadProducto;
    }

}