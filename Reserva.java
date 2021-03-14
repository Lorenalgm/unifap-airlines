package airlines;

public class Reserva {
	Voo voo;
	Passageiro passageiro;
	
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

}
