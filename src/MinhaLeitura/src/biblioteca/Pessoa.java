package biblioteca;

public class Pessoa {

	String nome;
	double altura;
	int idade;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, double altura, int idade) {
		
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}

}


