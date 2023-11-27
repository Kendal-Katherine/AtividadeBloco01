package PetShop.Model;

public class Domestico  extends Cadastro{

	public Domestico(String nomeTutor, String telefone, String nomePet, int tipo) {
		super(nomeTutor, telefone, nomePet, tipo);
		
	}

	public void visualizar() {
		super.visualizar();
		}
	
}
