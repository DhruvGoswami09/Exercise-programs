import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationForm extends Application {
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        TextField tRoll = new TextField();
        TextField tName = new TextField();
        TextField tAge = new TextField();
        TextField tEmail = new TextField();
        Button btn = new Button("Submit");
        
        grid.add(new Label("Roll No:"), 0, 0); grid.add(tRoll, 1, 0);
        grid.add(new Label("Name:"), 0, 1); grid.add(tName, 1, 1);
        grid.add(new Label("Age:"), 0, 2); grid.add(tAge, 1, 2);
        grid.add(new Label("Email:"), 0, 3); grid.add(tEmail, 1, 3);
        grid.add(btn, 1, 4);

        btn.setOnAction(e -> {
            try {
                Integer.parseInt(tRoll.getText());
                Integer.parseInt(tAge.getText());
                if (!tEmail.getText().contains("@") || !tEmail.getText().contains(".")) throw new Exception();
                Alert a = new Alert(Alert.AlertType.INFORMATION, "Data Submitted!");
                a.show();
            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, "Validation Failed!").show();
            }
        });

        stage.setScene(new Scene(grid, 300, 200));
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
