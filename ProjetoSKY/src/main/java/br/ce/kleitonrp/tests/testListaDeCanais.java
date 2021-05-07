package br.ce.kleitonrp.tests;

import static br.ce.kleitonrp.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

import br.ce.kleitonrp.core.BasePage;
import br.ce.kleitonrp.core.BaseTest;
import br.ce.kleitonrp.pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class testListaDeCanais extends BaseTest
{
	MenuPage menu = new MenuPage();
	BasePage page = new BasePage();
	
	@Test
	public void test1_Programacao() throws InterruptedException
	{
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menu.acessarTelaInicial();
		page.clicarBotao(By.xpath("//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_YQcCxObpxg0J\"]//button[@class= 'close']"));
		//Xpath para fechar o popup
		
		menu.acessarTelaProgramacao();
	}
	
	@Test
	public void test2_ListaCanais () throws InterruptedException
	{
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menu.acessarTelaListadeCanais();
		String canal = "BANDSPORTS HD";		//Usei uma variavel para alterar somente aqui o "canal" desejavel.
		page.escreve("searchChannel", canal);
		Assert.assertEquals(canal, page.obterTextoCanal(canal));
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
}