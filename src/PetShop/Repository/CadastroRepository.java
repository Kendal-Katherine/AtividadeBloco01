package PetShop.Repository;

import PetShop.Model.Cadastro;

public interface CadastroRepository {
	
	public void procurarPorTutor(String nomeTutor);
	public void listarTodas();
	public void cadastrar(Cadastro cadastro);
	public void atualizar(Cadastro cadastro);
	public void deletar(String nomeTutor);
	

}
