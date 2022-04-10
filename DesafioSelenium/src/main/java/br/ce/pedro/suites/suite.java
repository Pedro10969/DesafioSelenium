package br.ce.pedro.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.pedro.core.DriverFactory;
import br.ce.pedro.page.cadastro_um_page;
import br.ce.pedro.page.cadastro_dois;
import br.ce.pedro.page.cadastro_tres;
import br.ce.pedro.page.cadastro_quatro;
import br.ce.pedro.page.cadastro_cinco;

@RunWith(Suite.class)
@SuiteClasses({
	cadastro_um_page.class,
	cadastro_dois.class,
	cadastro_tres.class,
	cadastro_quatro.class,
	cadastro_cinco.class
})

public class suite {
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}

}
