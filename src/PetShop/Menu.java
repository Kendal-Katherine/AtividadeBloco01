package PetShop;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.util.InputMismatchException;
import java.util.Scanner;

import PetShop.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	//	Controller cadastro = new Controller();

		int opcao, tipo, numeroDestino;
		String nomePet, nomeTutor, domestico, silvestre, telefone;

		while (true) {

			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT
					+ "****************************************************************************");
			System.out.println("                                                                            ");
			System.out.println("                            PetShop KKC                                     ");
			System.out.println("                                                                            ");
			System.out.println("****************************************************************************");
			System.out.println("                                                                            ");
			System.out.println("                        1 - Criar cadatro de Pet                            ");
			System.out.println("                        2 - Listar todos os cadastros                       ");
			System.out.println("                        3 - Buscar Cadastro por Pet                         ");
			System.out.println("                        4 - Atualizar dados do cadastro do Pet              ");
			System.out.println("                        5 - Apagar conta                                    ");
			System.out.println("                        6 - Consulta por Titular                            ");
			System.out.println("                        0 - Sair                                            ");
			System.out.println("                                                                            ");
			System.out.println("****************************************************************************");
			System.out.println("Entre com a opção desejada:                                                  ");
			System.out.println(
					"                                                                            " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;

			}

			if (opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "PetShop KKC!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println(Cores.TEXT_WHITE + " Cadatro do Pet\n\n");

				System.out.println("Digite o nome do Tutor: ");
				nomeTutor = leia.next();
				leia.skip("\\R");

				System.out.println("Digite o número de telefone do tutor: ");
				telefone = leia.nextLine();

				System.out.println("Digite o nome do Pet: ");
				nomePet = leia.nextLine();

				System.out.println("Digite o tipo de Pet (1 - Doméstico ou 2 - Silvestre): ");
				tipo = leia.nextInt();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite a espécie do Pet: ");
					domestico = leia.nextLine();
				}
				case 2 -> {
					System.out.println("Digite o dia do aniversário da conta: ");
					silvestre = leia.nextLine();

				}
				}
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os Cadastros\n\n");
				
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar Cadastro por Pet\n\n");
				
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados do cadastro do Pet\n\n");
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar cadastro \n\n");

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Consulta por Titular \n\n");

				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;

			}
		}

	}

	public static void sobre() {
		System.out.println("****************************************************************************");
		System.out.println("Projeto desenvolvido por: Kendal Katherine Correia                          ");
		System.out.println("Apoio Generation Brasil - generation@generation.org                         ");
		System.out.println("https://github.com/Kendal-Katherine/projeto_final_bloco_01                  ");
		System.out.println("****************************************************************************");
	}

	public static void keyPress() {
		try {

			System.out.println("\n\nPreesione a tecla Enter para continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla inválida!");

		}
	}

}
