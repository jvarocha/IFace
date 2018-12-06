package IFace;

import java.util.ArrayList;

public class Comunidade {
	private String nomecomunidade;
	public ArrayList<Usuario> membros = new ArrayList<>();
	private String mensagem;
	private String descricaocomunidade;
	private String removeramigo;
	private String removermensagem;
	
	public ArrayList<Usuario> getMembro() {
		return membros;
	}

	public void setMembro(Usuario membro) {
		membros.add(membro);
	}
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getDescricaoComunidade() {
		return descricaocomunidade;
	}

	public void setDescricaoComunidade(String descricaocomunidade) {
		this.descricaocomunidade = descricaocomunidade;
	}

	public String getRemoverAmigo() {
		return removeramigo;
	}

	public void setRemoverAmigo(String removeramigo) {
		this.removeramigo = removeramigo;
	}

	public String getRemoverMensagem() {
		return removermensagem;
	}

	public void setRemoverMensagem(String removermensagem) {
		this.removermensagem = removermensagem;
	}

	public String getNomeComunidade() {
		return nomecomunidade;
	}

	public void setNomeComunidade(String nomecomunidade) {
		this.nomecomunidade = nomecomunidade;
	}	
}
