public class Pasteles {
    protected final String productos[] = {"Pastel de carne","Pastel de fresa","Pastel de chocolate","Pastel de vainilla"};

    /** 
     * @param opcion Opcion introducida por el usuario.
     * @param cantidad Cantidad introducida por el usuario.
     * @return double
     */
    protected double pasteles(int opcion, int cantidad){
        switch (opcion) {
            case 1: 
                System.out.println("Has seleccionado: " + productos[0]);
                return 3.5 * cantidad;
            case 2:
                System.out.println("Has seleccionado: " + productos[1]);
                return 2.99 * cantidad;
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
