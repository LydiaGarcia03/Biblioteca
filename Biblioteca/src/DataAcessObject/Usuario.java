package DataAcessObject;

public class Usuario {

	public int ID;
	public Boolean EhFuncionario;
	public String Nome;
	public String Email;
	public String Senha;
	
	public int getID() {
		return ID;
	}
	
	private void setID(int iD) {
		ID = iD;
	}
	
	public Boolean getEhFuncionario() {
		return EhFuncionario;
	}
	
	public void setEhFuncionario(Boolean ehFuncionario) {
		EhFuncionario = ehFuncionario;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getSenha() {
		return Senha;
	}
	
	public void setSenha(String senha) {
		Senha = senha;
	}
}
