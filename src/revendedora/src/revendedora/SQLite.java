package revendedora;

import java.sql.*;

public class SQLite {
	
	//Definindo uma variavel do tipo Connection com nome conn
	private Connection conn;
	
	//Variavel do tipo Statement com nome stm 
	private Statement stm;
	
	//Construtor
	public SQLite(String arquivo) throws SQLException, ClassNotFoundException{
		Class.forName("org.sqlite.JDBC");
		
		this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
		this.stm = this.conn.createStatement();
	}
	
	public void iniciaBanco() {
		try {
			//caso seja necessário remover a query
			//this.stm.executeUpdate("DROP TABLE IF EXISTS carros");
			
			this.stm.executeUpdate("CREATE TABLE IF NOT EXISTS CARROS " +
	                   	"(ID INT PRIMARY KEY   	NOT NULL," +
	                   	" MARCA         TEXT    NOT NULL, " + 
	                   	" COR			TEXT	NOT NULL, " +
	                   	" ANO			TEXT	NOT NULL, " +
	                   	" PRECO			TEXT	NOT NULL) ");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void adiciona(Carro carro) {
		try {
			this.stm = this.conn.createStatement();
			
			this.stm.executeUpdate("INSERT INTO CARROS (ID, MARCA, COR, ANO, PRECO) " +
	                   "VALUES (" + carro.getID() + ", '" + carro.getMarca() + "', '" + carro.getCor() + "', '" + carro.getAno() + "', '" + carro.getPreco() + "');");
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleta(String id) {
		
		try {
			this.stm = this.conn.createStatement();
			
			this.stm.executeUpdate("DELETE FROM CARROS WHERE ID = " + id);
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
