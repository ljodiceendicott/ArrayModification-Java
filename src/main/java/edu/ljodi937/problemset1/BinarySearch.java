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
public class BinarySearch {
    
    public static void main(String[] args){ 
         int list[]= {1,3,5,7,9,13,27};
        System.out.println("in Slot:"+binsearch(list, 13));
    }
   public static int binsearch(int[] list, int num){
       int mid,guess;
        int low= 0;
        int high =(list.length)-1;
        while(low<=high){
            mid= (low+high)/2;
            guess =list[mid];
         if(guess==num){
             return mid;
         }
         else if(guess>num){
             high = mid-1;
         }
         else{
             low=mid+1;
         }
        }
        return list.length+1;
        
    }
    }

