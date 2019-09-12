package aula20190903.Colheitadeira;

public class Aluno {
	// Número de série
	private final int NúmeroDeSérie;
	// Capacidade do tanque
	private final double CapacidadeDoTanque;
	//Capacidade de carga
	private final double CapacidadeDeCarga;
	//Apelido Carinhoso
	private  String ApelidoCarinhoso;
	
	public Aluno (String ApelidoCarinhoso, double CapacidadeDeCarga, double CapacidadeDoTanque,int NúmeroDeSérie  ) {
		
		this.ApelidoCarinhoso = ApelidoCarinhoso;
		
	
		this.CapacidadeDeCarga = CapacidadeDeCarga;
		this.CapacidadeDoTanque = CapacidadeDoTanque;
		this.NúmeroDeSérie = NúmeroDeSérie;
	}
	public Aluno (double CapacidadeDeCarga, double CapacidadeDoTanque,int NúmeroDeSérie) {
		this.CapacidadeDeCarga = CapacidadeDeCarga;
		this.CapacidadeDoTanque = CapacidadeDoTanque;
		this.NúmeroDeSérie = NúmeroDeSérie;
		
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
