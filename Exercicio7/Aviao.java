package Exercício7;

	public class Aviao extends MeiosDeTransporte {

		private double altura;
		private boolean temAeromoca;
		
		public void subir() {
			System.out.println("Subindo......");
		}

		public Aviao(String nome, int passageiro, int velocidade, double altura, boolean temAeromoca) {
			super(nome, passageiro, velocidade);
			
			this.altura= altura;
			this.temAeromoca=temAeromoca;
		}
	
	
	
	}
