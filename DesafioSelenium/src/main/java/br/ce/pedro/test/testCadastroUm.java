package br.ce.pedro.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.pedro.core.BasePage;
import br.ce.pedro.core.BaseTest;
import br.ce.pedro.page.cadastro_um_page;

public class testCadastroUm extends BaseTest {

	cadastro_um_page c1 = new cadastro_um_page();
	BasePage basePage = new BasePage();

	@Test
	public void validadeMake() {
		c1.acessarTelaInicial();

		c1.setMake("Suzuki");
		c1.setModel("Motorcycle");
		c1.setCylinder("300");
		c1.setEngine("200");
		c1.setDate("04/19/1994");
		c1.setSeats("2");
		c1.setHand( );
		c1.setSeats2("1");
		c1.setFuel("Other");
		c1.setPayload("100");
		c1.setWeight("200");
		c1.setPrice("1000");
		c1.setLicense("abc123");
		c1.setMileage("250");
		c1.setNext();

		Assert.assertEquals("300", c1.obterCilindro("cylindercapacity"));
		Assert.assertEquals("200", c1.obterEngine("engineperformance"));
		Assert.assertEquals("04/19/1994", c1.obterDate("dateofmanufacture"));
		Assert.assertFalse(c1.validarRightHand("ideal-radiocheck-label"));
		Assert.assertEquals("100", c1.obterPayload("payload"));
		Assert.assertEquals("200", c1.obterWeight("totalweight"));
		Assert.assertEquals("1000", c1.obterPrice("listprice"));
		Assert.assertEquals("abc123", c1.obterLicense("licenseplatenumber"));
		Assert.assertEquals("250", c1.obterMileage("annualmileage"));
	}

}
