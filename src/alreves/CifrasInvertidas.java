package alreves;

import java.util.Scanner;

public class CifrasInvertidas {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num1 = sc.nextInt();
		
//		int millon;
		int cmillar;
		int dmillar;
		int millar;
		int centena ;
		int decena ; 
		int unidad ;
		int aux ;
//		int centena = 345/100; //3
//		int decena = aux - (centena*10); //34 - 30
//		int unidad = 345 - (aux*10);
//		int aux = 345/10; //34
		
		//1234567 - 1.234567
		//1234567
		
//		if (num1 <= 1000000) {
//			millon = num1/1000000;
//			aux = millon;
//			//caso1 aux = 0
//			System.out.println(aux);
//			cmillar = (num1/100000) - (aux*10);
//			aux = cmillar;
//			//caso2 aux = 1
//			System.out.println("    "+aux);
//			
//			dmillar = (num1/10000) - (aux*10);
//			System.out.println(aux);
//			//caso3 aux = 1
//			aux = dmillar;
//			System.out.print(unidad=1);
//			System.out.print(decena=1);
//			System.out.print(centena=1);
//			System.out.print(millar=1);
//			System.out.print(" " + dmillar);
//			System.out.print(" " + cmillar);
//			System.out.print(" " + millon);
		if (num1 >=100000 && num1 < 1000000) {
			cmillar = num1/100000;
			aux = num1/10000;
			dmillar = aux - (cmillar * 10);
			aux = num1/1000;
			millar = aux - ((dmillar * 10) + (cmillar * 100));
			aux = num1/100;
			centena = aux - ((millar * 10) + (dmillar * 100) + (cmillar * 1000));
			aux = num1/10;
			decena = aux - ((centena * 10) + (millar * 100) + (dmillar * 1000) +(cmillar * 10000));
			unidad = num1 - ((decena * 10) + (centena * 100) + (millar * 1000) + (dmillar * 10000) + (cmillar * 100000));
			
			System.out.print(" " + unidad);
			System.out.print(" " + decena);
			System.out.print(" " + centena);
			System.out.print(" " + millar);
			System.out.print(" " + dmillar);
			System.out.print(" " + cmillar);
		}else if (num1 >= 10000 && num1 < 100000) {
			dmillar = num1/10000;
			aux = num1/1000;
			millar = aux - (dmillar * 10);
			aux = num1/100;
			centena = aux - ((millar * 10) + (dmillar * 100));
			aux = num1/10;
			decena = aux - ((centena * 10) + (millar * 100) + (dmillar * 1000));
			unidad = num1 - ((decena * 10) + (centena * 100) + (millar * 1000) + (dmillar * 10000));
			System.out.print(" " + unidad);
			System.out.print(" " + decena);
			System.out.print(" " + centena);
			System.out.print(" " + millar);
			System.out.print(" " + dmillar);
		}else if (num1 >= 1000 && num1 < 10000) {
			millar = num1/1000;
			aux = num1/100;
			centena = aux - (millar * 10);
			aux = num1/10;
			decena = aux - ((centena * 10) + (millar * 100));
			unidad = num1 - ((decena * 10) + (centena * 100) + (millar * 1000));
			System.out.print(" " + unidad);
			System.out.print(" " + decena);
			System.out.print(" " + centena);
			System.out.print(" " + millar);
		}else if (num1 >= 100 && num1 < 1000) {
			centena = num1/100;
			aux = num1/10;
			decena = aux -(centena * 10);
			unidad = num1 - ((decena * 10) + (centena * 100));
			System.out.print(" " + unidad);
			System.out.print(" " + decena);
			System.out.print(" " + centena);
		}else if (num1 >= 10 && num1 < 100) {
			decena = num1/10;
			unidad = num1 - (decena * 10);
			System.out.print(" " + unidad);
			System.out.print(" " + decena);
		}else{
			System.out.println("el numero no se encuentra entre 2 y 6 cifras");
		}
		
		
		
		
	}

}
