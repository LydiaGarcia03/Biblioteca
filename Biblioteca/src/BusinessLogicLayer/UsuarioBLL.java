package BusinessLogicLayer;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.Spring;

import DataAccessLayer.UsuarioDAL;
import Metadata.Usuario;

public class UsuarioBLL
{

	private UsuarioDAL _dal = new UsuarioDAL();
	WhiteSpace ws = new WhiteSpace();
	BaseValidator<Usuario> base = new BaseValidator<Usuario>();

	public void ValidateEntity(Usuario item)
	{
		//NOME
		if (ws.isWhitespace(item.getNome()) || item.getNome() == null)
		{
			base.AddError("Nome deve ser informado.");
		}
		else
		{
			item.setNome(item.getNome().trim());
			
			if (item.getNome().length() < 3 || item.getNome().length() > 60)
			{
				base.AddError("Nome deve conter entre 3 e 60 caracteres.");
			}
			else
			{
				for (int i = 0; i < item.getNome().length(); i++)
				{
					if (!Character.isLetter(item.getNome().indexOf(i)) && item.getNome().indexOf(i) != ' ')
					{
						base.AddError("Nome inválido");
						break;
					}
				}
			}
		}
		
		//SENHA

		if (ws.isWhitespace(item.getSenha()) || item.getSenha() == null)
		{
			base.AddError("A senha deve ser informada.");
		}
		else
		{
			item.setSenha(item.getSenha().trim());
			if (item.getSenha().length() < 7 || item.getSenha().length() > 60)
			{
				base.AddError("A senha deve conter entre 7 e 60 caracteres.");
			}
		}

		//EMAIL

		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
	    Matcher m = p.matcher(item.getEmail());
	    boolean isEmail = m.matches();
	    
		if (!isEmail)
		{
			base.AddError("Email deve ser informado.");
		}

	

		ArrayList<Usuario> usuarios = _dal.LerTodos().Dados;

		for (int i = 0; i < usuarios.size(); i++)
		{
			Usuario fun = usuarios.get(i);

			if (fun.Email == item.Email)
			{
				base.AddError("Já existe um usuário com este e-mail.");
			}
		}

		base.ValidateEntity(item);
	}

	 public Usuario Autenticar(String user, String senha)
     {
         if (ws.isWhitespace(user) || user == null || ws.isWhitespace(senha) || senha == null )
         {
             try {
				throw new Exception("Usuário e/ou senha não informados.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }

         Usuario f = new UsuarioDAL().Autenticar(user, senha);
         return f;
     }
}
