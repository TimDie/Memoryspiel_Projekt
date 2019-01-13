package gameplay;

import java.util.ArrayList;

import javafx.scene.control.Label;
import view.Karte;

public class Engine {
	static int check1;
	static int check2;
	static int alarm=0;
	static int countWhile=0;
	boolean pushed;
	static int score =0;
	static int highScore=0;
	static Label scoreNumber;
	
	
	
//	public static ArrayList<Karte> wahrheit (Karte kl1, Karte kl2, Karte kl3, Karte kl4, Karte kl5, Karte kl6,Karte kl7, Karte kl8 ) {
//		Karte card1 = view.View.cards.get(1); 
//		ArrayList<Karte> klassen = new ArrayList<Karte>();
//
//		klassen.add(kl1);
//		klassen.add(kl2);
//		klassen.add(kl3);
//		klassen.add(kl4);
//		klassen.add(kl5);
//		klassen.add(kl6);
//		klassen.add(kl7);
//		klassen.add(kl8);
//		alarm =0;
//		check1=0;
//		check2=0;
//		for (int n=0; n<=7; n++) {
//
//			if ((klassen.get(n).umdrehen)==true) {
//				alarm=alarm+1;
//				System.out.println("Schleife läuft neuer Wert" + alarm);
//				//alarm gesetzt, dass zwei Karten aufgedeckt wurden
//			}
//		}
//
//		if (alarm>=2) {
//
//
//			for(countWhile=0; countWhile<=7; countWhile++ ) {
//				if((klassen.get(countWhile).umdrehen)==true) {
//					check1=(klassen.get(countWhile).eigenID+klassen.get(countWhile).fremdID);
//					break;
//				}
//			}
//
//			System.out.println("Check 1 "+check1);
//		}
//		//				//				Do While brauche ich deshalb weil die erste Variable die die Abbruchbedingung erfüllt, die ist, deren Wert ich will 
//		if (alarm>=2) {
//			for(int c=0;c<=7;c++) {
//
//				if (klassen.get(c).umdrehen==true){
//					check2=check2+(klassen.get(c).eigenID+klassen.get(c).fremdID);
//					System.out.println(klassen.get(c).umdrehen);
//					System.out.println("Check2 intern"+ check2);
//					//wenn zwei Karten aufgedeckt sind, gilt folgendes: Wenn die Schleife durchlaufen ist, hat sich die Checksum zweimal um den gleichen Wert erhöht
//				}
//			}
//
//			System.out.println("Check2 "+ check2);
//			System.out.println("Check1 "+ check1);
//
//			if((check2)==(check1*2)&&(check1!=0)) {
//
//				score=+50;
//				highScore=highScore+score;
//				System.out.println("                              "+ score);
//				//							check1=0;
//				check2=0;
//				for(int j =0; j<=7;j++) {
//					if (klassen.get(j).umdrehen==true) {
//						klassen.get(j).trueMarker=true;
//						klassen.get(j).umdrehen=false;
//					}
//				}		
//				//Wenn beide Karten aufgedeckt sind
//
//			}
//			else if((check2)!=(check1*2)&&(check1!=0)) {
//
//				score=-3;
//				highScore=highScore+score;
//				System.out.println("                              "+ score);
//				//							check1=0;
//				check2=0;
//				for(int j =0; j<=7;j++) {
//					if (klassen.get(j).umdrehen==true) {
//						klassen.get(j).umdrehen=false;
//
//						view.View.cards.get(j).knopf.setGraphic(null);
//					}
//				}		
//				//Wenn beide Karten aufgedeckt sind
//
//			}
//
//
//			//			else {
//			//				for(int m=0;m<=7;m++) {
//			//					if(klassen.get(m).trueMarker!=true) {
//			//						score=-5;
//			//						alarm =0;
//			//						check1=0;
//			//						check2=0;
//			//						Progrann.cards.get(m).umdrehen=false; 
//			//						
//			//						cards.get(m).knopf.setGraphic(null);
//			//					}
//			//				}
//			//			}
//		}
//
//
//
//		return klassen;
//
//	}	
//	
}
