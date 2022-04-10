package br.ce.pedro.page;

import br.ce.pedro.core.BasePage;
import br.ce.pedro.core.DriverFactory;

public class cadastro_um_page extends BasePage {

	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}

	public void setMake(String make) {
		selecionarMake("make", make);
	}


	public void setModel(String model) {
		selecionarModel("model", model);
	}
	
	public void setCylinder(String cylinder) {
		capacidadeCilindro("cylindercapacity", cylinder);
	}

	public void setEngine(String engine) {
		capacidadeEngine("engineperformance", engine);
	}
	
	public void setDate(String date) {
		selecionarDate("dateofmanufacture", date);
	}
	
	public void setSeats(String seats) {
		selecionarSeats("numberofseats", seats);
	}
	
	public void setHand() {
		selecionarRightHand("ideal-radiocheck-label");
	}
	
	public void setSeats2(String seats2) {
		selecionarSeats("numberofseatsmotorcycle", seats2);
	}
	
	public void setFuel(String fuel) {
		selecionarSeats("fuel", fuel);
	}
	
	public void setPayload(String payload) {
		selecionarPayload("payload", payload);
	}
	
	public void setWeight(String weight) {
		selecionarWeightd("totalweight", weight);
	}
	
	public void setPrice(String price) {
		selecionarPrice("listprice", price);
	}
	
	public void setLicense(String license) {
		selecionarLicense("licenseplatenumber", license);
	}
	
	public void setMileage(String mileage) {
		selecionarMileage("annualmileage", mileage);
	}
	
	public void setNext() {
		clicarNext("nextenterinsurantdata");
	}
}
