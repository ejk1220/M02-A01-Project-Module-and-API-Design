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

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FindLocation {
    
    /**
     * This method gets the user's location in longitude and latitude coordinates 
     * Then translates those coordinates into a string called Location 
     * The method returns the String Location telling the user their current Location
     * @param Longitude: stores user Longitude in type double 
     * @param latitude: stores user Latitude in type double 
     * @return returns string location, translated from longitude and latitude coordinates
     */
   
     
    /**
     * This method uses a JFrame to display user location and nearby attractions on a map
     * @param attractionNames: Nearby Attraction Names displayed on map  
     * @param currentLocation: String that tells the user their current location ex: "you are here"
     * @return Returns JFrame mapFrame to display user location on Map 
     */
    public JFrame showLocation(String attractionNames, String currentLocation){
        JFrame mapFrame = new JFrame();  
        return mapFrame;
    }
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { 
            locationCntl cntl = new locationCntl(); // Instantiating the controller is neccesary 
        });
    }
}
