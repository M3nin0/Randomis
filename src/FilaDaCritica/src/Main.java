import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	private void requisito(Queue fila, String nome, int idade) {
		
		if(idade >= 65) {
			System.out.println("Por ter mais idade o " + nome + " entrou na fila");
			System.out.println(nome + " foi atendido na frente de " + fila.peek());
		}else {
			System.out.println("Mas não entrou pois não tem idade para isso!");
		}
		
}
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList();
		
		Main requisito = new Main();
		
		Pessoa p1 = new Pessoa("Pedro", 1.75, 23);
		Pessoa p2 = new Pessoa("João", 1.55, 19);
		Pessoa p3 = new Pessoa("José", 1.90, 35);
		Pessoa p4 = new Pessoa("Franscisco", 1.60, 89);
		Pessoa p5 = new Pessoa("Thiago", 1.90, 56);
		Pessoa p6 = new Pessoa("Ana", 1.67, 54);
		
		fila.offer(p1.getNome());
		fila.offer(p2.getNome()); 
		fila.offer(p3.getNome());
		
		System.out.println("Bem-vindo a fila");
		
		System.out.println("Na fila há " + fila.size() + " pessoas, são elas");
		for(String pessoal: fila) {
			System.out.println(pessoal);
		}
		
		System.out.println("Enquanto " + p1.getNome() + " está sendo atendido " +
							p4.getNome() + " quer entrar na fila, de forma preferencial\n");
		
		//para entrar na fila preferencial é necessário ter mais/ou de 65 anos
		requisito.requisito(fila, p4.getNome(), p4.getIdade());
		
		System.out.println("Vendo " + p4.getNome() + " passando na frente " + p5.getNome() + " tenta fazer o mesmo...");
		requisito.requisito(fila, p5.getNome(), p5.getIdade());
		
		
		System.out.println("Mais tarde naquele mesmo dia uma moça estava dizendo que tinha direito de entrar"
				+ "por ter uma idade avançada, então mandamos seus documentos para análise");
		
		requisito.requisito(fila, p6.getNome(), p6.getIdade());
		
	}

}
