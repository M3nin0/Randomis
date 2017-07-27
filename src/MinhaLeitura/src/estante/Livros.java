package estante;

public class Livros {

	
	String nome;
	double peso;
	
	Livros(){
		
		//this(1,"livro", 1.15);
	}
	
	Livros(String nome, double peso){
	
		this.nome = nome;
		this.peso = peso;
	}
	
	//Getters and setters
		
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	

}
