package OOAEP;

import java.util.List;



public class Aluno {
	private static double numeroDeAlunos;
	private static double var;
	private String nome;
	//private double nota;
	private Integer id;
	private double nota;
	
	
	public Aluno (Integer id,String nome, double nota) {
		this.nota = nota;
		this.nome = nome;
		/*	if(nota<0 || nota>10.0) {
				throw new RuntimeException("A NOTA NAO PODE SER MAIOR QUE 10 OU MENOR QUE 0!!");
			}
		this.nota= nota;*/
		this.id=id;
	}
	public String getNome () {
		return nome;
	}
	public double id() {
		return id;
	}
	public double nota() {
		return nota;
	}
	
	public static void imprimir(List<Avaliacao> turmas) {
		System.out.println("-------------------------");
		System.out.println("LISTA DE AVALIAÇÕES E ALUNOS");
		for (Avaliacao turma : turmas) {
			System.out.println("Turma: " + turma.getProfessor()+"| "+ turma.getAvaliacao() + "| Data: "+ turma.getData());
			for (Aluno aluno : turma.getAluno()) {
				System.out.println("ID: "+aluno.id+" "+"Nome: " + aluno.getNome()+ " "+ aluno.nota());
				var=aluno.nota+var;
	
			}
			
				System.out.println("Média da turma: "+ var/turmas.size());
				
				
			}
		}
	
	
	}
	


	

