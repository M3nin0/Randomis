package biblioteca;

import java.util.Stack;

public class OrdemDeLeitura {
	
	public static void main(String[] args) {
		
		Leitor leitor1 = new Leitor("Rebeca", 31,1.89, "Livros de terror", 450, 456);
		//Depois irei verificar este erro do extends
		leitor1.setNome("Rebeca");
		
		//Definindo Stack
		Stack<String> livros = new Stack<>();
		//Definindo Array dos titulos
		String titulos[] = {
			"Clube da luta",
			"Condenada",
			"Senhor das moscas",
			"Guia politicamente incorreto"
		};
		
		//Livros que ela precisa ler
		//For each
		for(String titulo: titulos) {
			livros.push(titulo);
		}
		
		System.out.println(leitor1.getNome() + " gosta muito de ler");
		System.out.println("Ela irá ler no final de semana os seguintes livros");
		
		for(String titulo: titulos) {
			System.out.println(titulo);
		}
		
		System.out.println("No sabado " + leitor1.getNome() + " leu os livros");
		
		for(int i = 0; i < livros.size() - 1; i++) {
			System.out.println(livros.pop());
		}
		
		System.out.println("E no domingo ela leu ");
		
		for(int i = 0; i < livros.size() + 1; i++) {
			System.out.println(livros.pop());
		}
		
	}

}
