package IFace;

import java.util.ArrayList;

public class Mensagem {
	private ArrayList<String> mensagens = new ArrayList<>();
	private Usuario amigo;
	
	public ArrayList<String> getMensagens() {
		return mensagens;
	}
	public void setMensagens(String msg) {
		mensagens.add(msg);
	}
	public Usuario getAmigo() {
		return amigo;
	}
	public void setAmigo(Usuario amigo) {
		this.amigo = amigo;
	}
}
