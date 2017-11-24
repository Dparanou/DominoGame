# DominoGame
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import java.util.ArrayList;

/**
 *Η κλάση Game δημιοργέι ένα παιχνίδι με όλα τα πλακίδια και τους παίκτες
 * 
 * @author Αθανάσιος Μπατσιούλας ΑΕΜ : 2776
 * @author Δήμητρα Παρανού ΑΕΜ : 2789
 */
public class Game {
    AllTiles tiles = new AllTiles();
    Player human = new Player();
    Player bot = new Player();
    ArrayList<Tile> x1 =  human.getHand();
    ArrayList<Tile> x2 =  bot.getHand();
    
    
    
    public Game(int x){  // Για παιχνίδια με πολλούς παίκτες 
        human.handPlayer(x);
        bot.handPlayer(x);
        
    }   
    
    public Game(){} // Για το παιχνίδι Solo 1 που ο παίχτης δεν χρείαζεται να πάρει πλακία στο χέρι.
    
    
    
    //Επιστρέφει μια τιμή αληθή ή ψευδή για το άν ο παίκτης ή το μποτ έχει το μεγαλύτερο διπλό πλακίδιο και αντίστοιχα ξεκινάει πρώτος. 
    public boolean humanPlays(){
        int k1 = human.maxDouble();
        int k2 = bot.maxDouble();
        
        return( k1 > k2) ;
    }
   
   //Παίρνει ένα συγκεκριμένο πλακίδιο από το χέρι του παίκτη. 
    public Tile getSpecifiedTileHuman(int k){
       return x1.get(k);
    }
    
   //Παίρνει ένα συγκεκριμένο πλακίδιο από το χέρι του μποτ. 
    public Tile getSpecifiedTileBot(int k){
       return x2.get(k);
    }
    
    
    //Παίρνει το χέρι του παίκτη.
    public ArrayList<Tile> getHandHuman(){
       return x1;
    }
    
    
    
    
    
    
}
