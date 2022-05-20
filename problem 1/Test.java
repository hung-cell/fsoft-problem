/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Scanner;
/**
 *
 * @author HungDao
 */
public class Test {     
    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter string");
        String inputString = scanner.nextLine();  // Read user input
        FilterString filterString = new FilterString();
        System.out.println("The first maximum length word is: " +
                filterString.findMaxLengthWord(inputString));
        
    }
    

   
}
