/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5_1;

import java.util.Scanner;

/**
 *
 * @author pinpin
 */
public class Ex5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();
        ScoreSoure s = new ScoreSoure();
        s.addObserver(s1);
        s.addObserver(s2);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Score ");
        String score = in.nextLine();
        s.setSomeScore(score);
        in.close();
    }
    
}
