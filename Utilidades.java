import java.util.Scanner;

public class Utilidades{
    //texto de inicio del programa
    protected void textoPrincipio (){
        System.out.println("Bienvenido al programa del tono la ines ");
        System.out.println();
    }
    //texto principal/inicial del programa
    protected void textoPrincipal(){
        System.out.println("Menu de Opciones");
        System.out.println("1. Panes");
        System.out.println("2. Pizzas");
        System.out.println("3. Pasteles");
        System.out.println("4. Bebidas");
        System.out.println("5. Finalizar compra y pagar");
        System.out.print("Introduce una opción: ");
        
    }

    protected void textoPagar(){
        System.out.println("1. Pago con tarjeta");
        System.out.println("2. Pago en efectivo");
    }

    protected void textoProductoPan(){
        System.out.println();
        System.out.println("Menu de Panes");
        System.out.println("1. Pan integral - 1.25 E");
        System.out.println("2. Barra de pan - 0.5 E");
        System.out.println("3. Pan de campo - 0.99 E");
        System.out.println("4. Pan de la abuela - 0.99 E");
        System.out.println("5. Mas informacion");
        System.out.println("6. Volver al menu principal");
        System.out.print("Introduce una opción: ");
    }
    protected void textoProductoBebidas(){
        System.out.println();
        System.out.println("Menu de Bebidas");
        System.out.println("1. Nestea - 1.99 E");
        System.out.println("2. Agua - 0.99 E");
        System.out.println("3. Coca-Cola - 1.9 9E");
        System.out.println("4. Fanta de limon - 1.99 E");
        System.out.println("5. Mas informacion");
        System.out.println("6. Volver al menu principal");
        System.out.print("Introduce una opción: ");
    }
    protected void textoProductoPasteles(){
        System.out.println();
        System.out.println("Menu de Pasteles");
        System.out.println("1. Pastel de carne - 3.5 E");
        System.out.println("2. Pastel de fresa - 2.99 E");
        System.out.println("3. Pastel de chocolate - 2.99 E");
        System.out.println("4. Pastel de vainilla - 2.49 E");
        System.out.println("5. Mas informacion");
        System.out.println("6. Volver al menu principal");
        System.out.print("Introduce una opción: ");
    }
    protected void textoProductoPizza(){
        System.out.println();
        System.out.println("Menu de Pizzas");
        System.out.println("1. Pizza 4 Estaciones - 3.19 E");
        System.out.println("2. Pizza Jamon y Queso - 2.69 E");
        System.out.println("3. Pizza Carbonara - 2.99 E");
        System.out.println("4. Pizza de Kebab - 2.49 E");
        System.out.println("5. Mas informacion");
        System.out.println("6. Volver al menu principal");
        System.out.print("Introduce una opción: ");
    }

    protected void textoCantidad(){
        System.out.println("Cuanta cantidad quieres?");
        System.out.print("Introduce la cantidad: ");
    }

    protected void textoProductoBebidasMasInformacion(){
        System.out.println("----");
        System.out.println("Sobre que quieres mas informacion?");
        System.out.println();
        System.out.println("1. Nestea");
        System.out.println("2. Agua");
        System.out.println("3. Coca-Cola");
        System.out.println("4. Fanta de limon");
        System.out.print("Introduce una opción: ");
    }

    protected void textoProductoPizzasMasInformacion(){
        System.out.println("----");
        System.out.println("Sobre que quieres mas informacion?");
        System.out.println();
        System.out.println("1. Pizza 4 estaciones");
        System.out.println("2. Pizza Jamon y Queso");
        System.out.println("3. Pizza Carbonara");
        System.out.println("4. Pizza de Kebab");
        System.out.print("Introduce una opción: ");
    }

    protected void textoProductoPastelesMasInformacion(){
        System.out.println("----");
        System.out.println("Sobre que quieres mas informacion?");
        System.out.println();
        System.out.println("1. Pastel de carne");
        System.out.println("2. Pastel de fresa");
        System.out.println("3. Pastel de chocolate");
        System.out.println("4. Pastel de vainilla");
        System.out.print("Introduce una opción: ");
    }

    protected void textoProductoPanesMasInformacion(){
        System.out.println("----");
        System.out.println("Sobre que quieres mas informacion?");
        System.out.println();
        System.out.println("1. Pan integral");
        System.out.println("2. Barra de pan");
        System.out.println("3. Pan de campo");
        System.out.println("4. Pan de la abuela");
        System.out.print("Introduce una opción: ");
    }

    protected int pedirNumeroEntero(Scanner sc){
        return sc.nextInt();
    }

    protected double pedirNumeroDouble(Scanner sc){
        return sc.nextDouble();
    }

    protected String pedirTexto(Scanner sc){
        return sc.nextLine();
    }
 
    protected int cantidadRestante (Scanner sc, int cantidadProducto, int numeroUsuario){
        if (numeroUsuario <= cantidadProducto) {
           return cantidadProducto += -(numeroUsuario);
        } else {
            System.out.println("No queda stock, lo sentimos");
            return 0;
        }
        
    
    }

    protected int cantidadRestante (Scanner sc, int cantidadProducto){
        int numeroUsuario = 1; 
        if (numeroUsuario <= cantidadProducto) {
           return cantidadProducto += -(numeroUsuario);
        } else {
            System.out.println("No queda stock, lo sentimos");
            return 0;
        }
    }
    }

    