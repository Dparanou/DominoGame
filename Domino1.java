# DominoGame
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino1;

import java.util.Scanner;

/**
 *
 * @author Αθανάσιος Μπατσιούλας ΑΕΜ : 2776
 * @author Δήμητρα Παρανού ΑΕΜ : 2789
 * 
 */
public class Domino1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Hungary h = new Hungary();
        Solo1 g = new Solo1() ;
        int choice;
       
        do{
            
                System.out.println("Ποιό παιχνίδι θέλεις να παίξεις;");
                System.out.println("1.Παιχνίδι : Solo 1 ");
                System.out.println("2.Παιχνίδι : Ουγγρικό ");
                System.out.println("3.Έξοδος.");

            
                choice = sc.nextInt();
            
        
                
                switch(choice){

                    case 1 :
                        g.start();
                        break;
                    case 2 :
                        h.start();
                        break;
                    case 3 :
                        System.out.println("Αντίοο!");
                        break;
                    default :
                        System.out.println("Λάθος επιλογή");

                }
            
            }while(choice != 3);
            
        }
        
    
}
