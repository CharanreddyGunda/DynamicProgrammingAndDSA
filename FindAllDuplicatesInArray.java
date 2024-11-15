package com.tekworks.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//442. Find All Duplicates in an Array
public class FindAllDuplicatesInArray {
  public List<Integer> findDuplicates(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      List<Integer> duplicates = new ArrayList<>();
      for(int n : nums) {
          if(!set.contains(n)){
              set.add(n);
          }
          else{
              duplicates.add(n);
          }
      }
      return duplicates;
  }
}
