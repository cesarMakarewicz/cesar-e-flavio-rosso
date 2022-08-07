//kauan rosso e cesar 
//pagina 33

import java.util.Scanner;

public class numero {

 public static void main(String[] args) {

    int i;
    Scanner Scan = new Scanner(System.in);

    System.out.println("Insira um numero");
    int n = Scan.nextInt();

    Scan.close();

    if (n % 2 == 0) {
    System.out.print("O numero e par");
    } else {
    System.out.println("O numero e impar");
        }
    if ((n == 1) || (n == 2)) {
    System.out.print("O numero e primo");
        }
     for (i = 1; i <= n; i++) {
            i++;
        }
     if (i == 2) {
    System.out.println("O numero " + String.valueOf(n) + " e primo");

        }
    }

}

