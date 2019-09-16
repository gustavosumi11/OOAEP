package OOAEP;

import java.util.ArrayList;
import java.util.List;


public class Avaliacao {

	private double nota;
	private String avaliacao;
	private String data;
	private String professor;
	private Integer codDisciplina;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Notas> notas = new ArrayList<Notas>();
	
	public Avaliacao(String avaliacao, String data, String professor, Integer codDisciplina) {
		this.avaliacao=avaliacao;
		this.data = data;
		this.codDisciplina= codDisciplina;
		this.professor = professor;
		
	}
	public List<Notas> getNota() {
		return notas;
		
	}
	public void adicionarTurma (Aluno turma) {
		if (!this.alunos.contains(turma)) { 
			this.alunos.add(turma);
			//turma.setAvaliacaoTurma(this);
		}
	}
	public List<Aluno> getAluno() {
		return alunos;
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}
	public String getData() {
		return data;
	}
	public String getProfessor() {
		return professor;
	}
	public double setNotas() {
		return nota;
	}
		
		
	
	
}
