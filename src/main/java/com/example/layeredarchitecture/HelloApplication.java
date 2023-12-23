package com.example.layeredarchitecture;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/layeredarchitecture/main-form.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("IJSE");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
/*
 Image img = new Image("com/example/layeredarchitecture/assests/images/Company-Logo.png");
 Image img = new Image("file:/C:/path/to/your/project/src/com/example/layeredarchitecture/assets/images/Company-Logo.png");
 stage.getIcons().add(img);
*/
    }

    public static void main(String[] args) {
        launch();
    }
}