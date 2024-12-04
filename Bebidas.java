public class Bebidas {

    protected String nombreProducto;
    protected int cantidadProducto;
    protected int cantidadRestante;
    protected double precioProducto;

    //atrb opcionales
    protected int cantidadML; 
    protected int Kcal;
    


    public Bebidas() {
    }


    public Bebidas(String nombreProducto, int cantidadProducto, double precioProducto, int cantidadML, int Kcal) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.cantidadRestante = cantidadProducto;
        this.precioProducto = precioProducto;
        this.cantidadML = cantidadML;
        this.Kcal = Kcal;
    }
    protected void actualizarCantidadRestante(int cantiRestante){

        this.cantidadRestante = cantiRestante;
    }
    protected void textoBebidasMostrarInformacion(){
        System.out.println(nombreProducto);
        System.out.println("Cantidad de ml? " + cantidadML);
        System.out.println("kcalorias: " + Kcal);

    }

}