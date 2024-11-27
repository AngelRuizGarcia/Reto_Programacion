import java.util.Scanner;

public class AplicacionPrincipal {
    public static void main(String[] args) {
        //Los llamamos 0 pq son los primeros.
        Scanner sc = new Scanner(System.in);
        Utilidades util0 = new Utilidades();
        Pan pan0 = new Pan(); 
        Bebidas bebidas0 = new Bebidas();
        Pasteles pasteles0 = new Pasteles();
        Pizzas pizza0 = new Pizzas();
        Operaciones opera0 = new Operaciones();
         menuPrincipal(util0, sc);
    }

protected static void menuPrincipal(Utilidades util0, Scanner sc){
    util0.textoPrincipio();
    util0.textoPrincipal();
    int cantidad;
    System.out.println("Cuanta cantidad desea?");  
    cantidad = sc.nextInt();
}
protected static void menuPanes(){

}
}
