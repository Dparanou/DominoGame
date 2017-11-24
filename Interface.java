/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Αθανάσιος Μπατσιούλας ΑΕΜ : 2776
 * @author Δήμητρα Παρανού ΑΕΜ : 2789
 */
public class Interface {
    Scanner sc = new Scanner(System.in);
    Game g = new Game(12);
    Table table = new Table();
    private int choice;
    
    //Παίνουμε την επιλογή του παίκτη για το ποιό πλακίδιο θέλει να παίξει
    public int getChoise(){
        ArrayList<Tile> hand = new ArrayList<>();
        hand = g.getHandHuman();
        for (Tile t : hand){
            System.out.println(t);
        }
        System.out.println("Ποιό πλακίδιο θέλεις;");
        
        return choice = sc.nextInt();
            
    }
    //Εμφανίζει τα πλακίδια που βρίσκοντα κάθε στιγμή κάτω. Τα πλακίδια που έχουν παιχτεί απεικονίζονται με - .
    public int showSolo1(Tile[][] t){
        int k;
        
        for (int i = 0; i < 4 ; i++){
            for(int j = 0 ; j < 7 ; j++){
                System.out.println(t[i][j]); 
            } 
            
        }
        
        do{
        System.out.println("Ποιό πλακίδιο θέλεις;");
        
            k = sc.nextInt();
            
        }while ( k == 1 || k == 2 || k == 3 || k == 4);
        
        return k;
        
    }
    
    public void showTable(){
       String t = table.show();
       System.out.println(t);
    }
    
}
