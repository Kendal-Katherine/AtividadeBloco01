package PetShop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import PetShop.Model.Cadastro;
import PetShop.Repository.CadastroRepository;

public abstract class Controller implements CadastroRepository{
	
	private ArrayList<Cadastro> listaCadastros = new ArrayList<Cadastro>();
	
	int numero = 0;

	@Override
	public void procurarPorTutor(String nomeTutor) {
		List<Cadastro> listaNomes = listaCadastros.stream()
				.filter(c -> c.getNomeTutor().contains(nomeTutor))
				.collect(Collectors.toList());
		
		for(var cadastro : listaNomes)
			cadastro.visualizar();
	}

	
	@Override
	public void listarTodas() {
		for (var cadastro : listaCadastros) {
			cadastro.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Cadastro cadastro) {
		listaCadastros.add(cadastro);
		System.out.println("O cadastro do Pet: " + cadastro.getNomePet() + " foi criado com Sucesso!");
	}

	@Override
	public void atualizar(Cadastro cadastro) {
		Optional<Cadastro> buscaCadastro = buscarNaCollection(cadastro.getNomeTutor());

		if (buscaCadastro.isPresent()) {
			listaCadastros.set(listaCadastros.indexOf(buscaCadastro.get()), cadastro);
			System.out.println("O cadastro do Pet: " + cadastro.getNomePet() + " foi atualizado com sucesso!");
		} else
			System.out.println("O cadastro do Pet: " + cadastro.getNomePet() + " não foi encontrado!");

	}
		
	

	@Override
	public void deletar(String nomeTutor) {
		Optional<Cadastro> cadastro = buscarNaCollection(cadastro.get());

		if (cadastro.isPresent())
			if (listaCadastros.remove(cadastro.get()) == true)
				System.out.println("O cadastro do Pet foi excluído com sucesso!");

			else
				System.out.println("O cadastro do Pet não foi encontrado!");

		
	}
	
	protected abstract Optional<Cadastro> buscarNaCollection(Cadastro cadastro);


	private Optional<Cadastro> buscarNaCollection(String nomeTutor) {
		for (var cadastro : listaCadastros) {
			if (cadastro.getNomeTutor() == nomeTutor)
				return Optional.of(cadastro);
		}

		return Optional.empty();
	}

}
