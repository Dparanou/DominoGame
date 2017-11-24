# DominoGame
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;

/*
 * Η κλάση AllTiles έχει σκοπό να δημιουργήσει και τους 24 διαφορετικούς
 * συνδιασμούς των πλακιδίων.
 *
 * @author Αθανάσιος Μπατσιούλας ΑΕΜ : 2776
 * @author Δήμητρα Παρανού ΑΕΜ : 2789
 */
public class AllTiles {
    ArrayList<Tile> tiles ;
    Random r = new Random();
    
    
    //Δημιουργία των 24 πλακιδίων και τοποθέτηση αυτών σε μια λίστα.
    public AllTiles(){
        tiles = new ArrayList<>();
        
        for (int i = 0; i <= 6 ; i++){
            for(int j = i ; j <= 6 ; j++){
                Tile tile=new Tile(i,j);
                tiles.add(tile);
            }
        }
    }
    
    
    //Επιλογή τυχαίου πλακιδίου και αφαίρεση του από την λίστα, ώστε να μην ξανά επιλεχτεί.
    public Tile getRandomTile(){
        int index = r.nextInt(tiles.size());
        return tiles.remove(index);
    }
    
    
    //Επιστρέφει μια λίστα με έναν συγκεκριμένο αριθμό τυχαίων πλακιδίων, τον οποίον τον ορίζουμε εμείς.
    public ArrayList<Tile> getRandomTiles(int x) {
        ArrayList<Tile> t = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            t.add(getRandomTile());
        }
        return t;
    }
    
}
