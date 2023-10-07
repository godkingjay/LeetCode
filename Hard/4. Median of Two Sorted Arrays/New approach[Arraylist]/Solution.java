import java.util.ArrayList;
public class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>(); //ArrayList Initialization
        
        //Add Elements from `nums1` to `list`
        for(int i:nums1){
            list.add(i); 
        }
        //Add Elements from `nums2` to `list`
        for(int j:nums2){
            list.add(j);
        }

        double sum=0; //Initialize a Sum Variable

        for(int i=0;i<list.size();i++){
            sum += list.get(i); //Calculate the Sum of Elements
        }
        
        double res = sum/list.size(); //Calculate the Average (Mean)

        return res; //Return the Median Value


    }
}