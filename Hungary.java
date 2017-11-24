/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

/**
 *
 * @author Αθανάσιος Μπατσιούλας ΑΕΜ : 2776
 * @author Δήμητρα Παρανού ΑΕΜ : 2789
 */
public class Hungary extends Game {

    Game game = new Game(12);
    Interface inter = new Interface();
    Table table = new Table();
    private int c;
    private int k = 12;
    private boolean flag, playBot, playHuman, first;

    public Hungary() {
        flag = false;
        first = true;

        if (humanPlays()) {    //Ελέγχουμε ποίος παίζει πρώτο, διότι εφόσον ρίξει ένα πλακίδιο
            playHuman = true;  // θα συνεχίζει να παίξει μέχρις ότου να μην έχει πλακίδιο να παίξει.
            playBot = false;
        } else {
            playHuman = false;
            playBot = true;
        }
    }

    
    // !!!!!!!!!!!!!!!!!!!!!!!!!!       ΚΑΠΟΥ ΠΡΕΠΕΙ ΝΑ ΑΛΛΑΖΕΙ ΤΟ ΦΛΑΓΚ      ~!!!!!!!!!!!!!!!!!!!
    public void start() {

        do {
            
            //Ελέγχει αν έχει ο παίκτης το μεγαλύτερο διπλό και είναι ο 1 γύρος.
            if (humanPlays() && first) {   
                                                                
                int c = inter.getChoise();
                table.putFirstTile(game.getSpecifiedTileHuman(c - 1));
                human.removeTile(c - 1);                          //αφαιρεί το πλακίδιο που έπαιξε
                first = false;
            }
            
            else if (playHuman) {                               //O παίκτης παίζει μέχρις ότου να μην μπορεί να βάλει άλλο πλακίδιο.
                do {
                    inter.showTable();
                    int k = inter.getChoise();
                    table.putTile(game.getSpecifiedTileHuman(c - 1));
                    human.removeTile(c - 1);

                } while (table.matchHead(game.getSpecifiedTileHuman(c - 1)) && table.matchTale(game.getSpecifiedTileHuman(c - 1)));
                //Η επιλογή του παίκτη δεν μπορεί να μπει σε καμία πλευρά του τραπεζιού
                
                playHuman=false; //Ο παίκτης δεν παίζει άλλο
                playBot=true;    //Σειρά έχει ο μποτ

            } 
            
            else if (!humanPlays() && first) { //Ελέγχει αν το μποt έχει το μεγαλύτερο πλακίδιο και είναι ο πρώτος γύρος. 
                table.putFirstTile(game.getSpecifiedTileBot(bot.maxDouble())); //τοποθετεί ένα πλακίδιο του μποτ στο τραπέζι.
                //πηγαίνει στην κλάση που παίρνει ένα συγκεκριένο πλακίδιο απο το μποτ , και επειδή αυτή η κλάση έχει παράμετρο έναν ακέραιο,
                //βάζουμε το πλακίδιο που βρίσκεται στην θέση μαξ (καθως μονο ή μαξ επιστρέφει έναν ακέραιο.
                //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ΘΑΝΟ ΕΠΛΙΖΩ ΝΑ ΚΑΤΑΛΑΒΑΙΝΕΙΣ...ΣΒΗΣΕ ΤΟ ΣΧΟΛΙΟΟΟ ΑΥΤΟΟΟΟΟΟ!!!!!!!!!!!!!!!!!!!!!!!!
                bot.removeTile(k - 1);
                first = false;
                k -= 1;
            } 
            
            else if (playBot) {
                int i = 0;
                do {
                    if (table.matchHead(game.getSpecifiedTileBot(i))) {
                        table.putTile(game.getSpecifiedTileBot(i));
                        bot.removeTile(i);                                 //αφαιρεί τα πλακίδια του μποτ
                        k -= 1;                                            //μειώνει τα πλακίδια που έχει το μποτ στο χέρι του
                        i = 0;   // για να ξανα πάρει από την αρχή τα πλακίδια του μποτ μας
                    } else if (table.matchTale(game.getSpecifiedTileBot(i))) {
                        table.putTile(game.getSpecifiedTileBot(i));
                        bot.removeTile(i);
                        k -= 1;
                        i = 0;
                    }

                    i++;
                } while ( i == k );

                playHuman = true;
                playBot = false;

            }

        } while (flag);

    }

}
