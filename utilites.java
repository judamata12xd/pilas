import java.util.Scanner;
import java.util.Stack;

public class utilites {
    Scanner sc = new Scanner(System.in);
    

    public int ValidarEntero(Scanner sc){

        while(!sc.hasNextInt()){
            System.out.println("Ingrese un numero deje de ser bobo xd"); //el has next valida si ingreso un entero 
            sc.nextLine();
        }
        return sc.nextInt();
    }

      public double Validardecimal(Scanner sc){

        while(!sc.hasNextDouble()){
            System.out.println("Ingrese un numero deje de ser bobo xd"); //el has next valida si ingreso un entero 
            sc.nextLine();
        }
        return sc.nextInt();
    }


    public int ValidarRango(int n1, int n2, int numero){    
        utilites u = new utilites();
        while (numero < n1 || numero > n2) {
            System.out.println("igresa una opcion entre: " + n1 + " y " + n2);
            numero = u.ValidarEntero(sc);
        }
        return numero;
    }


    public Stack<Integer> LlenarPIla(Stack<Integer> p){

        utilites u = new utilites();           
        boolean continuar = true;
        int numero = 0, opt = 0;
        while (continuar) {
            System.out.println("Ingrese el numero");
            numero = u.ValidarEntero(sc);
            p.push(numero);
            System.out.println("Desea agregar mas registros 1= si , 2 = no");
            opt = u.ValidarEntero(sc);
            opt = u.ValidarRango(1, 2, opt);
            if (opt == 2) {   //Mide el rango de la matriz 
                continuar = false;
            }
            
        }
        return p;
    }

    public void MostarPila(Stack<Integer> p){
        System.out.println(p);
    }
    
}
