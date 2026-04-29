import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class BarChart extends Application {
    @Override
    public void start(Stage stage) {
        HBox box = new HBox(20);
        box.setAlignment(Pos.BOTTOM_CENTER);
        
        box.getChildren().add(makeBar("Projects 20%", 20, Color.RED));
        box.getChildren().add(makeBar("Quizzes 10%", 10, Color.BLUE));
        box.getChildren().add(makeBar("Midterm 30%", 30, Color.GREEN));
        box.getChildren().add(makeBar("Final 40%", 40, Color.ORANGE));
        
        stage.setScene(new Scene(box, 400, 300));
        stage.show();
    }

    private VBox makeBar(String label, double pct, Color c) {
        VBox v = new VBox(5);
        v.setAlignment(Pos.BOTTOM_CENTER);
        Rectangle r = new Rectangle(50, pct * 4);
        r.setFill(c);
        v.getChildren().addAll(r, new Label(label));
        return v;
    }
    
    public static void main(String[] args) { launch(args); }
}
