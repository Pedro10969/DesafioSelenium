package br.ce.pedro.core;

import static br.ce.pedro.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	// Make

	public void selecionarMake(String id_Make, String valor) {
		WebElement element = getDriver().findElement(By.id(id_Make));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	// Model

	public void selecionarModel(String id_Model, String valor) {
		WebElement element = getDriver().findElement(By.id(id_Model));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	// Cylinder Capacity [ccm]
	
	public void capacidadeCilindro(String id_cilindro, String texto) {
		getDriver().findElement(By.id(id_cilindro)).sendKeys(texto);
	}
	
	
	public String obterCilindro(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Engine Performance [kW]

	public void capacidadeEngine(String id_engine, String texto) {
		getDriver().findElement(By.id(id_engine)).sendKeys(texto);
	}
	
	public String obterEngine(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Date of Manufacture 

	public void selecionarDate(String id_date, String texto) {
		getDriver().findElement(By.id(id_date)).sendKeys(texto);
	}
	
	public String obterDate(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Number of Seats

	public void selecionarSeats(String id_seats, String valor) {
		WebElement element = getDriver().findElement(By.id(id_seats));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	// Right Hand Drive

	public void selecionarRightHand(String id_hand) {
		getDriver().findElement(By.className(id_hand)).click();
	}
	
	public boolean validarRightHand(String id) {
		return getDriver().findElement(By.className(id)).isSelected();
	}

	// Number of Seats
	
	/*  public void selecionarSeats2(String id_seats2, String valor) {
		WebElement element = getDriver().findElement(By.id(id_seats2));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	 */

	// Fuel Type
	
	public void selecionarFuel(String id_fuel, String valor) {
		WebElement element = getDriver().findElement(By.id(id_fuel));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	// Payload [kg]
	
	public void selecionarPayload(String id_payload, String text) {
		getDriver().findElement(By.id(id_payload)).sendKeys(text);
	}
	
	public String obterPayload(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Total Weight [kg]
	
	public void selecionarWeightd(String id_weight, String text) {
		getDriver().findElement(By.id(id_weight)).sendKeys(text);
	}
	
	public String obterWeight(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// List Price [$]
	
	public void selecionarPrice(String id_price, String text) {
		getDriver().findElement(By.id(id_price)).sendKeys(text);
	}
	
	public String obterPrice(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// License Plate Number
	
	public void selecionarLicense(String id_license, String text) {
		getDriver().findElement(By.id(id_license)).sendKeys(text);
	}
	
	public String obterLicense(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Annual Mileage [mi]
	
	public void selecionarMileage(String id_mileage, String text) {
		getDriver().findElement(By.id(id_mileage)).sendKeys(text);
	}
	
	
	public String obterMileage(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}
	
	// Next
	
	public void clicarNext(String id_next) {
		getDriver().findElement(By.id(id_next)).click();
	}
}