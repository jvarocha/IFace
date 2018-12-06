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
	private Usuario solicitacao_de_amizade;
	public ArrayList<String> enviarmensagem = new ArrayList<>();
	public ArrayList<String> recebermensagem = new ArrayList<>();
	public ArrayList<Usuario> amigos = new ArrayList<>();
	public Comunidade comunidade = new Comunidade();
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
	public String getEnviarMensagem(int i) {
		return enviarmensagem.get(i);
	}
	public void setEnviarMensagem(String mensagem) {
		enviarmensagem.add(mensagem);
	}
	public String getReceberMensagem(int i) {
		return recebermensagem.get(i);
	}
	public void setReceberMensagem(String mensagem) {
		recebermensagem.add(mensagem);
	}
	public Usuario getSolicitacaoDeAmizade() {
		return solicitacao_de_amizade;
	}
	public void setSolicitacaoDeAmizade(Usuario solicitacao_de_amizade) {
		this.solicitacao_de_amizade = solicitacao_de_amizade;
	}
	

}
