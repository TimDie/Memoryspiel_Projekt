package view;

import java.util.ArrayList;
import view.Karte;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View {
	static ArrayList<Button> buttons = new ArrayList<Button>();
	static ArrayList<Image> picList = new ArrayList<Image>();
	ArrayList<HBox> horizont = new ArrayList<HBox>();
	ArrayList<VBox> vertical = new ArrayList<VBox>();
	static VBox root= new VBox();
	public static HBox buttonBox = new HBox();
	static HBox scoreBox = new HBox();
	static HBox commandBox = new HBox();
	public static ArrayList<HBox> buttonRows = new ArrayList <HBox>();
	public static ArrayList<Button> obsButtons = new ArrayList<Button>();
	public static ArrayList<Karte> cards = new ArrayList<Karte>();
	
	public static Scene initScene() {
		
		for (int i =0; i<=7; i++) {
			buttons.add(new Button());
		}
		for (int i =0; i<=7; i++) {
			buttons.get(i).setPrefSize(60,40);
			
		}
		int[] eigenID = new int[] {1,2,3,4,5,6,7,8};
		int[] fremdID = new int[] {2,1,4,3,6,5,8,7};

		picList.add(new Image(View.class.getResourceAsStream("1.png")));
		picList.add(new Image(View.class.getResourceAsStream("2.png")));
		picList.add(new Image(View.class.getResourceAsStream("3.png")));
		picList.add(new Image(View.class.getResourceAsStream("4.png")));
		picList.add(new Image(View.class.getResourceAsStream("5.png")));
		picList.add(new Image(View.class.getResourceAsStream("6.png")));
		picList.add(new Image(View.class.getResourceAsStream("7.png")));
		picList.add(new Image(View.class.getResourceAsStream("8.png")));
		
		for (int i =0; i<=7; i++) {
			cards.add(new Karte(eigenID[i], fremdID[i], buttons.get(i), picList.get(i)));
			
		}

	
//		
		root.getChildren().add(scoreBox);
		root.getChildren().add(commandBox);
		root.getChildren().add(buttonBox);
		Scene scene = new Scene(root, 400,300);
		buttonBox.setSpacing(10);

		
		
//		cards.get(0).knopf.addEventHandler(ActionEvent.ACTION, controller.Handlers.memoryButOnAction);

		for(int n = 0; n<=1; n++) {
view.View.cards.get(n);
			//			view.View.cards.get(n).knopf.setOnAction(view.View.cards.get(n));
			view.View.buttonBox.getChildren().add(Karte.knopf);
		}
		return scene;
	}
}
