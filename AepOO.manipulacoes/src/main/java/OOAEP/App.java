// AEP Programção Orientada a Objetos - 10/09/19

package OOAEP;

import java.util.ArrayList;
import java.util.List;





public class App {
	static String aep;
	public static void main(String[] args) {
		List<Avaliacao> turmas = new ArrayList<Avaliacao>();
		List<Notas> nota = new ArrayList<Notas>();
		Notas matematica = new Notas ();
		
		//Adicionando notas
		matematica.Notas(1,5);
		matematica.Notas(2,5);
		matematica.Notas(3,6);
	
	
		
        //Criando Alunos
		Aluno a111 = new Aluno (1,"Gustavo",4);
		Aluno a112 = new Aluno (2, "Felipe",6);
		Aluno a113 = new Aluno (3,"Larissa",7);
		Aluno a114 = new Aluno (4,"Fernanda",8);
		
		//Criando avaliações		
		Avaliacao prova1 = new Avaliacao("Matematica", "12/09/19","Messias",1);
		Avaliacao prova2 = new Avaliacao("Ingles.", "12/09/19","Cleber",2);
		prova1.adicionarTurma(a111);
		prova2.adicionarTurma(a111);
		prova1.adicionarTurma(a112);
		prova2.adicionarTurma(a113);
		prova2.adicionarTurma(a114);
		
		
	
		//adcionando provas
		turmas.add(prova1);
		turmas.add(prova2);
		
		nota.add(matematica);

		aep();
		//Imprimi as materias e resultado
		Aluno.imprimir(turmas);
		//Notas.imprimirNotas(nota);
		
		
	}
	public static String aep() {
		System.out.println("AEP PROGRAMAÇÃO ORIENTADA A OBJETOS.");
		System.out.println("4º Semestre ENG.SOFTWARE - UNICESUMAR 2019");
		System.out.println("MANIPULAÇÃO - ALUNO/AVALIAÇÃO");
		return aep;
		
	}

		
	}
		


