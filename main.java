import java.util.Scanner;
import java.util.Stack;

public class main {

    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        utilites u = new utilites();
        Stack<Integer> pila = new Stack<>();

        while(seguir){
            System.out.println("Ola vamos a mirar un cosiaco de no me acuerdo como se llama CRUD XD ");
            System.out.println("Escoja cualquier cosa");
            System.out.println("1. llenar pia");
            System.out.println("2. mostrar pila ");
            System.out.println("3. modificar ");
            System.out.println("4. eliminar ");
            System.out.println("5. salir");
            int opt = u.ValidarEntero(sc);
            System.out.println(opt);
            switch (opt) {
                case 1:
                    pila = u.LlenarPIla(pila);
                    break;
                case 2:
                    u.MostarPila(pila);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("chao ");
                    seguir = false;
                    break;            

                default:
                    break;
            }

        }
    }
    
}
