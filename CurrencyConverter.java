
import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConverter
 {
 
	public static void main(String[] args) 
	{
 
		double amount, dollar, pound, code, euro, yen, ringgit, rupee;
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Hi! Welcome to the Currency Converter!");
 
		System.out.println("Which currency do you want to convert? ");
		
		System.out.println("1:Rupee \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
		code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
 
		// For amounts Conversion
		if (code == 1) {
 
			dollar = amount / 70;
			System.out.println("Your "+amount + " Rupee is : ");
			System.out.println(f.format(dollar) + " Dollar");
 
			pound = amount / 88;
			System.out.println(f.format(pound) + " Pound");
 
			euro = amount / 80;
			System.out.println(f.format(euro) + " Euro");
 
			yen = amount / 0.63;
			System.out.println(f.format(yen) + " Yen");
 
			ringgit = amount / 16;
			System.out.println(f.format(ringgit) + " Ringgit");
		} else if (code == 2) {
			// For Dollar Conversion
			System.out.println("Your "+amount + " Dollar is : ");
 
			rupee = amount * 70;
			System.out.println(f.format(rupee) + " Rupees");
 
			pound = amount * 0.78;
			System.out.println(f.format(pound) + " Pound");
 
			euro = amount * 0.87;
			System.out.println(f.format(euro) + " Euro");
 
			yen = amount * 111.087;
			System.out.println(f.format(yen) + " Yen");
 
			ringgit = amount * 4.17;
			System.out.println(f.format(ringgit) + " Ringgit");
		} else if (code == 3) {
			// For Pound Conversion
			System.out.println("Your "+amount + " Pound is : ");
 
			rupee = amount * 88;
			System.out.println(f.format(rupee) + " Rupees");
 
			dollar = amount * 1.26;
			System.out.println(f.format(dollar) + " Dollar");
 
			euro = amount * 1.10;
			System.out.println(f.format(euro) + " Euro");
 
			yen = amount * 140.93;
			System.out.println(f.format(yen) + " Yen");
 
			ringgit = amount * 5.29;
			System.out.println(f.format(ringgit) + " Ringgit");
		} else if (code == 4) {
			// For Euro Conversion
			System.out.println("Your "+amount + " Euro is : ");
 
			rupee = amount * 80;
			System.out.println(f.format(rupee) + " Rupees");
 
			dollar = amount * 1.14;
			System.out.println( f.format(dollar) + " Dollar");
 
			pound = amount * 0.90;
			System.out.println(f.format(pound) + " Pound");
 
			yen = amount * 127.32;
			System.out.println(f.format(yen) + " Yen");
 
			ringgit = amount * 4.78;
			System.out.println(f.format(ringgit) + " Ringgit");
		} else if (code == 5) {
 
			// For Yen Conversion
			System.out.println("Your "+amount + " Yen is : ");
 
			rupee = amount * 0.63;
			System.out.println(f.format(rupee) + " Rupees");
 
			dollar = amount * 0.008;
			System.out.println(f.format(dollar) + " Dollar");
 
			pound = amount * 0.007;
			System.out.println(f.format(pound) + " Pound");
 
			euro = amount * 0.007;
			System.out.println(f.format(euro) + " Euro");
 
			ringgit = amount * 0.037;
			System.out.println(f.format(ringgit) + " Ringgit");
		} else if (code == 6) {
			// For Ringgit Conversion
			System.out.println("Your "+amount + " Ringgit is : ");
 
			rupee = amount * 16.8;
			System.out.println(f.format(rupee) + " Rupees");
 
			dollar = amount * 0.239;
			System.out.println(f.format(dollar) + " Dollar");
 
			pound = amount * 0.188;
			System.out.println(f.format(pound) + " Pound");
 
			euro = amount * 0.209;
			System.out.println(f.format(euro) + " Euro");
 
			yen = amount * 26.63;
			System.out.println(f.format(yen) + " Yen");
		} else {
			System.out.println("Invalid Input");
		}
		
		
	}
 
}