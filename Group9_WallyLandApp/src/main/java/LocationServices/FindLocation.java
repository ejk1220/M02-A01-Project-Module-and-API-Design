//Does this need a main driver 
//How to instantiate controller/switch use cases from login to location? 
//4 part grid with images and a actionlistenener on the mouse statefulness??? (Hover, click) 
// No need to ask user location simply select section of the map and view information on each relevant location 
//create buttons to change use cases 
        //add action listener event for map grid
        //Find out how to switch from the login cases to the location/statistics case 
        //Should it be a grid with 4 different images with actionlisteners to determine mouse statefulness?? 
        //Once the relevant section of the map is clicked it should show some basic info about the attraction
        //Biggest thing is having a menu that lets you switch use cases 
        //ASK THE PROF!!!!!!!
        //Make this panel that appear to be a navigational panel!!!! 
package LocationServices;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FindLocation {
     
    public static void main(String[] args) {
        //HOW DO I GET THIS TO DISPLAY!!!!!!!!!!!!
        SwingUtilities.invokeLater(() -> { 
            locationCntl cntl = new locationCntl(); // Instantiating the controller is neccesary 
        });
    }
}
