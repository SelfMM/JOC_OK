import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partida {
	private int num_jugadors;
	private List<Jugador> llista_jugadors = new ArrayList<>();
	private Scanner Jugada = new Scanner(System.in);
	Scanner jugador=new Scanner(System.in);
	private int Tipus_Jugada;
	private int Num_Jugador;
	private int Num_Missil;
	private int Num_escut;
	private int Num_ronda;
		public void crear_equips() {
			System.out.println("Quants jugadors vols crear");
			num_jugadors=jugador.nextInt();
			String Nom="";
			for(int i=1;i<=num_jugadors;i++) {
				
			System.out.println("Introdueix el nom de l'equip");
			Nom=jugador.nextLine();
			Jugador player=new Jugador();
			player.nom=Nom;
			player.n_jugador=i;
			llista_jugadors.add(player);
			}
		}
		private void fi_turno(){
			
		}
		private void jugada(){
			mostrar_jugadors();
			for(Jugador player: llista_jugadors) {			
				int Vataque=5;
				int Vdefensa=5;
				while (player.stamina>0){
					System.out.println("Fase de ataque:");
					while(Vataque!=0) {
						
					}
					System.out.println("Fase de defensa:");
					while(Vdefensa!=0) {
						
					}

				}
			}
		}
		private void mostrar_jugadors() {
			System.out.println("RONDA: "+Num_ronda);
			for(Jugador player:llista_jugadors) {
				System.out.println(player.n_jugador+" - "+player.nom+": "+player.vida);
			}
		}
		private void results_ronda() {
			
		}
}
