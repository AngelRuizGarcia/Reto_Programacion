public class Bebidas {

    //ATRIBUTOS OBLIGATORIOS
    protected String nombreProducto;
    protected int cantidadProducto;
    protected int cantidadRestante;
    protected double precioProducto;

    //ATRIBUTO DE CALCULO
    protected double precioTotal;

    //ATRIBUTOS OPCIONALES DE INFORMACION
    protected double cantidadML;
    protected int Kcal;
    

    public Bebidas(String nombreProducto, int cantidadProducto, double precioProducto, int cantidadML, int Kcal) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.cantidadRestante = cantidadProducto;
        this.precioProducto = precioProducto;
        this.cantidadML = cantidadML;
        this.Kcal = Kcal;
    }

    /** Metodo que actualiza la cantidad que calcula el metodo de utilidades
     * y le llega por parametro el calculo
     * @param cantiRestante
     */
    protected void actualizarCantidadRestante(int cantiRestante){
        this.cantidadRestante = cantiRestante;
    }
    
    protected void textoBebidasMostrarInformacion(){
        System.out.println("----");
        System.out.println("Nombre: " + nombreProducto + ".");
        System.out.println("Cantidad de ml: " + cantidadML + ".");
        System.out.println("kcalorias: " + Kcal + ".");

    }

/** Metodo que calcula el precio total de la cantidad que introduce el usuario
     * @param cantidadUsuario
     * @return double Devuelve el precioTotal que calcula
     */
    protected double calculoPrecioTotal(int cantidadUsuario){
        if (cantidadRestante < 0){ 
            /**
            * Este if sirve para igualar la cantidad a 0 si 
            * el usuario introduce mas de la cantidad que hay del producto
            */
            cantidadRestante = 0;
            return 0;
        }else if (cantidadUsuario <= cantidadRestante) {
            /**
             * El else if comprueba si lo introducido por el usuario es menor o igual
             * y calcula el precio total
             */
            return this.precioTotal += (precioProducto*cantidadUsuario);
        }else {
            return 0;
        }
        
    }
}