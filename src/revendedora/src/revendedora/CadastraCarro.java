package revendedora;

import javax.swing.JOptionPane;

public class CadastraCarro {
	
	CadastraCarro(){
		
	}
	
	public void cadastrar() {
		
		String marca, cor, ano, preco;
		
		Carro carro = new Carro();
		
		JOptionPane.showMessageDialog(null, "Cadastrar novo carro");
		
		marca = JOptionPane.showInputDialog("Insira a marca do carro");
		carro.setMarca(marca);
		
		cor = JOptionPane.showInputDialog("Insira a cor do carro"); 
		carro.setCor(cor);
		
		ano = JOptionPane.showInputDialog("Insira o ano do carro");
		carro.setAno(ano);
		
		preco = JOptionPane.showInputDialog("Insira o preço do carro");
		carro.setPreco(preco);
		
		try {
			SQLite dbCon = new SQLite("db.db");
			dbCon.iniciaBanco();
			
			dbCon.adiciona(carro);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
