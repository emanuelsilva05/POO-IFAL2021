
public class Cart�oCredito {
	//atributos
	String titular; 
	String numero;
	String bandeira;
    int anoValidade;
	double limite;
	
	//m�todos
	void comprar() {
		      if(limite >= 200) {
		    System.out.println("Comprando no cart�o de cr�dito");
		    limite = limite-200;}
	
		      else {
			System.out.println("O limite do cart�o est� estourado");}
	}
	
	void trocarCart�o() {
		       if(2021>anoValidade) {
		     System.out.println("Precisa de um novo cart�o"); 
		      }
		       else {
		    	System.out.println("O cart�o ainda est� v�lido");  
		      }
	}
	
	
	public static void main(String[] args) {
        Cart�oCredito cart�o1 = new Cart�oCredito();
        cart�o1.titular="Rodrigo C Pereira";   
        cart�o1.numero="1234 5678 9101 7788";    
        cart�o1.anoValidade= 2023;
        cart�o1.bandeira="VISA";
        cart�o1.limite= 250.50;
        cart�o1.comprar();
        cart�o1.trocarCart�o();
	}

}
