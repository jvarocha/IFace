package IFace;
import java.util.ArrayList;
import java.util.Scanner;

public class IFace {
 private static Scanner teclado;
 private static Usuario usuario;
 private static String procurar;
 public static void main(String[] agrs) {
	 
	teclado = new Scanner(System.in);
	ArrayList<Usuario> lista = new ArrayList<>();
	String funcionalidade = "Entrar";
	while(funcionalidade.equalsIgnoreCase("Sair") != true) {
		System.out.println("Deseja: Criar Conta ou Acessar Conta.");
		funcionalidade = teclado.nextLine();
		if(funcionalidade.equalsIgnoreCase("Criar Conta")) {
			lista.add(criarconta());
		}
		
		else if(funcionalidade.equalsIgnoreCase("Acessar Conta")){
			System.out.println("Digite o e-mail:");
			procurar = teclado.nextLine();
			for(Usuario usuario : lista) {
				if(usuario.getEmail().equalsIgnoreCase(procurar)) {
					System.out.println("Digite a senha:");
					procurar = teclado.nextLine();
					if(usuario.getSenha().equals(procurar)) {
						acessarconta(usuario,lista);
					}
					
				}
			}
		}
	}
 }
 
 public static void acessarconta(Usuario usuario,ArrayList<Usuario> lista) {
	while(procurar.equalsIgnoreCase("Sair") != true) {
		System.out.println("Deseja: Adicionar Amigos, Editar Conta, Enviar Mensagens, Criar Comunidade, Adicionar Membros, Recuperar Informações,Ver Mensagens,Ver Comunidade ,Remover Conta ou Sair.");
		procurar = teclado.nextLine();
		if(procurar.equalsIgnoreCase("Editar Conta")) {
			editarperfil(usuario);
		}
		else if(procurar.equalsIgnoreCase("Adicionar Amigos")){
			addamigos(lista,usuario);		
		}
		else if(procurar.equalsIgnoreCase("Enviar Mensagens")) {
			enviarmsg(usuario);
		}
		else if(procurar.equalsIgnoreCase("Criar Comunidade")) {
			criarcomunidade(usuario);
		}
		else if(procurar.equalsIgnoreCase("Adicionar Membros")) {
			addmembros(usuario);
		}
		else if(procurar.equalsIgnoreCase("Recuperar Informações")) {
			System.out.println("7");
		}
		else if(procurar.equalsIgnoreCase("Remover Conta")) {
			removerconta(lista,usuario);
		}
		else if(procurar.equalsIgnoreCase("Notificacoes")) {
			notificacoes(usuario);
		}
		else if(procurar.equalsIgnoreCase("Ver Mensagens")) {
			vermensagens(usuario);
		}
		else if(procurar.equalsIgnoreCase("Ver Comunidade")) {
			vercomunidade(usuario);
		}
		else {
			System.out.println("Ops!. Houve um erro de digitação, por favor repita o procedimento.");
		}
	}
 }
 
 public static Usuario criarconta(){
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
			return usuario;
 }
 
 public static void editarperfil(Usuario usuario) {
	 	verperfil(usuario);
 		System.out.println("\nDigite o que você deseja alterar: Nome,Nacionalidade,Endereco,E-mail,Data de Nascimento,Sexo,Telefone ou Senha");
 		procurar = teclado.nextLine();
		if(procurar.equalsIgnoreCase("nome")) {
			System.out.println("Deseja muda para:");
			procurar = teclado.nextLine();
			usuario.setNome(procurar);
		}
		else if(procurar.equalsIgnoreCase("endereco")) {
			procurar = teclado.nextLine();
			usuario.setEndereco(procurar);									
		}
		else if(procurar.equalsIgnoreCase("nacionalidade")) {
			procurar = teclado.nextLine();
			usuario.setNacionalidade(procurar);									
		}
		else if(procurar.equalsIgnoreCase("e-mail")) {
			procurar = teclado.nextLine();
			usuario.setEmail(procurar);	
		}
		else if(procurar.equalsIgnoreCase("data de nascimento")) {
			procurar = teclado.nextLine();
			usuario.setData_nascimento(procurar);	
		}
		else if(procurar.equalsIgnoreCase("sexo")) {
			procurar = teclado.nextLine();
			usuario.setSexo(procurar);
		}
		else if(procurar.equalsIgnoreCase("telefone")) {
			procurar = teclado.nextLine();
			usuario.setTelefone(procurar);	
		}
		else if(procurar.equalsIgnoreCase("senha")) {
			procurar = teclado.nextLine();
			usuario.setSenha(procurar);	
		}
		else {
			System.out.println("Ocorreu um erro: Por favor repita o procedimento");
		}					
 }
 
 public static void addamigos(ArrayList<Usuario> lista, Usuario usuario) {	 
	System.out.println("Procurar por:");
	procurar = teclado.nextLine();
	int count=0;
	//index1 verificar se há conta existe, index2 verificar se já são amigos.
		for (Usuario index1: lista){
			if(index1.getNome().equalsIgnoreCase(procurar)){
				for(Usuario index2: usuario.amigos) {
					if(index2.getNome().equalsIgnoreCase(index1.getNome())) {
						System.out.println("Amigo já contido na sua conta.");
					}
					else {
						index1.setSolicitacaoDeAmizade(usuario);
						System.out.println("Solicitção de Amizade feito para " + index1.getNome()+ " com sucesso!");						
					}
				}
				if(usuario.amigos.size() == 0) {
					index1.setSolicitacaoDeAmizade(usuario);
					System.out.println("Solicitção de Amizade feito para " + index1.getNome()+ " com sucesso!");			
				}
			}
			else if(count>lista.size()) {
				System.out.println("Ocorreu um erro: Nome não encontrado.");
			}
			++count;
		}
 }
 
