import java.util.Scanner;
public class Menu{
	public void menu(){
		int opc;
		float monto;
		Scanner lee=new Scanner(System.in);
		Banco obj2=new Banco(200);
		do{
			System.out.println("1.- Deposito");
			System.out.println("2.- Retiro");
			System.out.println("3.- Saldo");
			System.out.println("4.- Salir");
			System.out.println("\n\nIngrese la opcion: ");
			opc=lee.nextInt();
			
			if(opc==1){
				System.out.println("\n\nIngrese el monto: ");
				monto=lee.nextFloat();
				obj2.calcular(monto,opc);
			}
			if(opc==2){
				System.out.println("\n\nIngrese el monto: ");
				monto=lee.nextFloat();
				obj2.calcular(monto,opc);
			}
			if(opc==3){
				System.out.println("El saldo a la fecha es: "
				+ obj2.getSaldo());
			}
		}while(opc!=4);
	}
}