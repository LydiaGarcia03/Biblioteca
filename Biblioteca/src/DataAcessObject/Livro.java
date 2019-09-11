package DataAcessObject;

public class Livro {
	
	public int ID;
	public String Titulo;
	public String Autor;
	public String Genero;
	public String Editora;
	
	public int getID() {
		return ID;
	}
	
	private void setID(int iD) {
		ID = iD;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public String getAutor() {
		return Autor;
	}
	
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	public String getGenero() {
		return Genero;
	}
	
	public void setGenero(String genero) {
		Genero = genero;
	}
	
	public String getEditora() {
		return Editora;
	}
	
	public void setEditora(String editora) {
		Editora = editora;
	}
}
