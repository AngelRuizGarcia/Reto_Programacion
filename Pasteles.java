public class Pasteles {

    protected String nombreProducto;
    protected int cantidadProducto;
    protected int cantidadRestante;
    protected double precioProducto;

    protected double precioTotal;

    //atrb opcionales
    protected boolean llevaGluten; 
    protected double peso;
    protected int Kcal;


    public Pasteles(String nombreProducto, int cantidadProducto, double precioProducto, boolean llevaGluten, double peso, int Kcal) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.cantidadRestante = cantidadProducto;
        this.precioProducto = precioProducto;
        this.llevaGluten = llevaGluten;
        this.peso = peso;
        this.Kcal = Kcal;
    }

    protected void actualizarCantidadRestante(int cantiRestante){

        this.cantidadRestante = cantiRestante;
    }

    protected void textoPastelesMostrarInformacion(){
        System.out.println("----");
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Lleva gluten? " + llevaGluten);
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
