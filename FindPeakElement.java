package com.tekworks.day5;

//162. Find Peak Element
public class FindPeakElement {
  public int findPeakElement(int[] nums) {
      //use binary serach
      int start = 0, end = nums.length-1;
      while(start<end) {
          int mid = start+(end-start)/2;
          if(nums[mid]>nums[mid+1]) {
              end = mid;
          }
          else{
              start = mid+1;
          }
      }
      return start;
  }
}

//for(int i=0 ; i<nums.length-1 ; i++) {
//   if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
//       return i;
//   }
//}
