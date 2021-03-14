package airlines;

public class Passageiro {
	String nome;
	String cpf;
	String email;
	String celular;

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
	 

}
