package estante;

import java.util.HashMap;

public class Estante{
	
	HashMap<Integer, String> livros = new HashMap<>();
	Livros livro = new Livros();

	String nome;
	String cor;
	int qtndLivros;
	int id;
	double peso;
	
	public Estante(int qntdLivros, String cor) {
		
		this.qtndLivros = qntdLivros;
		this.cor = cor;
	
	}

	public void setId(int id) {
		this.id = id;
	
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setQntdLivros(int qntdLivros) {
		this.qtndLivros = qntdLivros;
	}
	
	public int getQntdLivros() {
		return this.qtndLivros;
	}
	
	public void colocaLivro(int id, Livros livro) {
		
		livros.put(id, livro.getNome());
		
	}
	
	public String buscaLivros(int id) {
		
		if(livros.containsKey(id)) {
			return "O livro foi encontrado na estante";
		}

		return "Não foi possível identificar o livro";
		
		
	}
	
	public String buscaLivros(String nome) {
		
		if(livros.containsValue(nome)) {
			return "O livro foi encontrado na estante";
		}
		
		return "Não foi possível identificar o livro";
		
	}
}
