package br.ce.kleitonrp.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.ce.kleitonrp.core.DriverFactory;
import br.ce.kleitonrp.tests.testListaDeCanais;

@RunWith(Suite.class)
@SuiteClasses
({
	testListaDeCanais.class
})
public class SuiteTeste
{
	@AfterClass
	public static void finalizaTudo()
	{
		DriverFactory.killDriver();
	}
	
}
