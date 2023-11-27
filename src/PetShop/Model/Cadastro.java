package PetShop.Model;

import java.util.ArrayList;

public class Cadastro {

	private String nomeTutor;
	private String telefone;
	private String nomePet;
	private int tipo;

	public Cadastro(String nomeTutor, String telefone, String nomePet, int tipo) {
		super();
		this.nomeTutor = nomeTutor;
		this.telefone = telefone;
		this.nomePet = nomePet;
		this.tipo = tipo;
	}

	public String getNomeTutor() {
		return nomeTutor;
	}

	public void setNomeTutor(String nomeTutor) {
		this.nomeTutor = nomeTutor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {

		String tipo = "";
		switch (this.tipo) {
		case 1 -> tipo = "Doméstico";
		case 2 -> tipo = "Silvestre";
		}

		System.out.println("\n\n******************************************");
		System.out.println("CADASTRO DO PET: ");
		System.out.println("******************************************");
		System.out.println("Nome do Tutor: " + this.nomeTutor);
		System.out.println("Telefone do Tutor: " + this.telefone);
		System.out.println("Titular da conta: " + this.nomePet);
		System.out.println("Tipo de Pet: " + tipo);
				
	}


	
}
