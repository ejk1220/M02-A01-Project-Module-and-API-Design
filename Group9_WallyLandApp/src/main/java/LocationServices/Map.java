
package LocationServices;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Map {
    
    /**
     * This method is designed to set the basic visual properties of the WallyLand Map 
     */
    
    public JFrame renderMap() {
        // This function and this method should create the map and render it 
        // Addd action listeners in here????
        //This is the initial map thats created with 4 sections the user can chooser from? 
        GridLayout mapLayout = new GridLayout(0,2);
        JFrame mapFrame = new JFrame();  
        mapFrame.setLayout(mapLayout);
        mapFrame.add(new JButton("Section 1"));
        mapFrame.add(new JButton("Section 2"));
        mapFrame.add(new JButton("Section 3"));
        mapFrame.add(new JButton("Section 4"));
        return mapFrame;
    }
    
}
