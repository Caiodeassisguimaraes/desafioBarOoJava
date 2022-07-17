package application;

import java.util.Locale;
import java.util.Scanner;
import util.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill result = new Bill();

		System.out.print("Gender: ");
		result.gender = sc.next().charAt(0);
		while (result.gender != 'F' && result.gender != 'M') {
			System.out.print("Character invalid! Please enter 'F' or 'M': ");
			result.gender = sc.next().charAt(0);
		}

		System.out.print("Beers: ");
		result.beer = sc.nextInt();
		while (result.beer < 0) {
			System.out.print("Invalid number! Please enter another number: ");
			result.beer = sc.nextInt();
		}
		
		System.out.print("Sodas: ");
		result.softdrink = sc.nextInt();
		while (result.softdrink < 0) {
			System.out.print("Invalid number! Please enter another number: ");
			result.softdrink = sc.nextInt();
		}
		
		System.out.print("Barbecue: ");
		result.barbecue = sc.nextInt();
		while (result.barbecue < 0) {
			System.out.print("Invalid number! Please enter another number: ");
			result.barbecue = sc.nextInt();
		}
		
		sc.close();
		System.out.println();
		System.out.println("RELATORIO: ");
		System.out.printf(String.format("Consumo = R$ %.2f%n", result.feeding()));
		if (result.cover() == 0) {
			System.out.println("Isento de Couvert");
		} else {
			System.out.printf(String.format("Couvert = R$ %.2f%n" , result.cover()));
		}
		System.out.printf(String.format ("Ingresso = R$ %.2f%n", result.ticket()));
		System.out.println();
		System.out.println(String.format ("Valor a pagar = R$ %.2f%n" , result.total()));

	}
}
