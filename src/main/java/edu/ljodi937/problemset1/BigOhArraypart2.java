/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ljodi937.problemset1;

/**
 *
 * @author jodic
 */
public class BigOhArraypart2 {
    public static void main(String[] args){
        char[] str = {'a','b','c','c','c','e','f','g','h','e','b'};
        int[] charoccur= new int[128];
        BigOhArraypart2.mostOccur(str,charoccur);
    }
    public static void mostOccur(char[] letters, int[] log){
        for(int i=0; i<letters.length; i++){
            log[letters[i]]++;
        }
        int popular=0;
        int poploc=0;
        for(int j=0; j<128; j++){
           if(log[j]>popular){
               popular = log[j];
               poploc = j;
           }
        }
        char popchar = (char)poploc;
        System.out.println("The most popular character is "+popchar+" and it occurs:"+popular+" times");
    }
}
