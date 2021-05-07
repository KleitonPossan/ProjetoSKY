package br.ce.kleitonrp.pages;

import org.openqa.selenium.By;

import br.ce.kleitonrp.core.BasePage;
import br.ce.kleitonrp.core.DriverFactory;

public class MenuPage extends BasePage
{
	public void acessarTelaInicial()
	{
		DriverFactory.getDriver().get("https://www.sky.com.br");
	}
	
	public void acessarTelaProgramacao()
	{
		clicarLink("Programação");
	}
	
	public void acessarTelaListadeCanais()
	{
		clicarBotao(By.xpath("//*[@class= 'btn btn-title-no-background pull-right']//span"));
	}
	
}
