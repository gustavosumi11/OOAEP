// AEP Programção Orientada a Objetos - 10/09/19

package OOAEP;

import java.util.ArrayList;
import java.util.List;

public class App {
	static String aep;
	public static void main(String[] args) {
		List<Avaliacao> turmas = new ArrayList<Avaliacao>();

		Aluno a111 = new Aluno (1,"Gustavo",6);
		Aluno a112 = new Aluno (2, "Felipe",5);
		Aluno a113 = new Aluno (3,"Larissa",7);
		Aluno a114 = new Aluno (4,"Fernanda",3);
		Aluno a115 = new Aluno (5,"Clara",4);
		
		
				
		Avaliacao prova1 = new Avaliacao("Matematica", "12/09/19","Messias");
		Avaliacao prova2 = new Avaliacao("Ingles.", "12/09/19","Cleber");
		prova1.adicionarTurma(a111);
		prova1.adicionarTurma(a112);
		prova2.adicionarTurma(a113);
		prova2.adicionarTurma(a114);
		
		
		turmas.add(prova1);
		turmas.add(prova2);
		
		
		aep();
		Aluno.imprimir(turmas);
		
		
	}
	public static String aep() {
		System.out.println("AEP PROGRAMAÇÃO ORIENTADA A OBJETOS.");
		System.out.println("4º Semestre ENG.SOFTWARE - UNICESUMAR 2019");
		System.out.println("MANIPULAÇÃO - ALUNO/AVALIAÇÃO");
		return aep;
		
	}
	

}
