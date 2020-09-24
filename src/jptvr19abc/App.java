/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19abc;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
 class App {
     public void run(){
         System.out.println("Алфавит");
         String a = "abcdefghijklmnopqrstuvwxyz";
         boolean correct = true;
        char[] abc = new char[26];
        char[] abc2 = new char[26];
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        str = scanner.nextLine();
        abc =a.toCharArray();
        for(int i = 0; i < 26; i++)
        {int index = str.indexOf(abc[i]);
        if( index == -1  ){correct = false; abc2[i] = abc[i];
        
            
            }
        }
        if( correct == true ){System.out.println("В строке все буквы");}
        else{System.out.println("Не хватает букв " +  new String(abc2));}
            
        
        
            
        
        
        
        
        
        
        
        
            
        
     }
 }    
         
     
    

