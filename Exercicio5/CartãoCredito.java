
public class CartãoCredito {
	//atributos
	String titular; 
	String numero;
	String bandeira;
    int anoValidade;
	double limite;
	
	//métodos
	void comprar() {
		      if(limite >= 200) {
		    System.out.println("Comprando no cartão de crédito");
		    limite = limite-200;}
	
		      else {
			System.out.println("O limite do cartão está estourado");}
	}
	
	void trocarCartão() {
		       if(2021>anoValidade) {
		     System.out.println("Precisa de um novo cartão"); 
		      }
		       else {
		    	System.out.println("O cartão ainda está válido");  
		      }
	}
	
	
	public static void main(String[] args) {
        CartãoCredito cartão1 = new CartãoCredito();
        cartão1.titular="Rodrigo C Pereira";   
        cartão1.numero="1234 5678 9101 7788";    
        cartão1.anoValidade= 2023;
        cartão1.bandeira="VISA";
        cartão1.limite= 250.50;
        cartão1.comprar();
        cartão1.trocarCartão();
	}

}
