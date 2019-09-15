package OOAEP;

import java.util.List;



public class Aluno {
	private String nome;
	private double nota;
	private double id;
	
	
	public Aluno (double id,String nome, double nota ) {
		
		this.nome = nome;
			if(nota<0 || nota>10.0) {
				throw new RuntimeException("A NOTA NAO PODE SER MAIOR QUE 10 OU MENOR QUE 0!!");
			}
		this.nota= nota;
		this.id=id;
	}
	public String getNome () {
		return nome;
	}
	public double id() {
		return id;
	}
	public static void imprimir(List<Avaliacao> turmas) {
		System.out.println("-------------------------");
		for (Avaliacao turma : turmas) {
			System.out.println("Turma: " + turma.getProfessor()+"| "+ turma.getAvaliacao() + "| Data: "+ turma.getData());
			for (Aluno aluno : turma.getAluno()) {
				System.out.println("Alunos: " + aluno.getNome());
				
			}
			
		}
		
	}
	
	}

	

