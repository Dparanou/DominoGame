/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

/**
 * Δημιουργεί το τραπέζι στο οποίο θα τοποθετούνται τα πλακίδιά μας.
 *
 * @author Αθανάσιος Μπατσιούλας ΑΕΜ : 2776
 * @author Δήμητρα Παρανού ΑΕΜ : 2789
 */
public class Table {

    private String table;

    public Table() {}

    //ελέγχει αν ταιριάζει το πλακίδιο στην αρχή του τραπεζιού.
    public boolean matchHead(Tile t) {
        int head = table.charAt(0);
        return (head == t.getNumber1() || head == t.getNumber2());

    }
    
    //ελέγχει αν ταιριάζει το πλακίδιο στο τέλος του τραπεζιού.
    public boolean matchTale(Tile t) {
        int tale = table.charAt(table.length()-1);
        return (tale == t.getNumber1() || tale == t.getNumber2());

    }
    
    
    //Τοποθετέι τα πλακίδια στο τραπέζι ανάλογα με το που  ταιριάζουν.
    public boolean putTile(Tile t){
        
        if(matchHead(t)){
            if(t.getNumber1() == table.charAt(0))//ελέγχει αν το αριστερό μέρος του πλακιδίου είναι ίσο με το πρώτο μέρος του πρώτου πλακιδίου.
            {
                table = "(" + t.getNumber2() + ":" + t.getNumber1() + ")|" + table;//αν ναι το προσθέτει στην αρχή του τραπεζιού μας.
                return true;//επιστρέφει την επιτυχή τοποθέτηση του πλακιδίου.
            }
            else{
                table = "(" + t.getNumber1() + ":" + t.getNumber2() + ")|" + table;
                return true;
            }
        }
        else if(matchTale(t)){
            if (t.getNumber1() == table.charAt(table.length()-1)){
                table = table + "|(" + t.getNumber1() + ":" + t.getNumber2() + ")";
                return true;
            }
            else{
                table = table + "|(" + t.getNumber2() + ":" + t.getNumber1() + ")";
                return true;
            }
        }
        else{
            return false;
        }
    }
    
    //Τοποθετεί το πρώτο πλακίδιο στο τραπέζι μας.
    public void putFirstTile(Tile t){
        table = "(" + t.getNumber1() + ":" + t.getNumber2() + ")";
    }
    
    public String show(){
        return table;
    }
}
