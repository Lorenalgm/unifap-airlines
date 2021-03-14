package airlines;
import java.util.Scanner;
import java.util.ArrayList;


public class Menu {
	 static Scanner input = new Scanner(System.in);
	 static ArrayList<Voo> voos = new ArrayList<Voo>();

	public static void main(String[] args) {
		System.out.println("Bem vindo ao Unifap Airline!\n");
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
			       Voo.cadastrarVoo();
			       break;
			     case 2:
			       Voo.listarVoos();
			       break;
			     case 3:
			       Reserva.efetuarReserva();
			       break;
			     case 4:
			       Reserva.listarReservas();
			       break; 
			     case 5:
			       System.out.println("\nEncerrando procedimento!\n");
			       System.exit(0);
			       break;
			   }
		}
	}


}
