package revendedora;

public class Carro {
	
	int id;
	
	String marca;
	String cor;
	String ano;
	String preco;
	
	//Definindo constrututores
	Carro(){
		
	}
	
	Carro(String marca, String cor, String ano, String preco){
		
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.preco = preco;
	
	}
	
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getAno() {
		return this.ano;
	}
	
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getPreco() {
		return this.preco;
	}
}
