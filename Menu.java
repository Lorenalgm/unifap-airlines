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
//			       cadastrarVoo();
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

}
