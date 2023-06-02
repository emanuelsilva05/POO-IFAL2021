package Exercício7;

public class MeiosDeTransporte {
        protected String nome;
        protected int passageiro;
        protected int velocidade;
       
        
        public void ligar(){
      	  System.out.println("Ligando......");
        }
   
        public void emVelocidade(){
        	System.out.println("Em movimento......");
        }
        
        public MeiosDeTransporte(String nome, int passageiro, int velocidade) {
        	this.nome = nome;
        	this.passageiro=passageiro;
        	this.velocidade=velocidade;
        }
        
        
        public static void main(String[] args) {
        	
        	Carro carro1= new Carro("Fusca",4,150,1880,15000);
        	carro1.lavar();
        	carro1.ligar();
        	carro1.emVelocidade();
        	
        	Moto moto1= new Moto("50tinha",2,50,35,"honda");
        	moto1.abastecer();
        	moto1.ligar();
        	moto1.emVelocidade();
        	
        	Aviao aviao1= new Aviao ("14-bis",0,31,100,false);
        	aviao1.subir();
        	aviao1.ligar();
        	aviao1.emVelocidade();
        	
        
        
        
        }
        




}
