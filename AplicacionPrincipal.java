import java.util.Scanner;

public class AplicacionPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utilidades util0 = new Utilidades();

        /*
         * Modificado los objetos y he hecho un array de objetos ya que es mas facil pasar 4 por parametro
         * del metodo que pasar 16.
         * Modificado el 01.12.2024
         */
        Pan[] pan = {
            new Pan("Pan integral",50,1.25),
            new Pan("Barra de pan",50,0.5),
            new Pan("Pan de campo",50,0.99),
            new Pan("Pan de la abuela",50,0.99),
        };
        Bebidas[] bebidas = {
            new Bebidas("Nestea",50,1.99),
            new Bebidas("Agua",50,0.99),
            new Bebidas("Coca-Cola",50,1.99),
            new Bebidas("Fanta de limon",50,1.99),
        };
        Pasteles[] pasteles = {
            new Pasteles("Pastel de carne",50,3.5),
            new Pasteles("Pastel de fresa",50,2.99),
            new Pasteles("Pastel de chocolate",50,2.99),
            new Pasteles("Pastel de vainilla",50,2.49),
        };
        Pizzas[] pizza = {
            new Pizzas("Pizza 4 Estaciones",50,3.19),
            new Pizzas("Pizza Jamon y Queso",50,2.69),
            new Pizzas("Pizza Carbonara",50,2.99),
            new Pizzas("Pizza de Kebab",50,2.49),
        };
        Operaciones opera0 = new Operaciones();
        menuPrincipal(util0, sc, pan, bebidas, pasteles, pizza);

    }

    protected static void menuPrincipal(Utilidades util0, Scanner sc, Pan[] pan, Bebidas[] bebidas, Pasteles[] pasteles, Pizzas[] pizza){
    util0.textoPrincipio();
    util0.textoPrincipal();
    int opcion = sc.nextInt();
    switch (opcion) {
        case 1: break;
        case 2: break;
        case 3: break;
        case 4: break;
        case 5: break;
        
        default: System.out.println("Numero introducido no valido."); break;
    }
    }
    protected static void menuPanes(){
    
    }
}