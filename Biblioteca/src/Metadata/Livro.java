package Metadata;

public class Livro {
	
	public int ID;
	public String Titulo;
	public int IDAutor;
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
	
	public int getIDAutor() {
		return IDAutor;
	}
	
	public void setAutor(int idautor) {
		IDAutor = idautor;
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
