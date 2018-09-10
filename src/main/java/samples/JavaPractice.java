package samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaPractice {
    public static void main(String[] args) throws NumberFormatException, IOException {
            studentTotalMarks();

    }

    public static void studentTotalMarks() throws NumberFormatException, IOException {
        float marks[] = new float[6];
        float total = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the mark for subject : " + i);
            marks[i] = Integer.parseInt(br.readLine());
            total = total + marks[i];
        }
        System.out.println("Total marks is : " + total);
    }
}