 public static void enviarmsg(Usuario usuario) {
 	System.out.println("Enviar para: Comunidade ou Amigo");
	procurar = teclado.nextLine();
	int count=0;
	if(procurar.equalsIgnoreCase("Amigo")) {
		System.out.println("Enviar para quem:");
		procurar = teclado.nextLine();
		for(Mensagem destinatario: usuario.getMensagem()) {
			if(destinatario.getAmigo().getNome().equalsIgnoreCase(procurar)) {
				System.out.println("Digite a mensagem:");
				String msg = teclado.nextLine();
				destinatario.setMensagens(msg);
				for(Mensagem emissor: destinatario.getAmigo().getMensagem()) {
					if(emissor.getAmigo().getNome().equalsIgnoreCase(usuario.getNome())) {
						emissor.setMensagens(msg);
					}
				}
				break;
			}
			++count;
	 		}
	 		if(count>usuario.amigos.size()) {
	 			System.out.println("Ocorreu um erro: Nome não encontrado.");
	 		}
		}
		else if(procurar.equalsIgnoreCase("Comunidade")) {
			System.out.println("Qual Comunidade:");
			procurar = teclado.nextLine();
			for(Comunidade comunidade: usuario.comunidade) {
				if(comunidade.getNomeComunidade().equalsIgnoreCase(procurar)) {
					System.out.println("Digite a mensagem:");
					comunidade.setMensagens(teclado.nextLine());
					break;
				}
				++count;
		 		}
		 		if(count>usuario.amigos.size()) {
		 			System.out.println("Ocorreu um erro: Comunidade não encontrado.");
		 		}
			}
		else {
 			System.out.println("Ocorreu um erro.Por favor repita o procedimento.");
 		}
 }
 	
 public static void criarcomunidade(Usuario usuario) {
 		System.out.println("Nome da Comunidade:");
 		Comunidade novacomunidade = new Comunidade();
 		novacomunidade.setNomeComunidade(teclado.nextLine());
 		System.out.println("Descrição:");
 		novacomunidade.setDescricaoComunidade(teclado.nextLine());
 		System.out.println("Comunidade "+novacomunidade.getNomeComunidade()+" criado com sucesso!");
 		usuario.comunidade.add(novacomunidade);
 }
 
 public static void addmembros(Usuario usuario) {
 		System.out.println("Nome do Amigo:");
 		procurar = teclado.nextLine();
 		boolean addmembro = true;
 		for(Usuario amigo: usuario.amigos) {
 			if(amigo.getNome().equalsIgnoreCase(procurar)){
 				System.out.println("Adicionar em qual Comunidade:");
 				procurar = teclado.nextLine();
 				for(Comunidade comunidade: usuario.comunidade) {
 					if(comunidade.getNomeComunidade().equalsIgnoreCase(procurar)) {
 						for(Comunidade jaesta: amigo.comunidade) {
 							if(jaesta.getNomeComunidade().equals(comunidade.getNomeComunidade())) {
 								System.out.println(amigo.getNome()+" já está na Comunidade.");
 								addmembro = false;
 								break;
 							}
 						}
 						if(addmembro) {
 							comunidade.membros.add(amigo);					 							
 						}
 					}
 					break;
 				}
 			}
 			if(addmembro == false) {
 				break;
 			}
 		}		
 }
 public static void recuperardados(Usuario usuario,boolean posicao) {
	 
 }
 public static void removerconta(ArrayList<Usuario> lista,Usuario usuario) {
 		lista.remove(usuario);		
 }
 
 public static void verperfil(Usuario usuario) {
	 System.out.println("Seu perfil atual.");
	 System.out.println("Nome: "+usuario.getNome());
	 System.out.println("Nacionalidade: "+usuario.getNacionalidade());
	 System.out.println("Endereço: "+usuario.getEndereco());
	 System.out.println("Sexo: "+usuario.getSexo());
	 System.out.println("Data de Nascimento: "+usuario.getData_nascimento());
	 System.out.println("Telefone: "+usuario.getTelefone());
	 System.out.println("E-mail: "+usuario.getEmail());
	 System.out.println("Senha: "+usuario.getSenha());
 }
 
 public static void notificacoes(Usuario usuario) {
	 for(Usuario amizades: usuario.getSolicitacaoDeAmizade()) {
		 System.out.println("Adicionar "+amizades.getNome()+" como amigo: Sim ou Não ?");
		 procurar = teclado.nextLine();
		 if(procurar.equalsIgnoreCase("Sim")) {
			 usuario.amigos.add(amizades);
			 amizades.amigos.add(usuario);
			 Mensagem mensagem1 = new Mensagem();
			 mensagem1.setAmigo(usuario);
			 amizades.setMensagem(mensagem1);
			 Mensagem mensagem2 = new Mensagem();
			 mensagem2.setAmigo(amizades);
			 usuario.setMensagem(mensagem2);			 
		 }
	 }	
	 usuario.getSolicitacaoDeAmizade().clear();
 }
 
 public static void vermensagens(Usuario usuario) {
	 for(Mensagem amigo: usuario.getMensagem()) {
		 System.out.println(amigo.getAmigo().getNome()+":");
		 for(String mensagem: amigo.getMensagens()) {
			 System.out.println(mensagem);
		 }
	 }
 }
 
 public static void vercomunidade(Usuario usuario) {
	 for(Comunidade comunidade: usuario.comunidade) {
		 System.out.println(comunidade.getNomeComunidade());
		 for(String mensagem: comunidade.getMensagem()) {
			 System.out.println(mensagem);
		 }
	 }
 }
 
}
