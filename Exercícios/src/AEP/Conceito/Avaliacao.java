package AEP.Conceito;

import java.util.ArrayList;
import java.util.List;


public class Avaliacao {
	private String avaliacao;
	private String data;
	private String professor;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Avaliacao(String avaliacao, String data, String professor) {
		this.avaliacao=avaliacao;
		this.data = data;
		if(professor == null) {
			throw new RuntimeException("É necessário inserir um professor para aplicar a prova!!");
		}
		this.professor = professor;
		
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
	
}
