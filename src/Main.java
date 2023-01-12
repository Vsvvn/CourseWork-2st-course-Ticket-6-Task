import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println();

        int a = -1;
        while (a < nums.size() - 1) {
            a++;
            System.out.println(nums.get(a));
        }

        System.out.println();

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}