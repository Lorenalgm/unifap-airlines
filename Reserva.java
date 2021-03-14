package airlines;

import java.util.Scanner;

public class Reserva extends Menu {
	Voo voo;
	Passageiro passageiro;
	 static Scanner input = new Scanner(System.in);
	
	public Reserva(Voo voo, Passageiro passageiro) {
		this.voo = voo;
	    this.passageiro = passageiro;
	}
	
	public Voo getVoo() {
	    return voo;
	}

	public void Voo(Voo voo) {
	   this.voo = voo;
	}

	public Passageiro getPassageiro() {
	    return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
	   this.passageiro = passageiro;
	}
	
	public static void efetuarReserva(){
		 System.out.print("\nInforme o voo: ");
		 int numero = Integer.parseInt(input.nextLine());
		 boolean encontrado = false;
		 
		 for(Voo v : voos){
			 if(v.getNumero() == numero) {
				 encontrado = true;
				 Passageiro p = Passageiro.cadastrarPasseiro();
				 Reserva r = new Reserva(v, p);
			     Voo.reservas.add(r);
			     System.out.print("\nReserva efetuada com sucesso!\n");
			 }
		 }
		 
		 if(!encontrado){
			 System.out.println("\nO voo não foi encontrado. Tente novamente. \n"); 
		 }
		      

	}
	
	public static void listarReservas(){
		 System.out.print("\nInforme o voo: ");
		 int numero = Integer.parseInt(input.nextLine());
		 boolean encontrado = false;

		 for(Voo v : voos){
			 if(v.getNumero() == numero) {
				 encontrado = true;
				 System.out.println("\nReservas para o voo " + numero + ":\n");
				 
				 for(Reserva r : v.listaReservas()){
					System.out.println("Passageiro: " + r.passageiro.getNome());
				 }
			 }
		 }	 
		 
		 if(!encontrado){
		   System.out.println("\nO voo não foi encontrado. Tente novamente.\n"); 
		 }
	}

}
