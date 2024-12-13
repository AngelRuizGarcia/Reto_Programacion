import java.util.Scanner;

public class AplicacionPrincipal {

    /**
     * @author Angel Ruiz Garcia
     * @author Alejandro Rovira Martinez
     * 
     * Programa de gestion de una panaderia con 4 tipo de productos
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Utilidades util0 = new Utilidades();

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
            new Pasteles("Pastel de carne",10,3.5,false,77.6,542),
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
        sc.close();

    }

    
    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para ir a diferentes submenus
     */
    protected static void menuPrincipal(Utilidades util0, Scanner sc, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles, Pizzas[] pizza) throws InterruptedException{
        util0.textoPrincipal();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1: menuPanes(util0, sc, pan, bebidas, pasteles, pizza); break;
            case 2: menuPizzas(util0, sc, pizza, pan, bebidas, pasteles); break;
            case 3: menuPasteles(util0, sc, pizza, pan, bebidas, pasteles); break;
            case 4: menuBebidas(util0, sc, pizza, pan, bebidas, pasteles); break;
            case 5: menuPagar(util0, sc, pizza, pan, bebidas, pasteles); break;
            case 6: break;
            
            default: System.out.println("Numero introducido no valido."); menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza); break;
        }
    }

    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para seleccionar que pan quieres y la cantidad que deseas
     */
    protected static void menuPanes(Utilidades util0, Scanner sc, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles, Pizzas[] pizza ) throws InterruptedException{
        int numUsuario;
        int numRestanteCalculado;
        util0.textoProductoPan();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1:
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pan[0].cantidadRestante, numUsuario);
                pan[0].calculoPrecioTotal(numUsuario);
                pan[0].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 2:
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pan[1].cantidadRestante, numUsuario);
                pan[1].calculoPrecioTotal(numUsuario);
                pan[1].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
               
            break;
            case 3:
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pan[2].cantidadRestante, numUsuario);
                pan[2].calculoPrecioTotal(numUsuario);
                pan[2].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 4: 
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pan[3].cantidadRestante, numUsuario);
                pan[3].calculoPrecioTotal(numUsuario);
                pan[3].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 5:
                util0.textoProductoPanesMasInformacion();
                menuPanMasInformacion(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 6:
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            
            default: 
                System.out.println("Numero introducido no valido."); 
                menuPanes(util0, sc, pan, bebidas, pasteles, pizza);
            break;
        }

    }

    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para seleccionar que pizza quieres y la cantidad que deseas
     */
    protected static void menuPizzas(Utilidades util0, Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles) throws InterruptedException{
        int numUsuario;
        int numRestanteCalculado;
        util0.textoProductoPizza();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1:
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pizza[0].cantidadRestante, numUsuario);
                pizza[0].calculoPrecioTotal(numUsuario);
                pizza[0].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 2:
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pizza[1].cantidadRestante, numUsuario);
                pizza[1].calculoPrecioTotal(numUsuario);
                pizza[1].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break; 
            case 3:
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pizza[2].cantidadRestante, numUsuario);
                pizza[2].calculoPrecioTotal(numUsuario);
                pizza[2].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 4: 
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pizza[3].cantidadRestante, numUsuario);
                pizza[3].calculoPrecioTotal(numUsuario);
                pizza[3].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 5: 
                util0.textoProductoPizzasMasInformacion();
                menuPizzasMasInformacion(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 6:
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            default:
                System.out.println("Numero introducido no valido.");
                menuPizzas(util0, sc, pizza, pan, bebidas, pasteles);
            break;
        }
    }

    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para seleccionar que pasteles quieres y la cantidad que deseas
     */
    protected static void menuPasteles(Utilidades util0, Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles) throws InterruptedException{
        int numUsuario;
        int numRestanteCalculado;
        util0.textoProductoPasteles();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1:
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pasteles[0].cantidadRestante, numUsuario);
                pasteles[0].calculoPrecioTotal(numUsuario);
                pasteles[0].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 2: 
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pasteles[1].cantidadRestante, numUsuario);
                pasteles[1].calculoPrecioTotal(numUsuario);
                pasteles[1].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            case 3: 
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pasteles[2].cantidadRestante, numUsuario);
                pasteles[2].calculoPrecioTotal(numUsuario);
                pasteles[2].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 4: 
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(pasteles[3].cantidadRestante, numUsuario);
                pasteles[3].calculoPrecioTotal(numUsuario);
                pasteles[3].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 5: 
                util0.textoProductoPastelesMasInformacion();
                menuPastelesMasInformacion(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 6:
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            default:
                System.out.println("Numero introducido no valido.");
                menuPasteles(util0, sc, pizza, pan, bebidas, pasteles);
            break;
        }
    }

    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para seleccionar que bebidas quieres y la cantidad que deseas
     */
    protected static void menuBebidas(Utilidades util0, Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles) throws InterruptedException{
        int numUsuario;
        int numRestanteCalculado;
        util0.textoProductoBebidas();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1:
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(bebidas[0].cantidadRestante, numUsuario);
                bebidas[0].calculoPrecioTotal(numUsuario);
                bebidas[0].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 2:
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(bebidas[1].cantidadRestante, numUsuario);
                bebidas[1].calculoPrecioTotal(numUsuario);
                bebidas[1].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 3: 
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(bebidas[2].cantidadRestante, numUsuario);
                bebidas[2].calculoPrecioTotal(numUsuario);
                bebidas[2].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 4: 
                util0.textoCantidad();
                numUsuario = util0.pedirNumeroEntero(sc);
                numRestanteCalculado = util0.cantidadRestante(bebidas[3].cantidadRestante, numUsuario);
                bebidas[3].calculoPrecioTotal(numUsuario);
                bebidas[3].actualizarCantidadRestante(numRestanteCalculado);
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 5:
                util0.textoProductoBebidasMasInformacion();
                menuBebidasMasInformacion(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 6:
                menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            
            default:
                System.out.println("Numero introducido no valido.");
                menuBebidas(util0, sc, pizza, pan, bebidas, pasteles);
            break;
        }
    }

    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para seleccionar con que metodo de pago quieres terminar la compra
     */
    protected static void menuPagar(Utilidades util0, Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pastel) throws InterruptedException{
        util0.textoPagar();
        switch (util0.pedirNumeroEntero(sc)) {
            case 1: 
                util0.textoResumenPago(pan, bebidas, pizza, pastel);
                util0.totalAPagar(pan, bebidas, pizza, pastel);
                util0.horaDeLaCompra();
                util0.textoPagoTarjeta();
                //Este if sirve para que si la tarjeta es rechaza (FALSE) vuelve a menu de pago
                if(!util0.tarjetaAceptadaORechazada()){
                    menuPagar(util0, sc, pizza, pan, bebidas, pastel);
                }
            break;
            case 2: 
                util0.textoResumenPago(pan, bebidas, pizza, pastel);

                util0.horaDeLaCompra();

                double total = util0.totalAPagar(pan, bebidas, pizza, pastel);
                
                util0.textoPagoConEfectivo();
                double efectivoUsuario = util0.pedirNumeroDouble(sc);

                //Este if sirve para que si el dinero que introduce el usuario es menor al del producto vuelve a menu de pago
                if(!util0.calculoVueltaEfectivo(efectivoUsuario, total)){
                    menuPagar(util0, sc, pizza, pan, bebidas, pastel);
                }
            break;
            default:
                System.out.println("Numero introducido no valido.");
                menuPagar(util0, sc, pizza, pan, bebidas, pastel);
            break;
        }
    }

    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para mostrar mas informacion del producto seleccionado
     */
    protected static void menuBebidasMasInformacion(Utilidades util0,Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles ) throws InterruptedException{
        switch (util0.pedirNumeroEntero(sc)){
            case 1:
                bebidas[0].textoBebidasMostrarInformacion();
                menuBebidas(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 2: 
                bebidas[1].textoBebidasMostrarInformacion();
                menuBebidas(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 3:
                bebidas[2].textoBebidasMostrarInformacion();
                menuBebidas(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 4: 
                bebidas[3].textoBebidasMostrarInformacion();
                menuBebidas(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            default:
            System.out.println("Numero introducido no valido. ");
            menuBebidasMasInformacion(util0, sc, pizza, pan, bebidas, pasteles); 
            break;

        }
    }
    
    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para mostrar mas informacion del producto seleccionado
     */
    protected static void menuPizzasMasInformacion(Utilidades util0,Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles )throws InterruptedException{
        switch (util0.pedirNumeroEntero(sc)){
            case 1:
                pizza[0].textoPizzasMostrarInformacion();
                menuPizzas(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 2: 
                pizza[1].textoPizzasMostrarInformacion();
                menuPizzas(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 3:
                pizza[2].textoPizzasMostrarInformacion();
                menuPizzas(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 4: 
                pizza[3].textoPizzasMostrarInformacion();
                menuPizzas(util0, sc, pizza, pan, bebidas, pasteles);
            break;

            default:
                System.out.println("Numero introducido no valido. ");
                menuPizzasMasInformacion(util0, sc, pizza, pan, bebidas, pasteles);
            break;

        }
    }
    
    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para mostrar mas informacion del producto seleccionado
     */
    protected static void menuPastelesMasInformacion(Utilidades util0,Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles )throws InterruptedException{
        switch (util0.pedirNumeroEntero(sc)){
            case 1:
                pasteles[0].textoPastelesMostrarInformacion();
                menuPasteles(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 2: 
                pasteles[1].textoPastelesMostrarInformacion();
                menuPasteles(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 3:
                pasteles[2].textoPastelesMostrarInformacion();
                menuPasteles(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            case 4: 
                pasteles[3].textoPastelesMostrarInformacion();
                menuPasteles(util0, sc, pizza, pan, bebidas, pasteles);
            break;
            default:
                System.out.println("Numero introducido no valido. ");
                menuPastelesMasInformacion(util0, sc, pizza, pan, bebidas, pasteles);
            break;

        }
    }

    /** 
     * @param util0 Clase Utilidades para mostrar textos, pedir numeros y hacer calculos
     * @param sc Scanner para introducir numeros
     * @param pan Array de objetos de la clase pan
     * @param bebidas Array de objetos de la clase bebidas
     * @param pasteles Array de objetos de la clase pasteles
     * @param pizza Array de objetos de la clase pizza
     * @throws InterruptedException Esto sirve para poder usar sleep en el pago con tarjeta
     * 
     * Este metodo sirve para mostrar mas informacion del producto seleccionado
     */
    protected static void menuPanMasInformacion(Utilidades util0,Scanner sc, Pizzas[] pizza, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles )throws InterruptedException{
        switch (util0.pedirNumeroEntero(sc)){
            case 1:
                pan[0].textoPanMostrarInformacion();
                menuPanes(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 2: 
                pan[1].textoPanMostrarInformacion();
                menuPanes(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 3:
                pan[2].textoPanMostrarInformacion();
                menuPanes(util0, sc, pan, bebidas, pasteles, pizza);
            break;
            case 4: 
                pan[3].textoPanMostrarInformacion();
                menuPanes(util0, sc, pan, bebidas, pasteles, pizza);
            break;

            default:
                System.out.println("Numero introducido no valido. ");
                menuPanMasInformacion(util0, sc, pizza, pan, bebidas, pasteles);
            break;

        }
    }

}