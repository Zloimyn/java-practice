package T18_Sql.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Current_task {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("result.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            if (line.equals("A")){
                a++;
            } else if (line.equals("B")) {
                b++;
            } else if (line.equals("C")) {
                c++;
            } else if (line.equals("D")) {
                d++;
            }
        }

        System.out.println("Кол-во variants А: " + a);
        System.out.println("Кол-во variants B: " + b);
        System.out.println("Кол-во variants C: " + c);
        System.out.println("Кол-во variants D: " + d);

        bufferedReader.close();
    }

}
