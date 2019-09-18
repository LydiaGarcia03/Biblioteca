package DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Metadata.MessageResponse;
import Metadata.Usuario;

public class UsuarioDAL {

	public MessageResponse<Integer> Inserir(Usuario user)
	{ 
		try
		{ 
			// create a mysql database connection
			String myDriver = "com.mysql.jdbc.Driver";
			Class.forName(myDriver);
			Connection connection = DriverManager.getConnection(Parametros.GetConnectionString());

			// the mysql insert statement
			String query = " INSERT INTO biblioteca.usuario (nome, email, senha, ehFuncionario, ehAtivo)" + " values ('"+user.getNome()+"', '"+user.getEmail()+"','"+user.getSenha()+"', "+user.getEhFuncionario()+", "+user.getEhAtivo()+")";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = connection.prepareStatement(query);

			// execute the preparedstatement
			preparedStmt.execute();

			MessageResponse<Integer> resposta = new MessageResponse<Integer>();
			resposta.Mensagem = "Usuário cadastrado com sucesso.";
			resposta.Sucesso = true;
			return resposta;
		}
		catch (Exception ex)
		{
			if (ex.getMessage().contains("UNIQUE"))
			{
				MessageResponse<Integer> resposta = new MessageResponse<Integer>();
				resposta.Mensagem = "Usuário já cadastrado.";
				resposta.Sucesso = false;
				resposta.Exception = ex;
				return resposta;

			}else
			{
				MessageResponse<Integer> resposta = new MessageResponse<Integer>();
				resposta.Mensagem = "Erro no banco de dados, contate o administrador.";
				resposta.Sucesso = false;
				resposta.Exception = ex;
				return resposta;
			}
		}
	}

	public MessageResponse<Integer> Excluir(Usuario user)
	{ 
		try
		{
			// create a mysql database connection
			String myDriver = "com.mysql.jdbc.Driver";
			Class.forName(myDriver);
			Connection connection = DriverManager.getConnection(Parametros.GetConnectionString());

			// create the mysql delete statement.
			// i'm deleting the row where the id is "3", which corresponds to my
			// "Barney Rubble" record.
			String query = "DELETE FROM biblioteca.usuarios WHERE id_user = "+user.getID()+"";
			PreparedStatement preparedStmt = connection.prepareStatement(query);

			// execute the preparedstatement
			preparedStmt.execute();


			MessageResponse<Integer> resposta = new MessageResponse<Integer>();
			resposta.Mensagem = "Usuário excluído com sucesso.";
			resposta.Sucesso = true;
			return resposta;
		}
		catch (Exception ex)
		{
			MessageResponse<Integer> resposta = new MessageResponse<Integer>();
			resposta.Mensagem = "Erro no banco de dados, contate o administrador.";
			resposta.Sucesso = false;
			resposta.Exception = ex;
			return resposta;
		}
	}

	public MessageResponse<Integer> Atualizar(Usuario user)
	{ 
		try
		{
			// create a mysql database connection
			String myDriver = "com.mysql.jdbc.Driver";
			Class.forName(myDriver);
			Connection connection = DriverManager.getConnection(Parametros.GetConnectionString());

			// create the java mysql update preparedstatement
			String query = "UPDATE biblioteca.usuarios SET nome = '"+user.getNome()+"', email = '"+user.getEmail()+"', senha = '"+user.getSenha()+"', ehFuncionario = "+user.getEhFuncionario()+", ehAtivo = "+user.getEhAtivo()+" WHERE id_user = "+user.getID()+"";

			PreparedStatement preparedStmt = connection.prepareStatement(query);
			// execute the java preparedstatement
			preparedStmt.executeUpdate();

			MessageResponse<Integer> resposta = new MessageResponse<Integer>();
			resposta.Mensagem = "Usuário cadastrado com sucesso.";
			resposta.Sucesso = true;
			return resposta;
		}
		catch (Exception e)
		{
			MessageResponse<Integer> resposta = new MessageResponse<Integer>();
			resposta.Mensagem = "Erro no banco de dados, contate o administrador.";
			resposta.Sucesso = false;
			resposta.Exception = e;
			return resposta;
		}
	}

	public MessageResponse<ArrayList<Usuario>> LerTodos()
	{ 
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		try
		{
			// create a mysql database connection
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(Parametros.GetConnectionString());

			String query = "SELECT * FROM biblioteca.usuarios";

			// create the java statement
			Statement st = connection.createStatement();
			
			ResultSet rs = st.executeQuery(query);

			while (rs.next())
			{
				int id = rs.getInt("id_user");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				String senha = rs.getString("senha");
				boolean ehFuncionario = rs.getBoolean("ehFuncionario");
				boolean ehAtivo = rs.getBoolean("ehAtivo");

				Usuario usuario = new Usuario(id, nome, email, senha, ehFuncionario, ehAtivo);
                usuarios.add(usuario);
			}
			MessageResponse<ArrayList<Usuario>> resposta = new MessageResponse<ArrayList<Usuario>>();
			resposta.Mensagem = "Usuários encontrados com sucesso.";
			resposta.Sucesso = true;
			resposta.Dados = usuarios;		
			st.close();
			return resposta;
		}
		catch (Exception e)
		{
			MessageResponse<ArrayList<Usuario>> resposta = new MessageResponse<ArrayList<Usuario>>();
			resposta.Mensagem = "Erro no banco de dados, contate o administrador.";
			resposta.Sucesso = false;
			resposta.Exception = e;
			return resposta;
		}
	}

	public Usuario Autenticar(String email, String senha)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conexao = DriverManager.getConnection(Parametros.GetConnectionString());

			Statement stConsulta = conexao.createStatement();

			String consulta = "SELECT * FROM biblioteca.usuario WHERE email = '"+email+"' AND senha = '"+senha+"')";					
			System.out.println(consulta);

			ResultSet rs = stConsulta.executeQuery(consulta);

			while(rs.next())
			{
				Usuario user = new Usuario();

				user.setID(Integer.parseInt(rs.getString("id_user")));
				user.setNome(rs.getString("nome"));
				user.setEmail(rs.getString("email"));
				user.setSenha(rs.getString("senha"));
				user.setEhFuncionario(Boolean.parseBoolean( rs.getString("ehFuncionario")));
				user.setEhFuncionario(Boolean.parseBoolean( rs.getString("ehAtivo")));

				return user;

			}
		}
		catch(SQLException ex) {

			ex.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{

		}
		return null;
	}
}

