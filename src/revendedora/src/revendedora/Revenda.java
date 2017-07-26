package revendedora;

import javax.swing.JOptionPane;

public class Revenda {
	
	public static void main(String[] args) {
		
		String choose, key;
		Carro carro = new Carro();
		int ID = 0;
		
		CadastraCarro telaCadastro = new CadastraCarro();
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema da revenda XPTO");
		
		choose = JOptionPane.showInputDialog("Escolha o que deseja fazer\n"+
				"1 - Cadastrar\n" +
				"2 - Pesquisar\n" +
				"3 - Exibir todo os carros cadastrados\n" +
				"4 - Sair");
		
		switch(choose) {
		case "1":
			key = JOptionPane.showInputDialog("Área administrativa!\n" +
												"Insira a senha para acessar");
			if(key.equals("12345")) {
				
				do {
				
					ID++;
					carro.setID(ID);
				
					telaCadastro.cadastrar();
					choose = JOptionPane.showInputDialog(null, "Deseja cadastrar mais carros?");
				
					
				
				}while(choose.equals("sim"));
				
				Revenda.main(args);
				
			}else {
				JOptionPane.showMessageDialog(null, "Errado! Esse evento será reportado ao admin!");
			}
						
		case "4":
			System.exit(0);
		}
		
	}

}
