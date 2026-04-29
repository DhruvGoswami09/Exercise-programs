import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class FXTexts extends Application {
    @Override
    public void start(Stage stage) {
        VBox box = new VBox(10);
        box.setAlignment(Pos.CENTER);
        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
            Text t = new Text("Text " + i);
            t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            t.setFill(Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble(), 0.3 + 0.7 * r.nextDouble()));
            box.getChildren().add(t);
        }
        stage.setScene(new Scene(box, 300, 300));
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
