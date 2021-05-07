package br.ce.kleitonrp.core;

import static br.ce.kleitonrp.core.DriverFactory.getDriver;
import org.openqa.selenium.By;


public class BasePage
{
/*****************   TextField e TextArea   ******************/
	
	public void escreve(String id_campo, String texto)		//Busca um campo por ID e escreve o texto desejavel.
	{
		getDriver().findElement(By.id(id_campo)).clear();
		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	/*****************   RadioButton   ******************/
	
	public void clicarRadioXpath(By by)
	{
		getDriver().findElement(by).click();
	}	
	
	public void clicarRadioButton(String id)
	{
		getDriver().findElement(By.id(id)).click();
	}
	
	public boolean isRadioMarcado(String id)
	{
		return getDriver().findElement(By.id(id)).isSelected();
	}
	
	/*****************   BOTAO   ******************/
	
	public void clicarBotao(String id)
	{
		getDriver().findElement(By.id(id)).click();
	}
	
	public void clicarBotao(By by)
	{
		getDriver().findElement(by).click();
	}
	
	/*****************   LINK   ******************/
	
	public void clicarLink(String link)
	{
		getDriver().findElement(By.linkText(link)).click();
	}
	
	/*****************   TEXTOS   ******************/
	
	public String obterTexto(By by)
	{
		return getDriver().findElement(by).getText();
	}
	
	public String obterTexto(String id)
	{
		return obterTexto(By.id(id));
	}
	
	public String obterTextoCanal(String canal)
	{
		return getDriver().findElement(By.xpath("//*[@class= 'list-channel-detail row']//li/following-sibling::*[@style= ''][name()='li']//*[.='"+canal+"']")).getText();
		//Este Xpath está preparado para obter qualquer nome do "canal" desejado, sem necessidade de alterar o codigo, apenas a variavel.
	}
	
}
