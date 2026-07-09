import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] arr = new int[nums1.length + nums2.length];
       int k= 0;
       //O(n)
       for(int i=0;i<nums1.length;i++){
        arr[k++] =  nums1[i];
       } 
       //O(m)
       for(int i=0;i<nums2.length;i++){
        arr[k++] = nums2[i];
       } 
       Arrays.sort(arr);
       if(arr.length % 2 != 0){
        return arr[arr.length / 2];
       }
        else{
            int mid = arr.length / 2;
            int left = mid-1,right = mid;
            double sum = arr[left] + arr[right];
            return sum / 2;
        }
    }
}