
public class Curso {
  //atributos
	String nomeCurso;
	String dura��o;
	boolean taOnline;
	String professor;
	String cidadeInstitui��o;
	
  //m�todos
	void inscreverCurso() {
		System.out.println("Inscrevendo-se no curso...");
	}
	void assistirAula() {
		System.out.println("Assistindo aos aulas...");
	}
	void fazerProva() {
		System.out.println("Fazendo prova...");
	}
	void tirarDuvida() {
		System.out.println("Tirando D�vidas...");
	}
	
	public static void main(String[] args) {
		
		Curso curso1= new Curso();
		curso1.nomeCurso="Curso de Python";
		curso1.dura��o="6 meses";
		curso1.taOnline=true;
		curso1.cidadeInstitui��o="Vi�osa-Al";
		curso1.professor="Carlos";
		curso1.fazerProva();
		curso1.inscreverCurso();
		
		
		Curso curso2= new Curso();
		curso2.nomeCurso="Curso de Matem�tica";
		curso2.dura��o="3 meses";
		curso2.taOnline=false;
		curso2.cidadeInstitui��o="Cajueiro-Al";
		curso2.professor="Emanuel";
		curso2.assistirAula();
		curso1.tirarDuvida();
	}
}
