public class Pan {

    protected String nombreProducto;
    protected int cantidadProducto;
    protected int cantidadRestante;
    protected double precioProducto;

    //atrb opcionales
    protected boolean llevaGluten; 
    protected double peso;
    protected int Kcal;



    public Pan() {
    }


    public Pan(String nombreProducto, int cantidadProducto, double precioProducto, boolean llevaGluten, double peso, int Kcal) {
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


    protected void textoPanMostrarInformacion(){
        System.out.println("Aquí tienes la informacion del pan:");
        System.out.println();
        System.out.println("Pan ");
    }
}
