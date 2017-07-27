package biblioteca;

public class Leitor extends Pessoa {
	
	String nome;
	String gosto;
	int livrosLidos;
	int idBiblioteca;
	double altura;
	int idade;
	
	
	Leitor(String nome, int idade, double altura, String gosto, int livrosLidos, int idBiblioteca){
		
		
		this.gosto = gosto;
		this.livrosLidos = livrosLidos;
		this.idBiblioteca = idBiblioteca;
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
}
