//THis controller should let you toggle view between each map section frame 
//For example, after clicking on park section 1 you need a go back button and that will let you go back to the map 
//The controller should be called to display the map and change between different map sections 


package LocationServices;

import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class locationCntl {
    private final locationUI LocationUI;
    
    
    
    public locationCntl() {
        LocationUI = new locationUI(this);
        
    }
    
    
     public String[] toStringArray() {
        String locations[]={"Space Mountain", "Pirates of the Caribbean", "something", "idk i never went to disney world"};
        return locations;
    }
     
     
     //These JFrame methods are an attempt to create the seperate section frames for each 4 park sections 
     //SHould this be in the locationUI??? 
     //How to get this to change between frames, controller??????? 
     public JFrame parkSec1() {
          JTextField attraction1Field = new JTextField();
        JTextField attraction2Field = new JTextField();
        JTextField attraction3Field = new JTextField();
        JTextField attraction4Field = new JTextField();
         JFrame section1frame = new JFrame();
         section1frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         section1frame.setSize(600, 600);
         
        
        JPanel attractionListPanel = new JPanel(new GridLayout(5,5));
        attractionListPanel.add(new JLabel("Attraction 1"));
        attractionListPanel.add(attraction1Field);
        attractionListPanel.add(new JLabel("Attraction 2"));
        attractionListPanel.add(attraction2Field);
        attractionListPanel.add(new JLabel("Atrraction 3"));
        attractionListPanel.add(attraction3Field);
        attractionListPanel.add(new JLabel("Atrraction 4"));
        attractionListPanel.add(attraction4Field);
        section1frame.add(attractionListPanel);
        
        attraction1Field.setText("Attraction 1 Info");
        attraction2Field.setText("Attraction 2 Info");
        attraction3Field.setText("Attraction 3 Info");
        attraction4Field.setText("Attraction 4 Info");
          
         return section1frame;
     }
     
     public JFrame parkSec2() {
         JFrame section2frame = new JFrame();
         JTextField attraction1Field = new JTextField();
        JTextField attraction2Field = new JTextField();
        JTextField attraction3Field = new JTextField();
        JTextField attraction4Field = new JTextField();
        section2frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        section2frame.setSize(600,600);
        
        JPanel attractionListPanel = new JPanel(new GridLayout(5,5));
        attractionListPanel.add(new JLabel("Attraction 1"));
        attractionListPanel.add(attraction1Field);
        attractionListPanel.add(new JLabel("Attraction 2"));
        attractionListPanel.add(attraction2Field);
        attractionListPanel.add(new JLabel("Atrraction 3"));
        attractionListPanel.add(attraction3Field);
        attractionListPanel.add(new JLabel("Atrraction 4"));
        attractionListPanel.add(attraction4Field);
        section2frame.add(attractionListPanel);
        
        attraction1Field.setText("Attraction 1 Info");
        attraction2Field.setText("Attraction 2 Info");
        attraction3Field.setText("Attraction 3 Info");
        attraction4Field.setText("Attraction 4 Info");
        
        section2frame.setVisible(true);
        
         return section2frame;
     }
     
     public JFrame parkSec3() {
         JFrame section3frame = new JFrame();
         JTextField attraction1Field = new JTextField();
        JTextField attraction2Field = new JTextField();
        JTextField attraction3Field = new JTextField();
        JTextField attraction4Field = new JTextField();
         section3frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        section3frame.setSize(600,600);
        
        JPanel attractionListPanel = new JPanel(new GridLayout(5,5));
        attractionListPanel.add(new JLabel("Attraction 1"));
        attractionListPanel.add(attraction1Field);
        attractionListPanel.add(new JLabel("Attraction 2"));
        attractionListPanel.add(attraction2Field);
        attractionListPanel.add(new JLabel("Atrraction 3"));
        attractionListPanel.add(attraction3Field);
        attractionListPanel.add(new JLabel("Atrraction 4"));
        attractionListPanel.add(attraction4Field);
        section3frame.add(attractionListPanel);
        
        attraction1Field.setText("Attraction 1 Info");
        attraction2Field.setText("Attraction 2 Info");
        attraction3Field.setText("Attraction 3 Info");
        attraction4Field.setText("Attraction 4 Info");
        
         return section3frame;
     }
     
     public JFrame parkSec4() {
         JFrame section4frame = new JFrame();
         JTextField attraction1Field = new JTextField();
        JTextField attraction2Field = new JTextField();
        JTextField attraction3Field = new JTextField();
        JTextField attraction4Field = new JTextField();
        
        JPanel attractionListPanel = new JPanel(new GridLayout(5,5));
        attractionListPanel.add(new JLabel("Attraction 1"));
        attractionListPanel.add(attraction1Field);
        attractionListPanel.add(new JLabel("Attraction 2"));
        attractionListPanel.add(attraction2Field);
        attractionListPanel.add(new JLabel("Atrraction 3"));
        attractionListPanel.add(attraction3Field);
        attractionListPanel.add(new JLabel("Atrraction 4"));
        attractionListPanel.add(attraction4Field);
        section4frame.add(attractionListPanel);
        
        attraction1Field.setText("Attraction 1 Info");
        attraction2Field.setText("Attraction 2 Info");
        attraction3Field.setText("Attraction 3 Info");
        attraction4Field.setText("Attraction 4 Info");
        
         return section4frame;
     }
}
