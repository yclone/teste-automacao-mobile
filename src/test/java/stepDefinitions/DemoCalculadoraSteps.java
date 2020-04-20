package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import runnerFiles.Config;
import tests.ExecTestes;

public class DemoCalculadoraSteps {
	
	static AppiumDriver<MobileElement> driver;
	ExecTestes testes;
	Config config;
	
	@Dado("que eu abra a calculadora no celular {string}, {string}, {string}")
	public void que_eu_abra_a_calculadora_no_celular(String DEVICE_NAME, String UDID, String PLATFORM_VERSIO) {
		config = new Config();
		driver = config.abreCalculadora(DEVICE_NAME, UDID, PLATFORM_VERSIO);
	}

	@Quando("fazer a soma de {int} mais {int}")
	public void fazer_a_soma_de_mais(Integer int1, Integer int2) {
		testes = new ExecTestes(driver);
		testes.clicaNumero(int1);
		testes.clicaOperacaSoma();
		testes.clicaNumero(int2);
		
	}

	@Quando("clicar em igual")
	public void clicar_em_igual() {
		testes = new ExecTestes(driver);
		testes.clicaIgual();
	}

	@Entao("a resposta deve ser {string}")
	public void a_resposta_deve_ser(String resp) {
		testes.validaResp(resp);
	}

}
