import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("day1input.txt");
        Scanner myReader = new Scanner(myObj);
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            input.add(myReader.nextInt());
        }
        Collections.sort(input);
        for (int i = 0; i < 200; i++) {
            for (int j = i + 1; j < 200; j++) {
                int a = input.get(i);
                int b = input.get(j);
                int sum = Collections.binarySearch(input, 2020 - a - b);
                if (sum >= 0) {
                    System.out.println(a * b * input.get(sum));
                    return;
                }
            }
        }
    }
}