package Exercício_revisão;
import java.util.Scanner;
public class Exercício_1 {
    
    public static void main(String[] args) {
      String localFesta;
      String nomeAniversariante;
      int anosAniversariante;
      int pessoasBolo;
      double horarioFesta;
      double custarSalgadinho;
      boolean festaEmCasa;
      boolean festaTemTema;
        
    Scanner entrada= new Scanner(System.in);    
    
      System.out.println("Qual o local da festa?");
      localFesta= entrada.next();
      
      System.out.println("Qual o nome do(a) aniversariante?");  
      nomeAniversariante = entrada.next();
        
      System.out.println("Quantos anos o (a) aniversariante vai fazer?");  
      anosAniversariante = entrada.nextInt();
        
      System.out.println("o bolo é para quantas pessoas?");  
      pessoasBolo = entrada.nextInt();
        
      System.out.println("Qual o horário da festa?");  
      horarioFesta = entrada.nextDouble();
        
      System.out.println("Quanto vai custar os salgadinhos?" );  
      custarSalgadinho = entrada.nextDouble();
        
      System.out.println("A festa será em casa?");  
      festaEmCasa = entrada.nextBoolean();
        
      System.out.println("A festa vai ter tema?"); 
      festaTemTema = entrada.nextBoolean();
        
      double subtotal = custarSalgadinho + 20;
         
         System.out.println(" ");
         System.out.println("Suas Respostas:");
         System.out.println("Qual o local da festa? " + localFesta);        
         System.out.println("Qual o nome do(a) aniversariante? " + nomeAniversariante);
         System.out.println("Quantos anos o (a) aniversariante vai fazer? " + anosAniversariante);
         System.out.println("o bolo é para quantas pessoas? " + pessoasBolo);
         System.out.println("Qual o horário da festa? " + horarioFesta);
         System.out.println("Quanto vai custar os salgadinhos? " + custarSalgadinho);
         System.out.println("A festa será em casa? " + festaEmCasa);
         System.out.println("A festa vai ter tema? " + festaTemTema);
         System.out.println("R$ " + subtotal + " é o valor parcial da festa");
         
        entrada.close();
        
    }
    
}
