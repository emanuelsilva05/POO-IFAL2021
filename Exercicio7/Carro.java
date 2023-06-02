package Exercício7;

public class Carro extends MeiosDeTransporte {

	private int anoFabricaçao;
     private int kmRodado;
     
     public void lavar(){
    	 System.out.println("Lavando......");
     }

     public Carro(String nome, int passageiro, int velocidade, int anoFabricaçao, int kmRodado) {
 		super(nome, passageiro, velocidade);
 		
 		this.anoFabricaçao= anoFabricaçao;
 		this.kmRodado= kmRodado;
 	}




}
