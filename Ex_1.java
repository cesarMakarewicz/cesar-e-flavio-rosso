//kauan rosso e cesar 3-52
//Página 33 

public class Ex_1 {
  public static void main(String[] args){
  int totalImpar = 0;
  long totalPar = 1; 
  int num;
      
  for(num = 0; num <= 30; num++) { 
    if((num % 2 == 1)) { 
  totalImpar += num; 
   }else{
  totalPar *= num;
 }
  }        
System.out.println("Multiplicação dos pares: " + totalPar);       System.out.println("Soma dos ímpares: " + totalImpar);       
    }
}