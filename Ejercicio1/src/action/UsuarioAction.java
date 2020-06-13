package action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.logging.*;
import model.Usuario;

public class UsuarioAction extends ActionSupport {

	/**
	 * Aqui se pondran los metodos que usaremos para manejar la logica del login
	 * El ActionSuport es para pode usar los ActionMessage
	 */
	private static final long serialVersionUID = 1L;

	private final static Logger LOGGER=Logger.getLogger("action.UsuarioAction");
	
	
	private String mensaje, usuario, clave;

	private Usuario u;
	

	//EXECUTE
	public String login() {
		if(usuario.equals("admin@gg.es") && clave.equals("123")) {
			mensaje="Credenciales correctos";
			addActionMessage(mensaje);
			LOGGER.log(Level.INFO,mensaje);
			return "Bienvenido";	
		}else {
			mensaje="Usuario o clave incorrecto";
			addActionError(mensaje);
			LOGGER.log(Level.WARNING,mensaje);
			return "Error";
		}
		
	}
	
	public String registrar() {
		System.out.println(u);
		mensaje="Registro exitoso";
		return "ok";
	}
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}
	
}
