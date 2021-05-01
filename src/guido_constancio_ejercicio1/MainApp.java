package guido_constancio_ejercicio1;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int cantidad_uno;
		int cantidad_dos;
		double subtotal_uno;
		double subtotal_dos;
		double total;
		double total_con_iva;
		double precio_unitario_uno;
		double precio_unitario_dos;
		double iva;
		String descripcion_uno;	
		String descripcion_dos;	
		String razon_social;
		String domicilio;
		
		System.out.println("Ingrese nombre y apellido del comprador: ");
		razon_social = scan.nextLine();
		
		System.out.println("Ingrese domicilio: ");
		domicilio = scan.nextLine();
		
		System.out.println("Ingrese descripcion del producto: ");
		descripcion_uno = scan.next();
		
		System.out.println("Ingrese cantidad deseada del producto: ");
		cantidad_uno = scan.nextInt();
		
		System.out.println("Ingrese el valor unitario: ");
		precio_unitario_uno = scan.nextDouble();

		System.out.println("Ingrese descripcion del producto: ");
		descripcion_dos = scan.next();
		
		System.out.println("Ingrese cantidad deseada del producto: ");
		cantidad_dos = scan.nextInt();
		
		System.out.println("Ingrese el valor unitario: ");
		precio_unitario_dos = scan.nextDouble();
		
		subtotal_uno = cantidad_uno * precio_unitario_uno;
		subtotal_dos = cantidad_dos * precio_unitario_dos;
		iva = (subtotal_uno + subtotal_dos) * 0.21;
		total = subtotal_uno + subtotal_dos;
		total_con_iva= (total + iva);
		System.out.println("*************************************************************************************\n");
		System.out.println("Fecha  24/4/1879\n");
		System.out.println("*************************************************************************************\n");
		System.out.println("Nombre: " + razon_social );
		System.out.println("Domicilio: " + domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("Cantidad |\t Descripción\t |\t P.unit.\t |\t P.total\t|");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("  " + cantidad_uno+"      |\t" + descripcion_uno + " \t|\t  "+precio_unitario_uno+"\t\t|\t " + subtotal_uno );
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("  " + cantidad_dos+"      |\t" + descripcion_dos + " \t|\t  "+precio_unitario_dos+"\t\t|\t  " + subtotal_dos);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("IVA: " + iva);
		System.out.println("Subtotal (sin IVA): " + total);
		System.out.println("Total:" + total_con_iva);
		System.out.println("*************************************************************************************");
	}

}
