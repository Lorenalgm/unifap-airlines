package airlines;
import java.util.ArrayList;
import java.util.List;

public class Voo extends Menu {
	int numero;
	String origem;
	String destino;
	String data_voo;
	String horario;
	String duracao;
	int lotacao;
	float valor;
	static List<Reserva> reservas = new ArrayList<Reserva>();
	
	public Voo(int numero, String origem, String destino, String data_voo, String horario, String duracao, int lotacao, float valor) {
	   this.numero = numero;
	   this.origem = origem;
	   this.destino = destino;
	   this.data_voo = data_voo;
	   this.horario = horario;
	   this.duracao = duracao;
	   this.lotacao = lotacao;
	   this.valor = valor;
	}

	public int getNumero() {
	   return numero;
	}

	public void setNumero(int numero) {
	   this.numero = numero;
	}
	
	public String getOrigem() {
	   return origem;
	}

	public void setOrigem(String origem) {
	   this.origem = origem;
	}
		
	public String getDestino() {
	   return destino;
	}

	public void setDestino(String destino) {
	   this.destino = destino;
	}
			
	public String getDataVoo() {
	   return data_voo;
	}

	public void setDataVoo(String data_voo) {
	   this.data_voo = data_voo;
	}
	
	public String getHorario() {
	   return horario;
	}

	public void setHorario(String horario) {
	   this.horario = horario;
	}
		
	public String getDuracao() {
	   return duracao;
	}

	public void setDuracao(String duracao) {
	   this.duracao = duracao;
	}
	
	public int getLotacao() {
	   return lotacao;
	}

	public void setLotacao(int lotacao) {
	   this.lotacao = lotacao;
	}
		
	public float getValor() {
	   return valor;
	}

	public void setValor(float valor) {
	   this.valor = valor;
	}
	
	public static void cadastrarVoo(){
		boolean sucesso = false;

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
		     Voo v = new Voo(numero, origem, destino, data_voo, horario, duracao, lotacao, valor);
		     voos.add(v);
		     
		     System.out.println("\nVoo cadastrado com sucesso.\n");
		     sucesso = true;
		     

		 if(!sucesso){
		   System.out.println("\nNão há mais aviões disponíveis para novos voos.\n"); 
		 }
	}
	
	public static void listarVoos(){
		 System.out.println("\nPartidas:\n");
		
		 for(Voo voo : voos){
		     System.out.println("Número: " + voo.getNumero());
		     System.out.println("Origem: " + voo.getOrigem());
		     System.out.println("Destino: " + voo.getDestino());
		     System.out.println("Data: " + voo.getDataVoo());
		     System.out.println("Horário: " + voo.getHorario());
		     System.out.println("Duração: " + voo.getDuracao());
		     System.out.println("Lotação: " + voo.getLotacao());
		     System.out.println("Valor: " + voo.getValor());		     
		 }
	}
	
	public void adicionaReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}

	public List<Reserva> listaReservas() {
	    return reservas;
	}

	 

}
