package airlines;
import java.util.Scanner;

public class Menu {
	 static Scanner input = new Scanner(System.in);
	 static Voo voos[] = new Voo[10];

	public static void main(String[] args) {
		 exibirMenu(); 
	} 

	public static void exibirMenu(){
		while(true){
			   System.out.println("1. Cadastrar voo");
			   System.out.println("2. Listar voos");
			   System.out.println("3. Efetuar reserva");
			   System.out.println("4. Listar reservas por voo");
			   System.out.println("5. Sair");
			   System.out.print("Digite uma opção: ");
			   int opcao = Integer.parseInt(input.nextLine());
			  
			   switch(opcao){
			     case 1:
			       cadastrarVoo();
			       break;
			     case 2:
			       listarVoos();
			       break;
			     case 3:
			       efetuarReserva();
			       break;
			     case 4:
//			       listarReservas();
			       break; 
			     case 5:
			       System.out.println("\nEncerrando procedimento!\n");
			       System.exit(0);
			       break;
			   }
		}
	}
	
	public static void cadastrarVoo(){
		 boolean sucesso = false;
		 for(int i = 0; i < voos.length; i++){
		   if(voos[i] == null){
		     System.out.println("\nCadastre um novo voo:\n");
		     System.out.print("Número do voo: ");
		     int numero = Integer.parseInt(input.nextLine());
		     System.out.print("Origem: ");
		     String origem = input.nextLine();
		     System.out.print("Destino: ");
		     String destino = input.nextLine();
		     System.out.print("Data:");
		     String data_voo = input.nextLine();
		     System.out.print("Horário: ");
		     String horario = input.nextLine();
		     System.out.print("Duração: ");
		     String duracao = input.nextLine();
		     System.out.print("Lotação: ");
		     int lotacao = Integer.parseInt(input.nextLine());
		     System.out.print("Valor: ");
		     float valor = Float.parseFloat(input.nextLine());
		     voos[i] = new Voo(numero, origem, destino, data_voo, horario, duracao, lotacao, valor);
		     System.out.println("\nVoo cadastrado com sucesso.\n");
		     sucesso = true;
		     break;
		   }  
		 }

		 if(!sucesso){
		   System.out.println("\nNão há mais aviões disponíveis para novos voos.\n"); 
		 }
	}
	
	public static void listarVoos(){
		 System.out.println("\nPartidas:\n");
		 for(int i = 0; i < voos.length; i++){
		   if(voos[i] != null){
		     System.out.println("Número: " + voos[i].getNumero());
		     System.out.println("Origem: " + voos[i].getOrigem());
		     System.out.println("Destino: " + voos[i].getDestino());
		     System.out.println("Data: " + voos[i].getData());
		     System.out.println("Horário: " + voos[i].getHorario());
		     System.out.println("Duração: " + voos[i].getDuracao());
		     System.out.println("Lotação: " + voos[i].getLotacao());
		     System.out.println("Valor: " + voos[i].getValor());		     
		   } 
		 }
	}
	
	public static void efetuarReserva(){
		 System.out.print("\nInforme o voo: ");
		 int numero = Integer.parseInt(input.nextLine());
		 boolean encontrado = false;

		 for(int i = 0; i < voos.length; i++){
		   if((voos[i] != null) && (voos[i].getNumero() == numero)){
		     encontrado = true;
		         System.out.print("Nome do passageiro: ");
		         String nome = input.nextLine();
		         System.out.print("CPF do passageiro: ");
		         String cpf =input.nextLine());
		         System.out.print("E-mail do passageiro: ");
		         String email = input.nextLine();
		         System.out.print("Celular do passageiro: ");
		         String celular = input.nextLine();
		         Passageiro p = new Passageiro(nome, cpf, email, celular);
		         Reserva r = new Reserva(cpf, numero);
		         System.out.println("\nReserva efetuada com sucesso.\n");
		         break;
		    }
		  }
		    
		 if(!encontrado){
		   System.out.println("\nO voo não foi encontrado.\n"); 
		 }
	}
	
	public static void listarReservas(){
		 System.out.print("\nInforme o voo: ");
		 int numero = Integer.parseInt(input.nextLine());
		 boolean encontrado = false;

		 for(int i = 0; i < voos.length; i++){
		   if((voos[i] != null) && (voos[i].getNumero() == numero)){
		     encontrado = true;
		     
		     System.out.println("\nReservas para o voo informado: " + numero + ":\n");

		   } 
		 }

		 if(!encontrado){
		   System.out.println("\nO voo não foi encontrado.\n"); 
		 }
	}


}
