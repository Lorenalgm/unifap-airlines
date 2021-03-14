package airlines;
import java.util.Scanner;

public class Menu {
	 static Scanner input = new Scanner(System.in);
	 static Voo voos[] = new Voo[1];

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
//			       listarVoos();
			       break;
			     case 3:
//			       efetuarReserva();
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
		     String data = input.nextLine();
		     System.out.print("Horário: ");
		     String horario = input.nextLine();
		     System.out.print("Duração");
		     String duracao = input.nextLine();
		     System.out.print("Lotação");
		     int lotacao = Integer.parseInt(input.nextLine());
		     System.out.print("Valor");
		     float valor = Float.parseFloat(input.nextLine());
		     voos[i] = new Voo(numero, origem, destino, data, horario, duracao, lotacao, valor);
		     System.out.println("\nVoo cadastrado com sucesso.\n");
		     sucesso = true;
		     break;
		   }  
		 }

		 if(!sucesso){
		   System.out.println("\nNão há mais aviões disponíveis para novos voos.\n"); 
		 }
	}


}
