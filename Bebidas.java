public class Bebidas {

    protected final String productos[] = {"Nestea","Agua","Coca-Cola","Fanta de limon"};
    
    /** 
     * @param opcion Opcion introducida por el usuario.
     * @param cantidad Cantidad introducida por el usuario.
     * @return double
     */
    protected double bebidas(int opcion, int cantidad){
        switch (opcion) {
            case 1: 
                System.out.println("Has seleccionado: " + productos[0]);
                return 1.99 * cantidad;
            case 2:
                System.out.println("Has seleccionado: " + productos[1]);
                return 0.99 * cantidad;
            case 3: 
                System.out.println("Has seleccionado: " + productos[2]);
                return 1.99 * cantidad;
            case 4: 
                System.out.println("Has seleccionado: " + productos[3]);
                return 1.99 * cantidad;
            default: System.out.println("Numero introducido no valido."); return 0.0;
        }
    }
}