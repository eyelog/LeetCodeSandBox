package subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3};

        System.out.println(subsets(nums));
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        System.out.println("result = " + result);
        for(int n : nums){
            System.out.println("n = " + n);

            int size = result.size();
            System.out.println("size = " + size);

            for(int i=0; i<size; i++){
                System.out.println("i = " + i);

                System.out.println("result.get(i) = " + result.get(i));
                List<Integer> subset = new ArrayList<>(result.get(i));
                System.out.println("subset size = " + subset.size());
                System.out.println("subset before add = " + subset);

                subset.add(n);
                System.out.println("subset = " + subset);

                result.add(subset);
                System.out.println("result = " + result);
                System.out.println("*****************");
            }
            System.out.println("******************************************");
            System.out.println("                                          ");
        }
        return result;
    }
}
