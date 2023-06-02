package Exercício6;

public class Medicamento {
	
	public  String nome;
	protected int  quantidade;
	private boolean controlado;
	private int dosagem;
	public  String uso;
	
	public boolean getControlado() {
		return controlado;
	}
	public void setControlado(boolean controlado) {
		this.controlado = controlado;
	}
	
	public int getDosagem() {
		return dosagem;
	}
	public void setDosagem(int dosagem) {
		
		if(dosagem < quantidade ) {
			this.dosagem = dosagem;
		} else {
			System.out.println("valor inválido! Dosagem inferior a quantidade do medicamento.");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Medicamento medicamento1 = new Medicamento();
		
		medicamento1.nome= "Dipirona";
		medicamento1.quantidade = 10;
		medicamento1.uso = "Dor de cabeça" ;
		
		medicamento1.setControlado(false);
		medicamento1.setDosagem(1);
		
		System.out.println("Controlado: " + medicamento1.getControlado());
		System.out.println("Dosagem: " + medicamento1.getDosagem());
		
		
Medicamento medicamento2 = new Medicamento();
		
		medicamento2.nome= "Cimegripe";
		medicamento2.quantidade = 20;
		medicamento2.uso = "Febre, coliza, dor muscular." ;
		
		medicamento2.setControlado(false);
		medicamento2.setDosagem(1);
		
		System.out.println("Controlado: " + medicamento2.getControlado());
		System.out.println("Dosagem: " + medicamento2.getDosagem());
	}
	
}