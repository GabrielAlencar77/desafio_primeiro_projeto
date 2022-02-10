import java.util.Locale;
import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double salario = sc.nextDouble();
	double ir;
		
	if (salario <= 2000) {
		ir = 0;
		System.out.println("Isento de pagar");	
	}
	
	else if (salario - 2000 <= 1000) {
		ir = (salario - 2000) * 0.08;
		System.out.printf("R$ %.2f%n", ir);
	}
	
	else if (salario - 2000 <= 2500) {
		ir = ((salario - 3000) * 0.18) + 1000 * 0.08;
		System.out.printf("R$ %.2f%n", ir);
	}
	
	else {
		ir = ((salario - 4500) * 0.28) + 1500 * 0.18 + 1000 * 0.08;
		System.out.printf("R$ %.2f%n", ir);
	}
		
	sc.close();
	}

}