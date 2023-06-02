package Exercício7;

public class Moto extends MeiosDeTransporte {

	  private int CalibragemPneus;
      private String fabricante;
      
      public void abastecer(){
    	  System.out.println("abastecendo......");
      }


      public Moto(String nome, int passageiro, int velocidade, int CalibragemPneus,String fabricante) {
  		super(nome, passageiro, velocidade);
  		
  		this.CalibragemPneus= CalibragemPneus;
  		this.fabricante = fabricante;
  	}


}
