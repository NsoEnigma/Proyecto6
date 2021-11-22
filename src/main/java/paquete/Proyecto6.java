package paquete;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class Proyecto6 {
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
	
		System.out.println("Dime el nombre de la primera persona");
		String nombre1 = lector.nextLine();
		System.out.println("Dime su año de nacimiento");
		short anioNacimiento1 = Short.parseShort(lector.nextLine());
		System.out.println("Ahora dime su genero (h/m)");
		char genero1 = lector.nextLine().charAt(0);
		System.out.println("Ahora dime su altura en metros");
		float altura1 = Float.parseFloat(lector.nextLine());
		
		System.out.println("Dime el nombre de la segunda persona");
		String nombre2 = lector.nextLine();
		System.out.println("Dime su año de nacimiento");
		short anioNacimiento2 = Short.parseShort(lector.nextLine());
		System.out.println("Ahora dime su genero (h/m)");
		char genero2 = lector.nextLine().charAt(0);
		System.out.println("Ahora dime su altura en metros");
		float altura2 = Float.parseFloat(lector.nextLine());
		
		System.out.println("Dime el nombre de la tercera persona");
		String nombre3 = lector.nextLine();
		System.out.println("Dime su año de nacimiento");
		short anioNacimiento3 = Short.parseShort(lector.nextLine());
		System.out.println("Ahora dime su genero (h/m)");
		char genero3 = lector.nextLine().charAt(0);
		System.out.println("Ahora dime su altura en metros");
		float altura3 = Float.parseFloat(lector.nextLine());
		
		short centimetro1 = (short)(altura1*100);
		short centimetro2 = (short)(altura2*100);
		short centimetro3 = (short)(altura3*100);
		
		short media = (short)((centimetro1 + centimetro2 + centimetro3)/3);
		
		System.out.println("La media en centimetros de las 3 alturas es: " + media + "cm");
		
		System.out.println("Suponiendo que estamos en el año 2021 las personas han nacido en el siglo: ");
		
		byte edad1 = (byte)(2021-anioNacimiento1);
		byte edad2 = (byte)(2021-anioNacimiento2);
		byte edad3 = (byte)(2021-anioNacimiento3);
		
		System.out.println("La edad de la primera persona es " + edad1 + " años");
		System.out.println("La edad de la segunda persona es " + edad2 + " años");
		System.out.println("La edad de la tercera persona es " + edad3 + " años");
		
		
		System.out.println("La primera persona nacio en el siglo "+(anioNacimiento1/100)+1);
		System.out.println("La segunda persona nacio en el siglo "+(anioNacimiento2/100)+1);
		System.out.println("La tercera persona nacio en el siglo "+(anioNacimiento3/100)+1);
				
		
		byte contHombre = 0;
		byte contMujer = 0;
		
		if (genero1 == 'h') {
			contHombre += 1;
		}else {
			contMujer += 1;
		}
		
		if (genero2 == 'h') {
			contHombre += 1;
		}
		
		if (genero3 == 'h') {
			contHombre += 1;
		}
		
		if (genero1 == 'm') {
		}
		
		if (genero2 == 'm') {
			contMujer += 1;
		}
		
		if (genero3 == 'm') {
			contMujer += 1;
		}
		
		System.out.println("Hay un total de " + contHombre + " hombres.");
		System.out.println("Hay un total de " + contMujer + " mujeres.");
		
		if (nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length()) {
			System.out.println("El nombre mas largo de los 3 es " + nombre1);
		}
		
		if (nombre2.length() > nombre1.length() && nombre2.length() > nombre1.length()) {
			System.out.println("El nombre mas largo de los 3 es " + nombre2);
		}
		
		if (nombre3.length() > nombre1.length() && nombre3.length() > nombre2.length()) {
			System.out.println("El nombre mas largo de los 3 es " + nombre3);
		}
		
		int dias1 = ((2021 - anioNacimiento1) * 365);
		int dias2 = ((2021 - anioNacimiento2) * 365);
		int dias3 = ((2021 - anioNacimiento3) * 365);
		
		
		System.out.println("Suponiendo que estamos en el año 2021 la primera persona ha vivido unos " + dias1 + " días.");
		System.out.println("Suponiendo que estamos en el año 2021 la segunda persona ha vivido unos " + dias2 + " días.");
		System.out.println("Suponiendo que estamos en el año 2021 la tercera persona ha vivido unos " + dias3 + " días.");
		
		System.out.println("Suponiendo que estamos en el año 2021 la primera persona ha vivido unos " + (dias1*24 + " horas.") );
		System.out.println("Suponiendo que estamos en el año 2021 la segunda persona ha vivido unos " + ((2021 - anioNacimiento2) * 365)*24 + " horas." );
		System.out.println("Suponiendo que estamos en el año 2021 la tercera persona ha vivido unos " + ((2021 - anioNacimiento3) * 365)*24 + " horas." );
		
		int promedio = ((dias1 + dias2 + dias3) /3);
		
		System.out.println("Las tres personas juntas han vividos un total de " + promedio + " dias.") ;
		
		
		
		
		
		
		
		
		
		
	}

}
