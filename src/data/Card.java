/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author user
 */
public class Card {
    // vērtības būs 2, 3, 4, .... J, Q, K, A                   
    private String value;
    
    // Masts H, S, D, C "char kā viens simbols"
    private char suit;
    
    //konstruktors
    public Card(String value, char suit){
        this.suit = suit;
        this.value = value;
    }
    
    public int getValue(){
        
    }
    
    public String getFullName(){
        
    }
}
