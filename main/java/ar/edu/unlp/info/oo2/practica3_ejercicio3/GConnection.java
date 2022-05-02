package ar.edu.unlp.info.oo2.practica3_ejercicio3;

public class GConnection extends Connection {

	private String symb;
	
	public GConnection() {
		this.symb = "4G Connection icon";
	}
	
	public String transmit(String data, int crc) {
		return data;
	}
	
	@Override
	public String sendData(String data, int crc) {
		return this.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.symb;
	}

}
