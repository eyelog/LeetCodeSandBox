package subsets;

import java.util.ArrayList;
import java.util.List;

public class SubsetSandBox {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            List<Integer> subset = new ArrayList<>(i);
            System.out.println("subset size = " + subset.size());

            subset.add(i);
            System.out.println("subset = " + subset);
        }
    }
}
