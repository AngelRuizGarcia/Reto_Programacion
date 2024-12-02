import java.util.Scanner;

public class AplicacionPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utilidades util0 = new Utilidades();
        Operaciones opera0 = new Operaciones();

        /*
         * Modificado los objetos y he hecho un array de objetos ya que es mas facil pasar 4 por parametro
         * del metodo que pasar 16.
         * Modificado el 01.12.2024
         */
        Pan[] pan = {
            new Pan("Pan integral",10,1.25,false,240.0,183),
            new Pan("Barra de pan",10,0.5,true,60.0,249),
            new Pan("Pan de campo",10,0.99,true,220.0,70),
            new Pan("Pan de la abuela",10,0.99,false,123.3,90),
        };
        Bebidas[] bebidas = {
            new Bebidas("Nestea",20,1.99,330,20),
            new Bebidas("Agua",20,0.99,330,0),
            new Bebidas("Coca-Cola",20,1.99,330,134),
            new Bebidas("Fanta de limon",20,1.99,330,89),
        };
        Pasteles[] pasteles = {
            new Pasteles("Pastel de carne",10,3.5,true,77.6,542),
            new Pasteles("Pastel de fresa",10,2.99,true,128,357),
            new Pasteles("Pastel de chocolate",10,2.99,true,96.6,785),
            new Pasteles("Pastel de vainilla",10,2.49,true,283.6,645),
        };
        Pizzas[] pizza = {
            new Pizzas("Pizza 4 Estaciones",10,3.19,true,234.4,468),
            new Pizzas("Pizza Jamon y Queso",10,2.69,true,137.0,587),
            new Pizzas("Pizza Carbonara",10,2.99,true,234.3,454),
            new Pizzas("Pizza de Kebab",10,2.49,false,165.3,379),
        };

        menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);

    }

    protected static void menuPrincipal(Utilidades util0, Scanner sc, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles, Pizzas[] pizza){
    util0.textoPrincipio();
    util0.textoPrincipal();
    int opcion = sc.nextInt();
    switch (opcion) {
        case 1: menuPanes(util0, sc, pan); break;
        case 2: menuPizzas(util0, sc, pizza);break;
        case 3: menuPasteles(util0, sc, pasteles);break;
        case 4: menuBebidas(util0, sc, bebidas);break;
        case 5: break;
        
        default: System.out.println("Numero introducido no valido."); break;
    }
    }
    protected static void menuPanes(Utilidades util0, Scanner sc, Pan [] pan){
        util0.textoProductoPan();
    }

    protected static void menuPizzas(Utilidades util0, Scanner sc, Pizzas [] pizza){
        util0.textoProductoPizza();
    }

    protected static void menuPasteles(Utilidades util0, Scanner sc, Pasteles [] pasteles){
        util0.textoProductoPasteles();
    }

    protected static void menuBebidas(Utilidades util0, Scanner sc, Bebidas [] bebidas){
        util0.textoProductoBebidas();
    }

    protected static void menuPagar(Utilidades util0, Scanner sc){
        util0.textoPagar();
    }

}