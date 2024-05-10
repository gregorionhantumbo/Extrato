package gregorio.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorDeExtrato {
	public void imprimirExtrato(Conta c) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("Data: " + sdf.format(agora));
		System.out.println("Saldo: " + c.getSaldo());
	}
}
