package br.edu.uniritter.TrabalhoQualidadeDeSoftware.base;

public class Pagina {

	private DriverBase driverBase;

	public Pagina(DriverBase driverBase) {
		this.driverBase = driverBase;
	}

	public DriverBase getDriverBase() {
		return driverBase;
	}

	public void setDriverBase(DriverBase driverBase) {
		this.driverBase = driverBase;
	}			
	
}
