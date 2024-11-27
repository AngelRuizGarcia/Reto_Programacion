public class Pizzas {
    protected final String productos[] = {"Pizza 4 Estaciones","Pizza Jamon y Queso","Pizza Carbonara","Pizza de Kebab"};

    /** 
     * @param opcion Opcion introducida por el usuario.
     * @param cantidad Cantidad introducida por el usuario.
     * @return double
     */
    protected double pizzas(int opcion, int cantidad){
        switch (opcion) {
            case 1: 
                System.out.println("Has seleccionado: " + productos[0]);
                return 3.19 * cantidad;
            case 2:
                System.out.println("Has seleccionado: " + productos[1]);
                return 2.69 * cantidad;
            case 3: 
                System.out.println("Has seleccionado: " + productos[2]);
                return 2.99 * cantidad;
            case 4: 
                System.out.println("Has seleccionado: " + productos[3]);
                return 2.49 * cantidad;
            default: System.out.println("Numero introducido no valido."); return 0.0;
        }
    }
}
