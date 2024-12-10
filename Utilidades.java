import java.time.LocalDateTime;
import java.util.Scanner;

public class Utilidades{
    //texto de inicio del programa
    protected void textoPrincipio (){
        System.out.println("Bienvenido al programa del tono la ines ");
    }
    //texto principal/inicial del programa
    protected void textoPrincipal(){
        System.out.println("----");
        System.out.println("Menu de Opciones");
        System.out.println("1. Panes");
        System.out.println("2. Pizzas");
        System.out.println("3. Pasteles");
        System.out.println("4. Bebidas");
        System.out.println("5. Finalizar compra y pagar");
        System.out.println("6. Salir de la tienda");
        System.out.print("Introduce una opción: ");
        
    }

    //texto que se muestra al seleccionar pan
    protected void textoProductoPan(){
        System.out.println("----");
        System.out.println("Menu de Panes");
        System.out.println("1. Pan integral - 1.25 E");
        System.out.println("2. Barra de pan - 0.5 E");
        System.out.println("3. Pan de campo - 0.99 E");
        System.out.println("4. Pan de la abuela - 0.99 E");
        System.out.println("5. Mas informacion");
        System.out.println("6. Volver al menu principal");
        System.out.print("Introduce una opción: ");
    }

    //texto que se muestra al seleccionar bebidas
    protected void textoProductoBebidas(){
        System.out.println("----");
        System.out.println("Menu de Bebidas");
        System.out.println("1. Nestea - 1.99 E");
        System.out.println("2. Agua - 0.99 E");
        System.out.println("3. Coca-Cola - 1.9 9E");
        System.out.println("4. Fanta de limon - 1.99 E");
        System.out.println("5. Mas informacion");
        System.out.println("6. Volver al menu principal");
        System.out.print("Introduce una opción: ");
    }

    //texto que se muestra al seleccionar pasteles
    protected void textoProductoPasteles(){
        System.out.println("----");
        System.out.println("Menu de Pasteles");
        System.out.println("1. Pastel de carne - 3.5 E");
        System.out.println("2. Pastel de fresa - 2.99 E");
        System.out.println("3. Pastel de chocolate - 2.99 E");
        System.out.println("4. Pastel de vainilla - 2.49 E");
        System.out.println("5. Mas informacion");
        System.out.println("6. Volver al menu principal");
        System.out.print("Introduce una opción: ");
    }

    //Texto que se muestra al seleccionar pizzas
    protected void textoProductoPizza(){
        System.out.println("----");
        System.out.println("Menu de Pizzas");
        System.out.println("1. Pizza 4 Estaciones - 3.19 E");
        System.out.println("2. Pizza Jamon y Queso - 2.69 E");
        System.out.println("3. Pizza Carbonara - 2.99 E");
        System.out.println("4. Pizza de Kebab - 2.49 E");
        System.out.println("5. Mas informacion");
        System.out.println("6. Volver al menu principal");
        System.out.print("Introduce una opción: ");
    }

    //Texto que se muestra al pedir la cantidad de los productos
    protected void textoCantidad(){
        System.out.println("----");
        System.out.println("Cuanta cantidad quieres?");
        System.out.print("Introduce la cantidad: ");
    }


    //Texto que se muestra cuando seleccionas mas informacion
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


    /*
     * Llamada a escaners para pedir numeros enteros, double o Strings
     */
    protected int pedirNumeroEntero(Scanner sc){
        return sc.nextInt();
    }

    protected double pedirNumeroDouble(Scanner sc){
        return sc.nextDouble();
    }

    protected String pedirTexto(Scanner sc){
        return sc.nextLine();
    }

    /*
     * Metodo que devuelve la cantidad restante
     * del producto que se le pasa por parametro.
     * 
     * Convierte el numero de usuario a negativo
     * y lo suma a la cantidad del producto
     */
    protected int cantidadRestante (int cantidadProducto, int numeroUsuario){
        if (numeroUsuario <= cantidadProducto) {
           return cantidadProducto + -(numeroUsuario);
        } else {
            System.out.println("No hay suficiente stock para la cantidad introducida");
            return cantidadProducto;
        }
    }

    
    //Texto que se muestra al seleccionar terminar compra y pagar
    protected void textoPagar(){
        System.out.println("----");
        System.out.println("1. Pago con tarjeta");
        System.out.println("2. Pago en efectivo");
        System.out.print("Introduce una opción: ");
    }

