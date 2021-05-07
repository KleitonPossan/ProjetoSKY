package br.ce.kleitonrp.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{
	private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver()
	{
		if(driver == null)
		{
			switch (Propriedades.browser)
			{
			case FIREFOX: driver = new FirefoxDriver(); break;
			case CHROME: driver = new ChromeDriver(); break;
			}
			driver.manage().window().setPosition(new Point(50,50));// Determina a posicao que o browser mais abrir na tela
			driver.manage().window().setSize(new Dimension(1000,1000));// Determina o tamanho da janela do browser
		}
		return driver;
	}
	
	public static void killDriver()
	{
		if(driver != null)
		{
		driver.quit();
		driver = null;
		}
	}
}