/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Rio Aulia Yahya
 */
public class LoginController implements Initializable {
int kesempatan = 3;
    @FXML
    private JFXTextField edituser;
    
    @FXML
    private JFXPasswordField editpass;
    @FXML
    private JFXButton ok;
    String user="Pelanggan";
    String pass="123";
    String username,password;
       @FXML
    private JFXButton signup;
       

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void oke(ActionEvent event) throws SQLException {
        username=edituser.getText();
        password=editpass.getText();
        if(edituser.getText().isEmpty() && editpass.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Masukan Usename dan Password anda");}
        else if(editpass.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Masukan Password anda");
        edituser.setText("");}
        else if(edituser.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Masukan Usename anda");
        editpass.setText("");}
        else if(username.equalsIgnoreCase(user) && password.equalsIgnoreCase(pass)){
            try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 366, 570);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Dokter Online");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        } }else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "Username atau Password salah \nTersisa " +kesempatan +"kesempatan lagi");
            edituser.setText("");
            editpass.setText("");
        }
        if (kesempatan == 0){
                System.exit(0);
        }
}}
    
    