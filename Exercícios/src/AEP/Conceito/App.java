// AEP Programção Orientada a Objetos - 10/09/19

package AEP.Conceito;

import java.util.ArrayList;
import java.util.List;


public class App {
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		Avaliacao prova1 = new Avaliacao("Matematica", "12/09/19","Messias");
		Aluno c1 = new Aluno (31,"Gustavo Sumi",10.0);
		System.out.println(c1.getNome()+" "+ c1.id());
	
	}
}
