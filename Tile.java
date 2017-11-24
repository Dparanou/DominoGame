/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

/**
 *Η κλάση Tile δημιουργέι ένα πλακίδιο.
 * 
 * @author Αθανάσιος Μπατσιούλας ΑΕΜ : 2776
 * @author Δήμητρα Παρανού ΑΕΜ : 2789
 */
public class Tile {
    private final int x,y;
    
    public Tile(int n1, int n2){
        x = n1;
        y = n2;
    }
    
    // Επιστρέφει αν έχει ίδιο δεξί και αριστερό μέρος.
    public boolean isDouble(){
        return(x == y);
    }
    
    //Επιστρέφει την τιμή του πλακιδίου , εφόσον είναι διπλό
    public int getDouble(){
        return x;
    }
    
    //Επιστρέφει το άθροισμα του δεξίου και αριστερού μέρους του πλακιδίου
    public int getSum(){
        return x+y;   
    }
    
    //Επιστρέφει το αριστερό μέρος του πλακιδίου
    public int getNumber1(){
        return x;
    }
    
    
    //Επιστρέφει το δεξί μέρος του πλακιδίου
    public int getNumber2(){
        return y;
    }
    
    
    
}
