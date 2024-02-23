package projeto.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.cucumber.config.InicializarTeste;
import projeto.cucumber.pages.HomePage;

public class ConsultaCepTeste {
	
	HomePage home = new HomePage();
	
	@Before
	public void iniciarTeste() {
		InicializarTeste.configurarAmbiente();
	}
	
	@After
	public void finalizarTeste() {
		InicializarTeste.encerrarTeste();
	}
	
	
	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
		home.buscarCepEndereço("02815-000");
	}
	    
	@Then("validar os dados retornados")
	public void validarOsDadosRetornados() {
	    home.validarDadosRetornados("Rua João Amado Coutinho", "Conjunto Residencial Elisio Teixeira Leite", "São Paulo/SP", "02815-000");
	}




}
