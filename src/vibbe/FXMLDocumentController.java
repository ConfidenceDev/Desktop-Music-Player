/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vibbe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Confidence
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView play_tab, playlist_tab, settings_tab, menu_tab;
    
     @FXML
    private AnchorPane play_music, playlist_music, settings_music, menu_music;
    
     @FXML
    private Button minimize_btn;
       
    @FXML
    private void handleButtonAction(MouseEvent event) {
        
        if(event.getTarget() == play_tab){
            
            play_music.setVisible(true);
            playlist_music.setVisible(false);
            settings_music.setVisible(false);
            menu_music.setVisible(false);
            
        }else if(event.getTarget() == playlist_tab){
            play_music.setVisible(false);
            playlist_music.setVisible(true);
            settings_music.setVisible(false);
            menu_music.setVisible(false);
            
        }else if(event.getTarget() == settings_tab){
            
            play_music.setVisible(false);
            playlist_music.setVisible(false);
            settings_music.setVisible(true);
            menu_music.setVisible(false);
            
        }else if(event.getTarget() == menu_tab){
            
            play_music.setVisible(false);
            playlist_music.setVisible(false);
            settings_music.setVisible(false);
            menu_music.setVisible(true);
            
        }
        
    }
    
      @FXML
    private void handleClickAction(MouseEvent event) {
        
          if(event.getTarget() == minimize_btn){
              
            play_music.setVisible(false);
            playlist_music.setVisible(false);
            settings_music.setVisible(false);
            menu_music.setVisible(false);
            
          }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
