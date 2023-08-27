/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_1;

/**
 *
 * @author pinpin
 */
public class Subscriber2 implements ScoreListener{

    @Override
    public void update(ScoreEvent evt) {
        System.out.println("live result: " + evt.getSomeData());
    }
    
}
