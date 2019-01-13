package view;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Karte  {

	public static  int eigenID;
	public static int fremdID;
	public static Button knopf;
	public static Image bild;
	public static boolean umdrehen = false;
	public static boolean trueMarker = false;



	public Karte(int eigenID, int fremdID, Button knopf, Image bild) {
		super();
		this.eigenID = eigenID;
		this.fremdID = fremdID;
		this.knopf = knopf;
		this.bild = bild;

	}



//	@Override
//	public void handle(ActionEvent arg0) {
//		// TODO Auto-generated method stub
//
//	}




}
