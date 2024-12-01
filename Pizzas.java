public class Pizzas {

    protected String nombreProducto;
    protected int cantidadProducto;
    protected int cantidadRestante;
    protected double precioProducto;

    public Pizzas() {
    }

    public Pizzas(String nombreProducto, int cantidadProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.cantidadRestante = cantidadProducto;
    }
}
