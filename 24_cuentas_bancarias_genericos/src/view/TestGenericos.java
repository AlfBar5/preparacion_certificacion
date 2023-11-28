package view;

import java.util.function.Consumer;
import java.util.stream.Stream;

import service.Cuenta;
import service.CuentaLimite;
import service.CuentaMovimientos;

public class TestGenericos {

	public static void main(String[] args) {

		//Creo dos objetos tipo cuenta
		Stream<CuentaLimite> st=Stream.of(new CuentaLimite("a",100,10),
				new CuentaLimite("b",200,20)
				);
		
		
		//de cada cuenta sacar el saldo
		Consumer<Cuenta> con=c->System.out.println(c.getSaldo());
		
		//mostrar los saldos de todas las cuentas
		st.forEach(con);

		System.out.println("----------");
		
		//cuentas movimiento
		Stream<CuentaMovimientos> st2=Stream.of(new CuentaMovimientos("c",300,30),
				new CuentaMovimientos("d",400,40)
				);
		
		st2.forEach(con);
	}

}


