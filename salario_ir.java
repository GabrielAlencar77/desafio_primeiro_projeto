import java.util.Locale;
import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double salario = sc.nextDouble();
	double ir;
		
	if (salario <= 1500) {
		ir = 0;
		System.out.println("Isento");	
	}
	
	else if (salario - 1500 <= 1000) {
		ir = (salario - 1500) * 0.08;
		System.out.printf("R$ %.2f%n", ir);
	}
	
	else if (salario - 1500 <= 2500) {
		ir = ((salario - 3000) * 0.18) + 1000 * 0.08;
		System.out.printf("R$ %.2f%n", ir);
	}
	
	else {
		ir = ((salario - 3500) * 0.28) + 1000 * 0.18 + 500 * 0.08;
		System.out.printf("R$ %.2f%n", ir);
	}
		
	sc.close();
	}

}