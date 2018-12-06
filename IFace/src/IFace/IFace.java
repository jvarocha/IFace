package IFace;

import java.util.ArrayList;
import java.util.Scanner;

public class IFace {
 private static Scanner teclado;
 private static Usuario usuario;
 public static void main(String[] agrs) {
	 
	teclado = new Scanner(System.in);
	int index1=0,index4=1,index2,index3;
	ArrayList<Usuario> lista = new ArrayList<>();
	String funcionalidade;
	String procurar;
	System.out.println("Digite o tipo de funcionalidade:");
	
	while(index4==1) {
		
		System.out.println("Criar Conta");
		System.out.println("Editar Conta");
		System.out.println("Adicionar Amigos");
		System.out.println("Enviar Mensagens");
		System.out.println("Criar Comunidade");
		System.out.println("Adicionar Membros");
		System.out.println("Recuperar Informações");
		System.out.println("Remover Conta");
		System.out.println("Acessar Conta");
		funcionalidade = teclado.nextLine();
		
		if(funcionalidade.equalsIgnoreCase("Criar Conta")) {
			usuario = new Usuario();
			System.out.printf("Digite o seu nome:");
			usuario.setNome(teclado.nextLine());
			System.out.printf("Digite a sua nacionalidade:");
			usuario.setNacionalidade(teclado.nextLine());
			System.out.printf("Digite o seu endereço:");
			usuario.setEndereco(teclado.nextLine());
			System.out.printf("Digite sua data de nascimento:");
			usuario.setData_nascimento(teclado.nextLine());
			System.out.printf("Digite seu sexo:");
			usuario.setSexo(teclado.nextLine());
			System.out.printf("Digite o seu número de telefone:");
			usuario.setTelefone(teclado.nextLine());
			System.out.printf("Digite o seu e-mail:");
			usuario.setEmail(teclado.nextLine());
			System.out.printf("Que senha deseja ter:");
			usuario.setSenha(teclado.nextLine());
			lista.add(usuario);
		}
		
		else if(funcionalidade.equalsIgnoreCase("Editar Conta")) {
			System.out.printf("Digite seu e-mail:");
			procurar = teclado.nextLine();
			for (index1=0;index1<lista.size() && lista.get(index1).getEmail().equals(procurar) != true ;index1++){
			}
			System.out.printf("Digite seu senha:");
			procurar = teclado.nextLine();
				if(index1<lista.size() && lista.get(index1).getSenha().equals(procurar)){
					System.out.println("Digite o que você deseja alterar: Nome,Nacionalidade,Endereco,E-mail,Data de Nascimento,Sexo,Telefone ou Senha");
					procurar = teclado.nextLine();
					System.out.println("Deseja muda para:");
					if(procurar.equalsIgnoreCase("nome")) {
						procurar = teclado.nextLine();
						lista.get(index1).setNome(procurar);
					}
					else if(procurar.equalsIgnoreCase("endereco")) {
						procurar = teclado.nextLine();
						lista.get(index1).setEndereco(procurar);									
					}
					else if(procurar.equalsIgnoreCase("nacionalidade")) {
						procurar = teclado.nextLine();
						lista.get(index1).setNacionalidade(procurar);									
					}
					else if(procurar.equalsIgnoreCase("e-mail")) {
						procurar = teclado.nextLine();
						lista.get(index1).setEmail(procurar);	
					}
					else if(procurar.equalsIgnoreCase("data de nascimento")) {
						procurar = teclado.nextLine();
						lista.get(index1).setData_nascimento(procurar);	
					}
					else if(procurar.equalsIgnoreCase("sexo")) {
						procurar = teclado.nextLine();
						lista.get(index1).setSexo(procurar);
					}
					else if(procurar.equalsIgnoreCase("telefone")) {
						procurar = teclado.nextLine();
						lista.get(index1).setTelefone(procurar);	
					}
					else if(procurar.equalsIgnoreCase("senha")) {
						procurar = teclado.nextLine();
						lista.get(index1).setSenha(procurar);	
					}
					else {
						System.out.println("Ocorreu um erro: Por favor repita o procedimento");
					}
				}
				else{
					System.out.println("Ocorreu um erro: Nome não encontrado");								
				}
		}
		
		else if(funcionalidade.equalsIgnoreCase("Adicionar Amigos")){
			System.out.println("Digite o seu e-mail:");
			procurar = teclado.nextLine();
			for (index1=0;index1<lista.size() && lista.get(index1).getEmail().equals(procurar) != true ;index1++){
			}
			System.out.println("Digite a sua senha:");
			procurar = teclado.nextLine();
			if(index1<lista.size()){
				if(lista.get(index1).getSenha().equals(procurar)) {
					System.out.println("Digite o nome do seu amigo:");
					procurar = teclado.nextLine();
					for (index2=0;index2<lista.size() && lista.get(index2).getNome().equals(procurar) != true ;index2++){
					}
					if(index2<lista.size() && lista.get(index2) != lista.get(index1)) {
						for (index3=0;index3<lista.get(index1).amigos.size() && lista.get(index1).getAmigos(index3).equals(lista.get(index2).getNome()) != true ;index3++){
						}
						if(index3<lista.get(index1).amigos.size()) {
							System.out.println("Ocorreu um erro: Amigo ja contido na sua conta");
						}
						else {
							lista.get(index2).setSolicitacaoDeAmizade(lista.get(index1));
							System.out.println("Solicitção de Amizade feito para " + lista.get(index2).getNome()+" com sucesso!");
						}
					}
					else {
						System.out.println("Ocorreu um erro: Nome não encontrado:");
					}
				}
				else {
					System.out.println("Ocorreu um erro: Senha não encontrado:");
				}
			}
			else{
				System.out.println("Ocorreu um erro: Nome não encontrado:");								
			}			
		}
		
		else if(funcionalidade.equalsIgnoreCase("Enviar Mensagens")) {
			System.out.println("Digite o seu e-mail:");
			procurar = teclado.nextLine();
			for (index1=0;index1<lista.size() && lista.get(index1).getEmail().equals(procurar) != true ;index1++){
			}
			System.out.println("Digite a sua senha:");
			procurar = teclado.nextLine();
			if(index1<lista.size() && lista.get(index1).getSenha().equals(procurar)){
				System.out.println("Digite o nome do seu amigo:");
				procurar = teclado.nextLine();
				for (index2=0;index2<lista.get(index1).amigos.size() && lista.get(index1).getAmigos(index2).getNome().equals(procurar) != true ;index2++){
				}
				if(index2<lista.get(index1).amigos.size()) {
				System.out.println("Digite a sua mensagem:");
				procurar = teclado.nextLine();
				lista.get(index1).setEnviarMensagem(procurar);
				lista.get(index1).getAmigos(index2).setReceberMensagem(procurar);
				}
				else {
					System.out.println("Ocorreu um erro: Nome não encontrado:");					
				}
			}
			else{
				System.out.println("Ocorreu um erro: Nome não encontrado:");								
			}					
		}
		else if(funcionalidade.equalsIgnoreCase("Criar Comunidade")) {
			System.out.println("Digite o seu e-mail:");
			procurar = teclado.nextLine();
			for (index1=0;index1<lista.size() && lista.get(index1).getEmail().equals(procurar) != true ;index1++){
			}
			System.out.println("Digite a sua senha:");
			procurar = teclado.nextLine();
			if(index1<lista.size() && lista.get(index1).getSenha().equals(procurar)){
				System.out.println("Digite o nome da Comunidade:");
				lista.get(index1).comunidade.setNomeComunidade(teclado.nextLine());
				System.out.println("Digite a descrição:");
				lista.get(index1).comunidade.setDescricaoComunidade(teclado.nextLine());
			}
			else{
				System.out.println("Ocorreu um erro: Nome não encontrado:");								
			}		
			
		}
		
		else if(funcionalidade.equalsIgnoreCase("Adicionar Membros")) {
			System.out.println("Digite o seu e-mail:");
			procurar = teclado.nextLine();
			for (index1=0;index1<lista.size() && lista.get(index1).getEmail().equals(procurar) != true ;index1++){
			}
			System.out.println("Digite a sua senha:");
			procurar = teclado.nextLine();
			if(index1<lista.size() && lista.get(index1).getSenha().equals(procurar)) {
				System.out.println("Digite o nome de quem você deseja adicionar:");
				procurar = teclado.nextLine();
				for (index2=0;index2<lista.size() && lista.get(index2).getNome().equals(procurar) != true ;index2++){
				}
				if(index2<lista.size()) {
					lista.get(index1).comunidade.setMembro(lista.get(index2));
					System.out.println(lista.get(index2).getNome()+" estar no grupo");
				}
				else {
					System.out.println("Ocorreu um erro: Nome não encontrado:");
					}
				}
			else{
				System.out.println("Ocorreu um erro: Nome não encontrado:");								
			}
		}
		
		else if(funcionalidade.equalsIgnoreCase("Recuperar Informações")) {
			System.out.println("7");
		}
		
		else if(funcionalidade.equalsIgnoreCase("Remover Conta")) {
			System.out.println("Digite o nome de quem você quer remover:");
			procurar = teclado.nextLine();
			for (index1=0;index1<lista.size() && lista.get(index1).getNome().equals(procurar) != true ;index1++){
			}
			if(index1<lista.size()){
				System.out.println(lista.get(index1).getNome()+" foi removida");
				lista.remove(index1);							
			}
			else{
				System.out.println("Ocorreu um erro: Nome não encontrado:");								
			}
		}
		
		else if(funcionalidade.equalsIgnoreCase("Acessar Conta")){
			System.out.println("Digite o seu e-mail:");
			procurar = teclado.nextLine();
			for (index1=0;index1<lista.size() && lista.get(index1).getEmail().equals(procurar) != true ;index1++){
			}
			System.out.println("Digite a sua senha:");
			procurar = teclado.nextLine();
			if(index1<lista.size() && lista.get(index1).getSenha().equals(procurar)){
				System.out.println("Oque Deseja Fazer:");
				procurar = teclado.nextLine();
				if(procurar.equals("amigos")) {
					for (index2=0;index2<lista.get(index1).amigos.size();index2++){
						System.out.println(lista.get(index1).amigos.get(index2).getNome());
						}
				}
				if(procurar.equalsIgnoreCase("Solicitação")) {
					if(lista.get(index1).getSolicitacaoDeAmizade() != null) {
						System.out.println("Você tem uma solicitação de amizade de "+lista.get(index1).getSolicitacaoDeAmizade().getNome()+" deseja aceitar: Sim ou Nao:");
						procurar = teclado.nextLine();
					}
					if(procurar.equalsIgnoreCase("Sim")) {
						lista.get(index1).setAmigos(lista.get(index1).getSolicitacaoDeAmizade());
						lista.get(index1).getSolicitacaoDeAmizade().setAmigos(lista.get(index1));
						System.out.println("Concluido");
					}
					else if(procurar.equals("Não")) {
						
					}
					else {
						System.out.println("Ocorreu um erro: Por favor repita o procedimento");
					}
				}
				if(procurar.equalsIgnoreCase("Comunidade")) {
					if(lista.get(index1).comunidade.getNomeComunidade() != null) {
						System.out.println("Oque você deseja ver:Membros ou Mensagens:");
						procurar = teclado.nextLine();
					}
					if(procurar.equalsIgnoreCase("Membros")) {
						for (index2=0;index2<lista.get(index1).comunidade.membros.size();++index2){
							System.out.println(lista.get(index1).comunidade.membros.get(index2).getNome());
							}
					}
					else if(procurar.equalsIgnoreCase("Mensagens")) {
						System.out.println("Deseja ver ou escrever");
						procurar = teclado.nextLine();
						 if(procurar.equalsIgnoreCase("ver")) {
							 System.out.println(lista.get(index1).comunidade.getMensagem());
						 }
						 else if(procurar.equalsIgnoreCase("escrever")) {
							 lista.get(index1).comunidade.setMensagem(teclado.nextLine());
						 }
						 else {
							 
						 }
					}
					else {
						System.out.println("Ocorreu um erro: Por favor repita o procedimento");
					}
				}
				if(procurar.equalsIgnoreCase("Mensagens")) {
					System.out.println("De quem você deseja ver mensagem:");
					procurar = teclado.nextLine();
					for (index2=0;index2<lista.get(index2).amigos.size() && lista.get(index1).amigos.get(index2).getNome().equalsIgnoreCase(procurar) != true ;++index2){
					}
					if(index2<lista.get(index2).amigos.size()) {
						System.out.println(lista.get(index1).getReceberMensagem(lista.get(index1).recebermensagem.size()-1));						
					}
				}
			}			
		}
		else {
			System.out.println("Ops!, Ocorreu algum erro, tente novamente");
		}
	}
	 
 }
}
