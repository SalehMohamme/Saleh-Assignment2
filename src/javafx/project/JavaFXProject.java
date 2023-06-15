/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.project;

import Model.Account;
import View.ViewManager;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Yahya
 */
public class JavaFXProject extends Application {

    @Override
    public void start(Stage primaryStage) throws SQLException {
        
      //  ViewManager.openRegisterPage();
        Account a = new Account(1,1,"ali","$", 100.0 , "12/2/2023");
        a.save();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
