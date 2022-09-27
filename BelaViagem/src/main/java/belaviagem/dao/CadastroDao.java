package belaviagem.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import belaviagem.model.CadastroViagem;

public class CadastroDao {

	
	public void cadastrarViagem(CadastroViagem destino) {
		
		String sql = "INSERT INTO PRODUTO VALUES(null,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection conn = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = (PreparedStatement) conn.prepareStatement(sql);
			pStatement.setString(1, CadastroViagem.getNome());
			pStatement.setString(1, CadastroViagem.getSobrenome());
			pStatement.setString(1, CadastroViagem.getEmail());
			pStatement.setString(1, CadastroViagem.getTel());
			pStatement.setString(1, CadastroViagem.getNome());
			pStatement.setString(1, CadastroViagem.getNome());
			
		}catch(Exception e) {
			
		}
				
		
	}
	
	
}
