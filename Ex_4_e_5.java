//kauan rosso e cesar 3-52
// pagina 33
import java.util.Scanner; 

public class Ex_4_e_5 {
    public static void main(String[] args) {
     float vHora, hTrabalhadas, Salario; 
    Scanner Ler = new Scanner(System.in); 

    System.out.print("Digite o valor da hora de trabalho: ");
     vHora = Ler.nextFloat();
     System.out.print("Digite o número de horas trabalhadas: ");
     hTrabalhadas = Ler.nextFloat();
        
     Salario = (hTrabalhadas * vHora); 
        
        if (Salario < 50){ 
        System.out.println("Salario é infeiror a R$50");
        System.out.println("Atenção  dirija-se em direção ao Hotel!");
        }else{
        System.out.println("Salário: " + Salario); 
        }
        Ler.close();
}
