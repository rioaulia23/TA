/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
 *
 * @author Rio Aulia Yahya
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXTextField editnama;
    @FXML
    private JFXTextField editumur;
    @FXML
    private CheckBox ck1;
    @FXML
    private CheckBox ck2;
    @FXML
    private CheckBox ck5;
    @FXML
    private CheckBox ck6;
    @FXML
    private CheckBox ck3;
    @FXML
    private CheckBox ck7;
    @FXML
    private CheckBox ck4;  
    @FXML
    private CheckBox ck8;
    @FXML
    private Button proses;
    @FXML
    private Button hapus;
     @FXML
    private JFXTextArea ta1;
      @FXML
    private CheckBox ck9;
         @FXML
    private CheckBox ck10;
     

     
     
     

    @FXML
    void hapus(ActionEvent event) {
        ta1.setText("");
        editnama.setText("");
        editumur.setText("");
        ck1.setSelected(false);
        ck2.setSelected(false);
        ck3.setSelected(false);
        ck4.setSelected(false);
        ck5.setSelected(false);
        ck6.setSelected(false);
        ck7.setSelected(false);
        ck8.setSelected(false);
        ck9.setSelected(false);
        ck10.setSelected(false);
        
    }
    
    
    
   

    @FXML
    void proses(ActionEvent event)
            throws IOException {
        
        String nama= editnama.getText();
        String umur= editumur.getText();
        if(ck1.isSelected() == true || ck2.isSelected()== true || ck3.isSelected()== true || ck4.isSelected()== true ||ck5.isSelected()== true || ck6.isSelected()== true || ck7.isSelected()== true || ck8.isSelected()== true || ck9.isSelected()== true ||  ck10.isSelected()==true &&  !editnama.getText().isEmpty() && !editumur.getText().isEmpty() ){
        } else{
         JOptionPane.showMessageDialog(null, "Harap di isi dengan lengkap");}
        String Nama = editnama.getText();
         int Umur = Integer.parseInt(editumur.getText());{}
        int penyakit = 0;
        if (ck1.isSelected() == true && ck2.isSelected() == true && ck3.isSelected() == true && ck4.isSelected() == false && ck5.isSelected() == false && ck6.isSelected()== true && ck7.isSelected()==true && ck8.isSelected()==true && ck9.isSelected()==false && ck10.isSelected()==false){
        ta1.setText("Nama :"+Nama+"\nUmur :"+Umur+"\nPenyakit:Tifus\nSaran:Istirahat cukup dan minum banyak air putih"); penyakit = 1;}
        else  if (ck1.isSelected() == false && ck2.isSelected() == false && ck3.isSelected() == false && ck4.isSelected() == false && ck5.isSelected() == true && ck6.isSelected()== true && ck7.isSelected()==true && ck8.isSelected()==true && ck9.isSelected()==true && ck10.isSelected()==false){
        ta1.setText("Nama :"+Nama+"\nUmur :"+Umur+"\nPenyakit:Muntaber\nSaran:Minumlah air kelapa muda"); penyakit = 2;}
        else  if (ck1.isSelected() == true && ck2.isSelected() == true && ck3.isSelected() == false && ck4.isSelected() == true && ck5.isSelected() == false && ck6.isSelected()== false && ck7.isSelected()==false && ck8.isSelected()==false && ck9.isSelected()==false && ck10.isSelected()==false){
        ta1.setText("Nama :"+Nama+"\nUmur :"+Umur+"\nTBC.\nSaran:Menghabiskan antibiotik dari dokter.Obat antibiotik biasanya digunakan adalah isoniazid, rifampicin, pyrazinamide dan ethambutol."); penyakit = 3;}
        else  if (ck1.isSelected() == true && ck2.isSelected() == false && ck3.isSelected() == false && ck4.isSelected() == false && ck5.isSelected() == false && ck6.isSelected()== false && ck7.isSelected()==false && ck8.isSelected()==false && ck9.isSelected()==false && ck10.isSelected()==false){
        ta1.setText("Nama :"+Nama+"\nUmur :"+Umur+"\nPenyakit:Anda hanya pusing biasa.\nSaran:Istirahat yang cukup dan banyak minum air mineral"); penyakit = 4;}
         else  if (ck1.isSelected() == true && ck2.isSelected() == true && ck3.isSelected() == false && ck4.isSelected() == false && ck5.isSelected() == false && ck6.isSelected()== false && ck7.isSelected()==false && ck8.isSelected()==false && ck9.isSelected()==false && ck10.isSelected()==true){
        ta1.setText("Nama :"+Nama+"\nUmur :"+Umur+"\nPenyakit:Anda terkena flu.\nSaran: cukup istirahat, mengonsumsi buah-buahan dan sayur-sayuran, serta menjaga suhu tubuh tetap normal."); penyakit = 5;}
         else  if (ck1.isSelected() == true && ck2.isSelected() == true && ck3.isSelected() == false && ck4.isSelected() == false && ck5.isSelected() == false && ck6.isSelected()== false && ck7.isSelected()==false && ck8.isSelected()==false && ck9.isSelected()==false && ck10.isSelected()==false){
        ta1.setText("Nama :"+Nama+"\nUmur :"+Umur+"\nPenyakit:Anda terkena demam.\nSaran:Minumlah obat penurun panas seperti parasetamol, aspirin dan antibiotik"); penyakit = 6;}
        else  if (ck1.isSelected() == false && ck2.isSelected() == false && ck3.isSelected() == false && ck4.isSelected() == false && ck5.isSelected() == true && ck6.isSelected()== false && ck7.isSelected()==false && ck8.isSelected()==false && ck9.isSelected()==false && ck10.isSelected()==false){
        ta1.setText("Nama :"+Nama+"\nUmur :"+Umur+"\nPenyakit:Anda hanya muntah muntah biasa.\nSaran:Minumlah obat dari dokter atau minumlah air kelapa"); penyakit = 7;}
        else  if (ck1.isSelected() == false && ck2.isSelected() == false && ck3.isSelected() == false && ck4.isSelected() == true && ck5.isSelected() == false && ck6.isSelected()== false && ck7.isSelected()==false && ck8.isSelected()==false && ck9.isSelected()==false && ck10.isSelected()==false){
        ta1.setText("Nama :"+Nama+"\nUmur :"+Umur+"\nPenyakit:Anda mengalami gangguan bronkitis\nSaran:Terapi radiasi atau kemoterapi jika batuk darah disebabkan oleh kanker paru-paru."); penyakit = 8;}
        else if (penyakit == 0){
         JOptionPane.showMessageDialog(null, "Keluhan tidak terdeteksi");}
        else{
        editnama.setText("");
        editumur.setText("");
        ck1.setSelected(false);
        ck2.setSelected(false);
        ck3.setSelected(false);
        ck4.setSelected(false);
        ck5.setSelected(false); 
        ck6.setSelected(false); 
        ck7.setSelected(false); 
        ck8.setSelected(false);
        ck9.setSelected(false);
        ck10.setSelected(false);
         
         
        }
        
        }
    }



