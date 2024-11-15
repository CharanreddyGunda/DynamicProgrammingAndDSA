package com.tekworks.day5;

import java.util.ArrayList;
import java.util.List;

//118. Pascal's Triangle
public class PascalTriangle {
  public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> pascalTriangle =new ArrayList<>();
      if(numRows==0) return pascalTriangle;
      //first list
      List<Integer> prev = new ArrayList<>();
      prev.add(1);
      pascalTriangle.add(prev);
      //start from second list
      for(int i=1 ; i<numRows ; i++) {
          List<Integer> current = new ArrayList<>();
          //first element set to 1
          current.add(1);
          for(int j=1; j<i ; j++) {
              current.add(prev.get(j-1)+prev.get(j));
          }
          //last element set to 1
          current.add(1);
          //adding current list to pascalTriangle
          pascalTriangle.add(current);
          prev = current;
      }
      return pascalTriangle;
  }
}