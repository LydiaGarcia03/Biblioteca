package Metadata;

public class Usuario {

	public int ID;
	public Boolean EhFuncionario;
	public Boolean EhAtivo;
	public String Nome;
	public String Email;
	public String Senha;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(int ID, String Nome, String Email, String Senha, Boolean EhFuncionario, Boolean EhAtivo){
		this.ID = ID;
		this.Nome = Nome;
		this.Email = Email;
		this.Senha = Senha;
		this.EhFuncionario = EhFuncionario;
		this.EhAtivo = EhAtivo;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public Boolean getEhFuncionario() {
		return EhFuncionario;
	}
	
	public void setEhFuncionario(Boolean ehFuncionario) {
		EhFuncionario = ehFuncionario;
	}
	
	public Boolean getEhAtivo() {
		return EhAtivo;
	}
	
	public void setEhAtivo(Boolean ehAtivo) {
		EhAtivo = ehAtivo;
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
