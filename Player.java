/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import java.util.ArrayList;

/**
 *Η κλάση Player δημιουργεί έναν παίκτη με τα πλακίδια που έχει στο χέρι και υπολογίζει το σκορ του.
 * 
 * @author Αθανάσιος Μπατσιούλας ΑΕΜ : 2776
 * @author Δήμητρα Παρανού ΑΕΜ : 2789
 *  
 * 
 */
public class Player {

    private ArrayList<Tile> hand;
    private int score;
    AllTiles tiles  = new AllTiles();

    public Player() {
        score = 0;
        hand = new ArrayList<>();
    }

   
    //Βρίσκει το μεγάλύτερο διπλό πλακίδο που έχει ο παίκτης στο χέρι του.
    public int maxDouble() {
        int maxdouble = -1;
        for (Tile t : hand) {
            if (t.isDouble() && t.getDouble() > maxdouble) {  //Ελέγχει αν το πλακίδιο είναι διπλό και ο αριθμός του είναι μεγαλύτερος απο το προηγούμενο μεγαλύτερο.
 
                    maxdouble = t.getDouble();
                
            }
        }
         return maxdouble;
    }
    
   
    
    //Δημιουργεί το χέρι του παίκτη, δηλαδή τα πλακίδια που έχει διαθέσιμα να παίξει. 
    public void handPlayer(int x){
        hand= tiles.getRandomTiles(x);
        
    }
    
    //Υπολογίζει το άθροισμα των πλακιδίων που έχει ο παίκτης στο χέρι του.
    public int sumTiles(){
        int sum = 0;
        for(Tile t : hand)
            sum =+ t.getSum();
        return sum;
    }
    
    //To πλακίδιο που έχει πάιξει ο παίκτης, αφαιρείται από το χέρι του.
    public void removeTile(int i){
        hand.remove(i);
    }
    
    //Πρόσβαση στα πλακίδια που έχει ο παίκτης, ανά πάσα στιγμή.
    public ArrayList<Tile> getHand(){
        
        return hand;
    }
}

