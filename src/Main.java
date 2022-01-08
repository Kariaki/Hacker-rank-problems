import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        var collect = arr.stream().sorted();
        var min = 0;
        var max = 0;
        for (int i = 0; i < 4; i++) {
            min += arr.get(i);
            var calculatedIndex = (arr.size() - 1) - i;
            max += arr.get(calculatedIndex);
        }

        System.out.println(min);
        System.out.println(max);
    }
}
