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

/**
 * FilterString is the class provide method to find a first maximum length word in a string
 * @author Hung
 * @version 1.0
 */
public class FilterString {
        /**
     * Returns a first maximum length word in string. 
     * @param str a String need to find the maximum length word
     * @return    a first maximum length word in string
     * 
     */
     public  String findMaxLengthWord(String str){
        int count = 0;
        ArrayList<Word> listWord = new ArrayList<>();
        
        // remove leading and trailing space
        String strTemp = str.trim();
        // use stringtokenzer to split the string into word by word
        StringTokenizer st = new StringTokenizer(strTemp);
       
        
        //Loop
        while(st.hasMoreTokens()){
            
            count ++;
            // Use Word class to store length and postion of each word
            Word word = new Word(st.nextToken());
            word.setPosition(count);
            // add to array to sort
            listWord.add(word);
        
        }
        
        // sort 
        Collections.sort(listWord, new Comparator<Word>(){
              @Override
              public int compare(Word word1, Word word2) {
                  
                  // if the length of word2 is greater than the length of word1 return 1
                  if(word1.getLength() < word2.getLength()) return 1;
                  
                  // if the legnth word1 is equal with the length of word 2 
                  // and the position of word2 is before the position of word1 return 1
                  else if(word1.getLength() == word2.getLength()
                          && word1.getPosition() > word2.getPosition()) return 1;
                  return -1;
              }
        });
        
        // the first item of list will be the maximum length word
        
        return listWord.get(0).getStr();
    }
}
