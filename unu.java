
import java.util.Scanner;

public class unu {
    
      public static void main(String args[]) 
    {
     Scanner Captura=new Scanner(System.in); 
     
    int N1 ;
    int N2 ; 
    
    System.out.println("Digite el primer digito:  ");
    N1=Captura.nextInt();
    
    System.out.println("Digite el segundo digito:  ");
    N2=Captura.nextInt();
     
            
    
    int suma = N1+N2;
    
    if (N1==N2){
        
        System.out.println("No se hace la suma");
        
    }
    else{
        System.out.println("La suma es:" + suma);
    }
}}
