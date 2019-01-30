package IFace;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String telefone;
	private String nacionalidade;
	private String email;
	private String data_nascimento;
	private String sexo;
	private String endereco;
	private String senha;
	private int notificacao;
	private int indicebackup;
	public ArrayList<Usuario> backup = new ArrayList<>();
	private ArrayList<Usuario> solicitacao_de_amizade = new ArrayList<>();
	private ArrayList<Mensagem> mensagem = new ArrayList<>();
	public ArrayList<Usuario> amigos = new ArrayList<>();
	public ArrayList<Comunidade> comunidade = new ArrayList<>();
	public void setAmigos(Usuario amigo){
		amigos.add(amigo);
	}
	public Usuario getAmigos(int i){
		return amigos.get(i);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public ArrayList<Usuario> getSolicitacaoDeAmizade() {
		return solicitacao_de_amizade;
	}
	public void setSolicitacaoDeAmizade(Usuario amizade) {
		solicitacao_de_amizade.add(amizade);
	}
	public ArrayList<Mensagem> getMensagem() {
		return mensagem;
	}
	public void setMensagem(Mensagem msg) {
		mensagem.add(msg);
	}
	public int getNotificacao() {
		return notificacao;
	}
	public void setNotificacao(int notificacao) {
		this.notificacao = notificacao;
	}
	public Usuario getBackup(int i) {
		return backup.get(i);
	}
	public void setBackup(Usuario usuario) {
		backup.add(usuario);
	}
	public int getIndicibackup() {
		return indicebackup;
	}
	public void setIndicibackup(int indicebackup) {
		this.indicebackup = indicebackup;
	}
	

}
