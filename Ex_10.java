//kauan rosso e cesar 
// essa e a 10 que o sor passou em sala

import java.util.Scanner;

public class Antecessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int antecessor,  um_numero;
        System.out.print("Digite o valor do um numero: ");
        um_numero = in.nextInt();
        in.nextLine();
        antecessor=um_numero-1;
        System.out.println("O valor do antecessor: " + antecessor);
       
    }
}

