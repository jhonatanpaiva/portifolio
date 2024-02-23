package projeto.cucumber.config;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import projeto.cucumber.drivers.DriverConexao;

public class InicializarTeste extends DriverConexao {
	
	static String ambiente = "https://www.correios.com.br/";
	
	public static void configurarAmbiente() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();
	}

	public static void encerrarTeste() {
		driver.quit();
	}
}
