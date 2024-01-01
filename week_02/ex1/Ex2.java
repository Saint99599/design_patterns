import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        Scanner inp = new Scanner(System.in);

        List<Integer> nums = getValidIntegers(inp);

        inp.close();

        displaySortedNumbers(nums);
    }

    private static List<Integer> getValidIntegers(Scanner inp) {
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter " + MAX + " valid integers in the range [0, 10]");

        while (nums.size() < MAX) {
            String s = inp.nextLine();

            if (isValidInput(s)) {
                int num = Integer.parseInt(s);

                if (isValidRange(num)) {
                    nums.add(num);
                } else {
                    System.out.println("Invalid range! Try again!");
                }
            } else {
                System.out.println("Invalid! Try again!");
            }
        }

        return nums;
    }

    private static boolean isValidInput(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean isValidRange(int num) {
        return num >= 0 && num <= 10;
    }

    private static void displaySortedNumbers(List<Integer> nums) {
        Collections.sort(nums);
        for (int num : nums)
            System.out.print(num + " ");
    }
}
