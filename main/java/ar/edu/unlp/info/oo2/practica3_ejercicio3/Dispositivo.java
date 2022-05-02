package ar.edu.unlp.info.oo2.practica3_ejercicio3;

public class Dispositivo {
	
	private Connection connection;
	private Ringer ringer;
	private Display display;
	private StrategyCalculator crcCalculator;
	
	public Dispositivo() {
		this.display = new Display();
		this.ringer = new Ringer();
		this.connection = new WifiConn(); 
		this.crcCalculator = new CRC16_Calculator();
	}
	
	public void changeStrategyToCRC32() {
		this.crcCalculator = new CRC32_Calculator();
	}
	
	public void changeStrategyToCRC16() {
		this.crcCalculator = new CRC16_Calculator();
	}
	
	public void changeToWifi() {
		if(this.connection.pict() != "Wifi Connection icon")
		this.connection = new WifiConn();
	}
	
	public void changeTo4G() {
		if(this.connection.pict() != "4G Connection icon")
		this.connection = new GConnection();
	}
	
	public String send(String data) {
		return "";
	}
}
