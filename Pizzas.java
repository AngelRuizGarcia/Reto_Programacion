public class Pizzas {

    protected String nombreProducto;
    protected int cantidadProducto;
    protected int cantidadRestante;
    protected double precioProducto;

    //atrb opcionales
    protected boolean llevaJamon; 
    protected double peso;
    protected int Kcal;


    public Pizzas() {
    }


    public Pizzas(String nombreProducto, int cantidadProducto, double precioProducto, boolean llevaJamon, double peso, int Kcal) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.cantidadRestante = cantidadProducto;
        this.precioProducto = precioProducto;
        this.llevaJamon = llevaJamon;
        this.peso = peso;
        this.Kcal = Kcal;
    }
    protected void actualizarCantidadRestante(int cantiRestante){

        this.cantidadRestante = cantiRestante;
    }

}
