// kauan rosso e cesar 3-52
//Página 26 


import java.util.Scanner; 

public class Ex_1_e_2 { 

    private static float h, b, B, area;


    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in); 

    System.out.println("Digite a altura: ");
    h = ler.nextFloat();
    System.out.println("Digite a base menor: ");
    b = ler.nextFloat();
    System.out.println("Digite a base maior: ");
    B = ler.nextFloat();

    area = ((h * (b + B)) / 2); 
    System.out.println("Área do trapézio (exata): " + area); 
    System.out.println("Área do trapézio (arredondada): " + Math.round(area));

    ler.close();

    }
}
