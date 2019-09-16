package OOAEP;

import java.util.ArrayList;
import java.util.List;

public class Notas {


	private double nota;
	private Integer idAluno;
	List<Notas> notas = new ArrayList<Notas>();

	public void Notas ( Integer idAluno, double valor )
	{	
		if(nota<0 || nota>10) {
			throw new RuntimeException("Nota inválida (Deve ser menor que 10 e maior que 0!");
		}
		this.nota = valor;
		if(idAluno<0) {
			throw new RuntimeException("ID de aluno inválido!!");
		}
		this.idAluno = idAluno;
	}
	public double setNotas(double nota) {
		this.nota= nota;
		return nota;
	
	}
	
	
	
	

}
