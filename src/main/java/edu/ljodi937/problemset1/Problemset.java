/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ljodi937.problemset1;

import java.util.ArrayList;

/**
 *
 * @author jodic
 */
public class Problemset {
 static int num[][] =
 {{1,2,3,5,3},
  {2,3,3,0,5},
  {3,4,8,3,5},
  {2,0,5,7,9},
  {2,5,6,3,2}};
 
public static void main(String[] args){   
   int n= 5;
   int[] x = new int[n];
   int[] y = new int[n];
   for(int k=0; k<n; k++){
     x[k]=1;
     y[k]=1;
    }
   //Loop through the array to find the locations that contain the num -> 0
   //i is the x val
   //j is the y val
   for(int i=0; i<n; i++){
       for(int j=0; j<n; j++){
           if(num[i][j]==0){
               x[i]=0;
               y[j]=0;
           }         
       }
   }
//int[][] layout= new int[5][5];
   //Loop through to make it so that you an put the zeros where yhey should be first do the x values then do the y values
 //k is the x val
 //m is the y val
 for(int k=0; k<n; k++){
    for(int m=0; m<n; m++){
        if(x[k]==0||y[m]==0){
            num[k][m]=0;
        }
    }
    }

   //at the end of the program read through the array 
   
   //TO DO WRITE A CODE TO PRINT OUT THE ARRAY
   for(int i=0; i<n; i++){
       for(int j=0; j<n; j++){
           System.out.print(num[i][j]+" ");
       }
       System.out.println(" ");
        }
    } 
       }






 


