package aula20190903.Colheitadeira;

public class Aluno {
	// N�mero de s�rie
	private final int N�meroDeS�rie;
	// Capacidade do tanque
	private final double CapacidadeDoTanque;
	//Capacidade de carga
	private final double CapacidadeDeCarga;
	//Apelido Carinhoso
	private  String ApelidoCarinhoso;
	
	public Aluno (String ApelidoCarinhoso, double CapacidadeDeCarga, double CapacidadeDoTanque,int N�meroDeS�rie  ) {
		
		this.ApelidoCarinhoso = ApelidoCarinhoso;
		
	
		this.CapacidadeDeCarga = CapacidadeDeCarga;
		this.CapacidadeDoTanque = CapacidadeDoTanque;
		this.N�meroDeS�rie = N�meroDeS�rie;
	}
	public Aluno (double CapacidadeDeCarga, double CapacidadeDoTanque,int N�meroDeS�rie) {
		this.CapacidadeDeCarga = CapacidadeDeCarga;
		this.CapacidadeDoTanque = CapacidadeDoTanque;
		this.N�meroDeS�rie = N�meroDeS�rie;
		
	}
	public String getApelidoCarinhoso(String Nome) {
		return ApelidoCarinhoso;
		
	}
	public Double getCapacidadeDeCarga() {
		return CapacidadeDeCarga;
	}
	public Double getCapacidadeDoTanque() {
		return CapacidadeDoTanque;
	}
}
