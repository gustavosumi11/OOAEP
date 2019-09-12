package AEP.Conceito;



public class Aluno {
	private String nome;
	private double nota;
	private double id;
	private Avaliacao avaliacao;
	
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
	public void setAvaliacao(Avaliacao avaliacao) {
		
		this.avaliacao = avaliacao;
		this.avaliacao.adicionarAluno(this);
	}
	
}
