package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main {
	public static void main(String[] args) {
	
		Veiculo v = new Veiculo();
		
		v.ligar();
		v.abastecer(50);
		v.acelerar();
		v.acelerar();
		v.acelerar();
		v.acelerar();
		v.acelerar();
		v.acelerar();
		v.acelerar();
		v.acelerar();
		v.acelerar();
		v.acelerar();
		v.acelerar();
		v.abastecer(5);
		v.acelerar();
		v.frear();
		v.pintar("vermelho");
		v.desligar();
		
}
}