package com.tekworks.day5;

import java.util.List;

//648. Replace Words
public class ReplaceWords {
  public String replaceWords(List<String> dictionary, String sentence) {
      String[] words = sentence.split("\\s+");
      for(int i=0 ; i<words.length ; i++) {
          for(String s : dictionary) {
              if(words[i].startsWith(s)) {
                  words[i] = s;
                  // break;
              }
          }
      }
      return String.join(" ", words);
  }
}
