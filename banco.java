import java.util.Scanner;

public class Entrega1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nombre;
		String fecha;
		String cuenta;
		String log = "";
		String gastos = "";
		int cantidad;
		int opcion2;
		double ingresos;
		double retirar;
		int opcion;
		double saldo = 0;
		// Este boolean le asociamos para salir del programa en el que si damos una respuesta contraria en algunos de los casos se termina el programa.
		boolean seguir = true;
		int opcion3;

		System.out.println("Introduzca su nombre: ");
		nombre = input.nextLine();

		System.out.println("Introduzca su fecha de nacimiento: ");
		fecha = input.nextLine();

		System.out.println("Introduzca su número de cuenta: ");
		cuenta = input.nextLine();

		while (seguir == true) {
			// Esta syso es diferente y sireve para elegir entre varias opciones a la hora que asocias el switch con el syso a través de la variable opcion.
			System.out.println("Seleccione una opción: /n" + "1. Datos de la cuenta 1/n" + "2. Ingresar 2/n"
					+ "3. Retirar 3/n" + "4. Ver la equivalencia del saldo en otras monedas 4/n"
					+ "5. Ver la cantidad de ingresos realizados 5/n" + "6. Ver la cantidad de gastos realizados 6/n"
					+ "7. Salir 7/n" + ">>");
			opcion = input.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Nombre: " + nombre);

				System.out.println("Fecha: " + fecha);

				System.out.println("Número de cuenta: " + cuenta);

				System.out.println("Saldo actual: " + saldo);
				break;
			case 2:
				System.out.println("Indique la cantidad que desea ingresar: ");
				ingresos = input.nextDouble();

				saldo += ingresos;

				System.out.println("EL dinero actual es de: " + saldo + " �.");
				// Se asocia de la misma manera que gastos pero se pone entre comillas un mas ya que son ingresos que se añaden a tu cuenta.
				log += "+" + ingresos ;

				break;
			case 3:
				System.out.println("Que cantidad desea retirar: ");
				retirar = input.nextDouble();
				if (retirar > saldo) {
					System.out.println(
							"Esta segur@ de que quiere realizar la retirada: /n" + "1. Si 1/n" + "2. No 2/n" + ">>");
					opcion2 = input.nextInt();
					switch (opcion2) {
					case 1:
						saldo -= retirar;
						gastos  +=  "-"  + retirar ;
						System.out.println("Retirada efectuada: " + saldo + " �." );
						break;
					case 2:
						System.out.println("");
					}
				} else {
					// Guardamos la variable saldo en la variable retirara a la vez que se resta.
					// gastos lo asociamos con la variable retirar y ponemos el "+=" para que se vallan añadiendo los datos consecutivamente.
					gastos  +=  "-"  + retirar ;
					saldo -= retirar;
					System.out.println("Dinero en la cuenta: " + saldo + " �." );
				}
				
				System.out.println("Su dinero actual en la cuenta es de: " + saldo + " �.");
				// gastos lo asociamos con la variable retirar y ponemos el "+=" para que se vallan añadiendo los datos consecutivamente.
				
				break;
			case 4:
				System.out.println("Con que cantidad quiere realizar la conversión: ");
				cantidad = input.nextInt();

				System.out.println(
						"Elige a que quiere pasar los euros: /n" + "1. Dólares 2/n " + "2. Libras 3/n" + "3. Yuanes" + ">>");
				opcion3 = input.nextInt();
				switch(opcion3) {
				case 1:
					System.out.println("La conversión a dólares sería: " + (cantidad * 0.95));
					break;
				case 2:
					System.out.println("La conversión a libras: " + (cantidad * 1.15));
					break;
				case 3:
					System.out.println("La conversión a yuanes: " + (cantidad * 0.13));
					break;
				}
			case 5:
				System.out.println("Sus ingresos realizados son de " + log + " �");
				// El break es para que corte el programa en ese caso y vuelva a darte a elegir entre las primeras opciones del primer syso.
				break;
			case 6:
				System.out.println(" Sus gastos realizados son de " + gastos + " �");
				break;
			case 7:
				System.out.println("Fin del programa. ");
				// Añadimos este codigo ya que antes hemos asociado la variable seguir a true, si en este caso le ponemos que es igual a false acaba el programa.
				seguir = false;
				break;
				default:
					System.out.println("ERROR: El número introducido no es válido.");
			}

		}

	}

	}