    /*
     * Metodo que resume la compra recorriendo los objetos
     * e imprime para cada uno de los productos de cada clase.
     * 
     * Los for recorren los arrays y el if comprueba que tiene un valor
     * para poder imprimir ese desglose.
     */
    protected void textoResumenPago(Pan[] pan,Bebidas[] bebidas,Pizzas[] pizza,Pasteles[] pastel){
        System.out.println();
        System.out.println("Resumen de la compra: ");
        System.out.println("----");
        System.out.println("1. Panes:"); 
        for (int i = 0; i < pan.length; i++) {
            if (pan[i].precioTotal > 0) {
                System.out.println();       
                System.out.println("Nombre: " + pan[i].nombreProducto);
                System.out.println("Precio Unidad: " + pan[i].precioProducto);
                System.out.println("Cantidad Seleccionada: "  + (pan[i].cantidadProducto-(pan[i].cantidadRestante)));
                System.out.println("Precio Total de " + pan[i].nombreProducto + ": "+ pan[i].precioTotal);
            }
        }

        System.out.println("----");
        System.out.println("2. Pizzas:"); 
        for (int i = 0; i < pizza.length; i++) {
            if (pizza[i].precioTotal > 0) {
                System.out.println();       
                System.out.println("Nombre: " + pizza[i].nombreProducto);
                System.out.println("Precio Unidad: " + pizza[i].precioProducto);
                System.out.println("Cantidad Seleccionada: "  + (pizza[i].cantidadProducto-(pizza[i].cantidadRestante)));
                System.out.println("Precio Total Pizza: " + pizza[i].precioTotal);
            }
        }

        System.out.println("----");
        System.out.println("3. Pasteles:"); 
        for (int i = 0; i < pastel.length; i++) {
            if (pastel[i].precioTotal > 0) {
                System.out.println();        
                System.out.println("Nombre: " + pastel[i].nombreProducto);
                System.out.println("Precio Unidad: " + pastel[i].precioProducto);
                System.out.println("Cantidad Seleccionada: "  + (pastel[i].cantidadProducto-(pastel[i].cantidadRestante)));
                System.out.println("Precio Total Pastel: " + pastel[i].precioTotal);
            }
        }

        System.out.println("----");
        System.out.println("4. Bebidas:");        
        for (int i = 0; i < bebidas.length; i++) {
            if (bebidas[i].precioTotal > 0) {
                System.out.println();
                System.out.println("Nombre: " + bebidas[i].nombreProducto);
                System.out.println("Precio Unidad: " + bebidas[i].precioProducto);
                System.out.println("Cantidad Seleccionada: "  + (bebidas[i].cantidadProducto-(bebidas[i].cantidadRestante)));
                System.out.println("Precio Total Bebidas: " + bebidas[i].precioTotal);
            }
        }
        
    }

    /*
     * Metodo que imprime la hora que ha sido pagado la compra
     */
    protected void horaDeLaCompra(){
        System.out.println("----");
        System.out.println("Hora del pedido: " + LocalDateTime.now());

    }
    
    /*
     * Metodo que suma todos los preciosTotales de todos los arrays y los muestra
     * 
     * Y devuelve la suma para poder calcular el cambio
     */
    protected double totalAPagar(Pan[] pan,Bebidas[] bebidas,Pizzas[] pizza,Pasteles[] pastel){
        System.out.println("----");
        double suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += pan[i].precioTotal + bebidas[i].precioTotal + pizza[i].precioTotal + pastel[i].precioTotal;
        }
        System.out.println("Total a pagar: " + suma);
        return suma;
    }
    
    /*
     * Metodo que calcula el cambio del pago en efectivo
     */
    protected boolean calculoVueltaEfectivo(double efectivoUsuario, double totalProductos){
        System.out.println("----");
        if (efectivoUsuario > totalProductos) {
            System.out.println("Pago aceptado");
            System.out.println("Cambio: " + (efectivoUsuario-totalProductos));
            return true;
        } else{
            System.out.println("El efectivo que has dado no es suficiente para pagar");
            return false;
        }
    }

    protected void textoPagoConEfectivo(){
        System.out.println("----");
        System.out.print("Introduce tu importe para la compra: ");
    }

    /*
     * Metodo que muestra una animacion cuando esta leyendo la tarjeta
     */
    protected void textoPagoTarjeta()throws InterruptedException{
        System.out.println("----");
        System.out.println("Acerque la tarjeta al lector");
        Thread.sleep(4000);

        char numeros [] = {'|','/', '-','\\','|','/', '-','\\'};
        System.out.println("Leyendo la tarjeta, espere porfavor");
        for(int i = 0; i < numeros.length; i++){
            System.out.print("\r" + numeros[i]);
            Thread.sleep(1100);
        }
        
    }

    /*
     * El metodo muestra un mensaje si la tarjeta a sido aceptada
     * Pero puede que no sea aceptada por un 3% de que falle el lector
     */
    protected boolean tarjetaAceptadaORechazada(){
        System.out.println();
        System.out.println("----");
        if (Math.random() < 0.03) {
            System.out.println("Lo sentimos, la tarjeta ha sido rechazada");
            return false;
        } else {
            System.out.println("La tarjeta ha sido aceptada, disfrute de su compra y tenga un buen dia!");
            return true;
        }
    }
}