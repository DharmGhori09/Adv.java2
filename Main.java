import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click me"); // Create a button

        // Implement Exercise 3: Functional Interfaces
        ButtonClickHandler clickHandler = () -> System.out.println("Button clicked!");

        // Set the click handler using lambda expression
        button.setOnAction(event -> clickHandler.handleClick());

        StackPane root = new StackPane();
        root.getChildren().add(button); // Add the button to the root node

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Application"); // Set the title of the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// Functional Interface for Exercise 3
@FunctionalInterface
interface ButtonClickHandler {
    void handleClick();
}
