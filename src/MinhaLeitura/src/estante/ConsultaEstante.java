package estante;

public class ConsultaEstante {
	
	public static void main(String[] args) {
		
		Estante estante = new Estante(2, "Marrom");
		Livros livro1 = new Livros("A cor que veio do céu",1.22);
		Livros livro2 = new Livros("O rei de amarelo", 1.10);
		Livros livro3 = new Livros("Feliz ano velho", 1.00);
		
		//Adicionando alguns livros a estante
		estante.colocaLivro(1, livro1);
		estante.colocaLivro(2, livro2);
		estante.colocaLivro(3, livro3);
		
		//buscando livros por ID
		System.out.println(estante.buscaLivros(1));
		System.out.println(estante.buscaLivros(4));
		
		//buscando livros por Nome
		System.out.println(estante.buscaLivros("Feliz ano velho"));
		System.out.println(estante.buscaLivros("Animal farm"));
		
	}

}
