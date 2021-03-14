package airlines;

public class Voo {
	int numero;
	String origem;
	String destino;
	String data_voo;
	String horario;
	String duracao;
	int lotacao;
	float valor;

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
	 

}
