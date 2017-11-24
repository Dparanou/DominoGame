/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import java.util.ArrayList;

/**
 *
 * @author Αθανάσιος Μπατσιούλας ΑΕΜ : 2776
 * @author Δήμητρα Παρανού ΑΕΜ : 2789
 */
public class Solo1 {

    AllTiles tiles = new AllTiles();
    ArrayList<Tile> t = new ArrayList<>();
    Interface inter = new Interface();
    private boolean flag = false;
    Tile[][] ta = new Tile[4][7];
    private int choice;
    Table table = new Table();
    private boolean first = true;
    
    

    public Solo1() {
        t = tiles.getRandomTiles(28);

        for (int i = 0; i < 4; i++) { // Βάζουμε και τα 28 πλακίδια σε έναν πίνακα 4Χ7
            for (int j = 0; j < 7; j++) {
//                ta[i][j] = t;            // Αλλα δεν ξέρω πως μπαίνουν
            }                            //Ισως να είναι καλύτερα να τα βάλουμε ως string
        }

    }

    public void start() {
        int[] c = new int[4];

        //Δημιουργούμε έναν πινακα για να ελέγχουμε και τις στήλες μας οταν ο παίχτης επιλέγει ένα πλακίδιο
        for (int i = 0; i < 4; i++) {
            c[i] = 6;
        }

        do {
            if (first) {
                choice = inter.showSolo1(ta);
                table.putFirstTile(ta[choice - 1][c[choice - 1]]); // επειδη η πρώτη εμφάνιση τα περιέχει όλα η choice ανιστοιχη στην γραμμη!
               // ta[choice - 1][c[choice - 1]] = "-"; // Μετά θέλουμε να βάλουμε στον πίνακα την - για το πλακίδιο που επέλεξε ο παίκτης 
                c[choice - 1] -= 1;                  //Den παίρνει την - γτ δεν είναι string
                first = false;
            } else {
                inter.showTable();
                choice = inter.showSolo1(ta);
                //Ελέγχει αν η επιλογή του παίκτη είναι σωστή για να τοποθετήσει τα πλακίδια στο τραπέζι. Διαφορετικά τελειώνει το παιχνίδι.
                if(table.matchHead(ta[choice - 1][c[choice - 1]]) || table.matchTale(ta[choice - 1][c[choice - 1]])){
                    table.putTile(ta[choice - 1][c[choice - 1]]); 
                   // ta[choice - 1][c[choice - 1]] = "-"; 
                    c[choice - 1] -= 1; 
                }else{
                    flag = true;
                }
                 

            }

        } while (flag);

    }

}
