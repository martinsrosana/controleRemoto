package Encapsulamento;

public class ControleRemoto implements Controlador {

	private int volume;
	private String ligado;
	private String tocando;

	

	ControleRemoto() {
		super();
		this.volume = 20;
		this.ligado = "Sim";
		this.tocando = "Sim";
	}


	public int getVolume() {
		return volume;
	}




	public void setVolume(int volume) {
		this.volume = volume;
	}




	public String getLigado() {
		return ligado;
	}




	public void setLigado(String ligado) {
		this.ligado ="Sim";
	}




	public String getTocando() {
		return tocando;
	}




	public void setTocando(String tocando) {
		this.tocando = "Sim";
	}




	public void ligar() {
		this.setLigado("Sim");
		System.out.println();
		System.out.println("Aparelho Ligado! Volume: " + this.volume);

	}

	
	public void desligar() {
		this.setLigado("Não");

	}

	public void abrirMenu() {
		
		System.out.println();
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("[]");
		} 
	}

	
	public void fecharMenu() {
		System.out.println("Fechando Menu...");

	}


	public void maisVolume() {
		if (this.getLigado()=="Sim") {
			this.setVolume(this.getVolume() + 10);
		}else {
			System.out.println("Impossível aumentar o Volume");
		}

	}

	public void menosVolume() {
		if (this.getLigado()== "Sim") {
			this.setVolume(this.getVolume() - 10);
		}else {
			System.out.println("Impossível diminuir o Volume");
		}

	}


	public void ligarMudo() {
		if (this.getLigado()== "Sim" && this.getVolume() > 0 ) {
			this.setVolume(volume);
		}

	}

	public void desligarMudo() {
		if (this.getLigado()== "Sim" && this.getVolume() == 0) {
			this.setVolume(volume);
		}else {
			System.out.println("Já está no mudo");
		}

	}

	public void play() {
		if (this.getLigado()=="Sim" && (this.getTocando()=="Não")) {
			this.setTocando("Sim");
		}
		
	}
	public void pause() {
		if (this.getLigado()=="Sim" && this.getTocando()=="Sim") {
			this.setTocando("Não");
		}

	}
	public String toString () {
		return "A TV está ligada? "
				+" "
				+ this.tocando
				+" . O volume atual da TV é: "
				+" "
				+ this.volume;
	           
	}
}
