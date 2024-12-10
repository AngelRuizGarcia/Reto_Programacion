public class Pizzas {

    protected String nombreProducto;
    protected int cantidadProducto;
    protected int cantidadRestante;
    protected double precioProducto;

    protected double precioTotal;

    //atrb opcionales
    protected boolean llevaJamon; 
    protected double peso;
    protected int Kcal;


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

    protected void textoPizzasMostrarInformacion(){
        System.out.println("----");
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Lleva Jamon? " + llevaJamon);
        System.out.println("peso: " + peso + " gramos");
        System.out.println("kcalorias: " + Kcal);

    }

    protected double calculoPrecioTotal(int cantidadUsuario){
        if (cantidadRestante < 0){
            cantidadRestante = 0;
            return 0;
        }else if (cantidadUsuario <= cantidadRestante) {
            return this.precioTotal += (precioProducto*cantidadUsuario);
        }else {
            return 0;
        }
        
    }

}
