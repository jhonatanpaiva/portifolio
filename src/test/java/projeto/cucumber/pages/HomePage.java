package projeto.cucumber.pages;

import projeto.cucumber.elementos.Elementos;
import projeto.cucumber.metodos.Metodos;

public class HomePage {
	
	Metodos metodo = new Metodos();
	
	public void buscarCepEndereço(String dado) {
		metodo.escrever(Elementos.buscarCepEndereço, dado);
	}

	public void validarDadosRetornados(String logradouro, String bairro, String localidade, String cep) {
		metodo.mudarAba();
		metodo.validarTexto(Elementos.logradouro_Nome, logradouro);
		metodo.validarTexto(Elementos.bairro_Distrito, bairro);
		metodo.validarTexto(Elementos.localidade_Uf, localidade);
		metodo.validarTexto(Elementos.cep, cep);
	}
}
