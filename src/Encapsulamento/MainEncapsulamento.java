package Encapsulamento;

import java.util.Scanner;

public class MainEncapsulamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ControleRemoto controle = new ControleRemoto();

		int resposta;
		int volume;
		String modoReprodução;

		do {
			System.out.println("****Menu****");
			System.out.println("1 - Alterar volume. ");
			System.out.println("2 - Modo de reprodução. ");
			System.out.println("3 - Exibir Menu ");
			System.out.println("4 - Fechar Menu. ");
			resposta = scanner.nextInt();

			switch (resposta) {
			case 1:

				System.out.println("Deseja alterar o volume ? [1] Aumentar Volume [2] Diminuir Volume");
				volume = scanner.nextInt();
				if (volume == 1) {
					controle.maisVolume();
//					controle.setVolume();
					System.out.println("Aumentar Volume");
				} else if (volume == 2) {
					controle.menosVolume();
//					controle.setVolume();
					System.out.println("Diminuir Volume");

				} else {
					System.out.println("Não foi possível alterar o volume.");
				}

				break;
			case 2:
				System.out.println("Deseja tocar ? Sim ou Não");
				modoReprodução = scanner.nextLine();
				if (modoReprodução == "Sim") {
					controle.play();
					System.out.println("TV ligada e reproduzindo. ");
				} else {
					controle.pause();
					System.out.println("TV Pausada. ");
				}

				break;
			case 3:
				controle.abrirMenu();

				break;

			case 4:

				controle.fecharMenu();

				System.out.println("Menu fechado");

				break;
			}

			System.out.println(controle);
		} while (resposta < 4);
		scanner.close();
	}
}
