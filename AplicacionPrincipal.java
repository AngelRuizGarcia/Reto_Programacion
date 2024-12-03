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

        util0.textoPrincipio();
        menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);

    }

    protected static void menuPrincipal(Utilidades util0, Scanner sc, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles, Pizzas[] pizza){
    util0.textoPrincipal();
    switch (util0.pedirNumeroEntero(sc)) {
        case 1: menuPanes(util0, sc, pan, bebidas, pasteles, pizza); break;
        case 2: menuPizzas(util0, sc, pizza, pan, bebidas, pasteles); break;
        case 3: menuPasteles(util0, sc, pizza, pan, bebidas, pasteles); break;
        case 4: menuBebidas(util0, sc, pizza, pan, bebidas, pasteles); break;
        case 5: menuPagar(util0, sc); break;
        
        default: System.out.println("Numero introducido no valido."); break;
    }
    }
    protected static void menuPanes(Utilidades util0, Scanner sc, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles, Pizzas[] pizza ){
        util0.textoProductoPan();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1:
                util0.textoCantidad();
                int num = util0.cantidadRestante(sc, pan[0].cantidadRestante);
                pan[0].actualizarCantidadRestante(num);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 2:
                util0.textoCantidad();
                pan[1].cantidadRestante = util0.cantidadRestante(sc, pan[1].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 3:
                util0.textoCantidad();
                pan[2].cantidadRestante = util0.cantidadRestante(sc, pan[2].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 4: 
                util0.textoCantidad();
                pan[3].cantidadRestante = util0.cantidadRestante(sc, pan[3].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 5: break;
            case 6: break;
            
            default: System.out.println("Numero introducido no valido."); break;
        }

    }

    protected static void menuPizzas(Utilidades util0, Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles){
        util0.textoProductoPizza();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1:
                util0.textoCantidad();
                pizza[0].cantidadRestante = util0.cantidadRestante(sc, pizza[0].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 2:
                util0.textoCantidad();
                pizza[1].cantidadRestante = util0.cantidadRestante(sc, pizza[1].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break; 
            case 3:
                util0.textoCantidad();
                pizza[2].cantidadRestante = util0.cantidadRestante(sc, pizza[2].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 4: 
                util0.textoCantidad();
                pizza[3].cantidadRestante = util0.cantidadRestante(sc, pizza[3].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 5: break;
            case 6: break;
            
            default: System.out.println("Numero introducido no valido."); break;
        }
    }

    protected static void menuPasteles(Utilidades util0, Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles){
        util0.textoProductoPasteles();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1:
                util0.textoCantidad();
                pasteles[0].cantidadRestante = util0.cantidadRestante(sc, pasteles[0].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 2: 
                util0.textoCantidad();
                pasteles[1].cantidadRestante = util0.cantidadRestante(sc, pasteles[1].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 3: 
                util0.textoCantidad();
                pasteles[2].cantidadRestante = util0.cantidadRestante(sc, pasteles[2].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 4: 
                util0.textoCantidad();
                pasteles[3].cantidadRestante = util0.cantidadRestante(sc, pasteles[3].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 5: break;
            case 6: break;
            
            default: System.out.println("Numero introducido no valido."); break;
        }
    }

    protected static void menuBebidas(Utilidades util0, Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles){
        util0.textoProductoBebidas();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1:
                util0.textoCantidad();
                bebidas[0].cantidadRestante = util0.cantidadRestante(sc, bebidas[0].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 2:
                util0.textoCantidad();
                bebidas[1].cantidadRestante = util0.cantidadRestante(sc, bebidas[1].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 3: 
                util0.textoCantidad();
                bebidas[2].cantidadRestante = util0.cantidadRestante(sc, bebidas[2].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 4: 
                util0.textoCantidad();
                bebidas[3].cantidadRestante = util0.cantidadRestante(sc, bebidas[3].cantidadProducto);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); 
            break;
            case 5: break;
            case 6: break;
            
            default: System.out.println("Numero introducido no valido."); break;
        }
    }

    protected static void menuPagar(Utilidades util0, Scanner sc){
        util0.textoPagar();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1: break;
            case 2: break;
            
            default: System.out.println("Numero introducido no valido."); break;
        }
    }

}