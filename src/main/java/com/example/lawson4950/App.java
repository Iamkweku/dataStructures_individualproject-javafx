//Pachomius Kweku Lawson ~ index - 10904950
package com.example.lawson4950;

import com.example.lawson4950.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage){
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
