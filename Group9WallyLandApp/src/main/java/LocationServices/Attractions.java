
package LocationServices;

import java.util.ArrayList;

public class Attractions {
    
    /**
     * @getAttractions This method returns a String taken from an ArrayList of Strings and returns the desired attraction name 
     * @param attractionList: ArrayList of Strings that holds the names of nearby park attractions  
     * @return Returns a string taken from the ArrayList to display the attraction name 
     */
    public String getAttractions(ArrayList<String> attractionList) {
        
        attractionList.add("Needs");
        attractionList.add("to");
        attractionList.add("be");
        attractionList.add("implemented");
        for (int i=0; i > attractionList.size(); i++) {
            String attraction = attractionList.get(i);
        }
        
        return "Placeholder since I forget java";
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
