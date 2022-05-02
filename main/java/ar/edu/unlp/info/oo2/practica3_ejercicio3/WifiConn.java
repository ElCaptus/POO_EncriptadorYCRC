package ar.edu.unlp.info.oo2.practica3_ejercicio3;

public class WifiConn extends Connection {

	private String pict;
	
	public WifiConn() {
		this.pict = "Wifi Connection icon";
	}
	
	@Override
	public String sendData(String data, int crc) {
		return data;
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
