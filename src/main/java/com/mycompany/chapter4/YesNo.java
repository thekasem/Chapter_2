/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter4;

/**
 *
 * @author kasem
 */
public enum YesNo {
    YES(1),NO(0);
    
    private int score;
    
    private YesNo(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    
}
