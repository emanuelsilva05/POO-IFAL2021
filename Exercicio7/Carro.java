package Exerc�cio7;

public class Carro extends MeiosDeTransporte {

	private int anoFabrica�ao;
     private int kmRodado;
     
     public void lavar(){
    	 System.out.println("Lavando......");
     }

     public Carro(String nome, int passageiro, int velocidade, int anoFabrica�ao, int kmRodado) {
 		super(nome, passageiro, velocidade);
 		
 		this.anoFabrica�ao= anoFabrica�ao;
 		this.kmRodado= kmRodado;
 	}




}
