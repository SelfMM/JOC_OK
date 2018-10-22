import java.util.Scanner;

public class Main_Misiles {
	Scanner entrada_Menu=new Scanner(System.in);
	private int Opcio_Menu=0;
	Partida Game = new Partida();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	private void menu() {
		System.out.println("Elegeix una opció");
		System.out.println("1-JUGAR");
		System.out.println("2-CREAR EQUIPS");
		System.out.println("1-REGLES DEL JOC");
		System.out.println("1-INFORMACIÓ");
		System.out.println("1-APARTAT OBERT");
		System.out.println("1-SORTIR");
		Opcio_Menu=entrada_Menu.nextInt();
switch(Opcio_Menu) {
	case 1: Jugar();
	break;
	case 2: Game.crear_equips(); ;
	break;
	case 3: Jugar();
	break;
	case 4: Jugar();
	break;
	case 5: Jugar();
	break;
	case 6: Jugar();
	break;
		}
	}
	private void Jugar() {
		
	}

}
