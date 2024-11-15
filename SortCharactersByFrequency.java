package com.tekworks.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//451. Sort Characters By Frequency
public class SortCharactersByFrequency {
  public String frequencySort(String s) {
      HashMap<Character, Integer> frequencyCount = new HashMap<>();
      for(char c : s.toCharArray()) {
          frequencyCount.put(c, frequencyCount.getOrDefault(c,0)+1);
      }
      PriorityQueue<Map.Entry<Character, Integer>> queue = 
          new PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));

      queue.addAll(frequencyCount.entrySet());
      
      StringBuilder output = new StringBuilder();

      while(!queue.isEmpty()) {
          Map.Entry<Character, Integer> entry = queue.poll();
          String repeatedChar = String.valueOf(entry.getKey()).repeat(entry.getValue());
          output.append(repeatedChar);
      }
      return output.toString();
  }
}

