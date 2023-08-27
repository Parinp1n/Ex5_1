/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_1;

import java.util.ArrayList;

/**
 *
 * @author pinpin
 */
public class ScoreSoure {
    private String score;
    private ArrayList <ScoreListener> observers;
    
    public ScoreSoure(){
        observers = new ArrayList<>();
    }
    
    public void addObserver(ScoreListener obj){
        observers.add(obj);
    }
    
    public void setSomeScore(String score){
        fireScoreEvent(new ScoreEvent(this, score));
    }
    
    public void fireScoreEvent(ScoreEvent evt){
        for (ScoreListener observer : observers){
            observer.update(evt);
        }    
    }
    
    public void setScoreLine(String value) {
        fireScoreEvent(new ScoreEvent(this, value));
    }
    
    public String getScoreLine(){
        return score;
    }
    
    public void removeSubcriber(ScoreListener s){
        observers.remove(s);
    }
    
}
