/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_1;

import java.util.EventObject;

/**
 *
 * @author pinpin
 */
public class ScoreEvent extends EventObject{

    private String someData;
    
    public String getSomeData(){
        return someData;
    }
    
    public void setSomeData(String someData){
        this.someData = someData;
    }
    
    public ScoreEvent(Object source,String someData) {
        super(source);
        this.someData = someData;
    }
    
}
