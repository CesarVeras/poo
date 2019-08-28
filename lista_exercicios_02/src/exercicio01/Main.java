package exercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa p1 = new Pessoa("Eduardo", 'M', sdf.parse("29/01/1997"), "105.897.429-73", "Bairro Saco Grande", null);
		Pessoa p2 = new Pessoa("Erick", 'M', sdf.parse("15/12/2000"), "190.190.190-19", "Bairro Barreiros", p1);
		p1.setConjuge(p2);
		
		System.out.println(p1.imprimirConjuge(false));
		System.out.println(p1.imprimirConjuge(true));
	}

}
