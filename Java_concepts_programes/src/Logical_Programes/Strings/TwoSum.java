package Java_concepts_programes.src.Logical_Programes.Strings;
import java.util.Arrays;
import java.util.HashMap;


public class TwoSum {

    public static int[] findTwoSum(int nums[],int target){

        HashMap<Integer,Integer> numMap= new HashMap<Integer, Integer>();

        for(int i=0 ;i<nums.length;i++){

            //i=0;, extra=target-[0] : 9-5=4

            int extra= target - nums[i]; //9-4=5;
            //true: I got that pair
            if(numMap.containsKey(extra)){
                return new int[]{numMap.get(extra) , i};
            }
            numMap.put(nums[i],i);//2:0 11:1 5:2
        }
   return null;
    }

    public static void main(String[]args){
        int nums[]={2,11,5,4};
        int target = 9;

        int result[]= findTwoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
