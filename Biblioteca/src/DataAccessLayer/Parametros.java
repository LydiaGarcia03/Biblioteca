package DataAccessLayer;

import java.sql.DriverManager;

import Metadata.Usuario;

public class Parametros {
	public static String GetConnectionString()
    {
        return "jdbc:mysql://127.0.0.1:3306/?user=root&password=laura1324";
    }

    public static Usuario UsuarioLogado;
    
    public static Usuario getUsuarioLogado() {
		return UsuarioLogado;
	}
    
    public static void setUsuarioLogado(Usuario usuarioLogado) {
		UsuarioLogado = usuarioLogado;
	}
}
