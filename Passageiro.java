package airlines;

import java.util.Scanner;

public class Passageiro {
	String nome;
	String cpf;
	String email;
	String celular;
	static Scanner input = new Scanner(System.in);
	
	public Passageiro(String nome, String cpf, String email, String celular) {
	   this.nome = nome;
	   this.cpf = cpf;
	   this.email = email;
	   this.celular = celular;
	}

	public String getNome() {
	   return nome;
	}

	public void setNome(String nome) {
	   this.nome = nome;
	}
	
	public String getCpf() {
	   return cpf;
	}

	public void setCpf(String cpf) {
	   this.cpf = cpf;
	}
		
	public String getEmail() {
	   return email;
	}

	public void setEmail(String email) {
	   this.email = email;
	}
			
	public String getCelular() {
	   return celular;
	}

	public void setCelular(String celular) {
	   this.celular = celular;
	}
	
	public static Passageiro cadastrarPasseiro() {
		 System.out.print("Nome do passageiro: ");
         String nome = input.nextLine();
         System.out.print("CPF do passageiro: ");
         String cpf =input.nextLine();
         System.out.print("E-mail do passageiro: ");
         String email = input.nextLine();
         System.out.print("Celular do passageiro: ");
         String celular = input.nextLine();
         
         Passageiro p = new Passageiro(nome, cpf, email, celular);
         System.out.print("\nPassageiro cadastrado com sucesso!\n");
         
		return p;        
    }
	 

}
