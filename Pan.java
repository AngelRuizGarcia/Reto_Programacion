public class Pan {

    protected final String productos[] = {"Pan integral","Barra de pan","Pan de campo","Pan de la abuela"};
    
    /** 
     * @param opcion Opcion introducida por el usuario.
     * @param cantidad Cantidad introducida por el usuario.
     * @return double
     */
    protected double panes(int opcion, int cantidad){
        switch (opcion) {
            case 1: 
                System.out.println("Has seleccionado: " + productos[0]);
                return 1.25 * cantidad;
            case 2:
                System.out.println("Has seleccionado: " + productos[1]);
                return 0.5 * cantidad;
            case 3: 
                System.out.println("Has seleccionado: " + productos[2]);
                return 0.99 * cantidad;
            case 4: 
                System.out.println("Has seleccionado: " + productos[3]);
                return 0.99 * cantidad;
            default: System.out.println("Numero introducido no valido."); return 0.0;
        }
    }
 


}
