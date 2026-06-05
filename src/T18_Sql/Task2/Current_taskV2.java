package T18_Sql.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Current_taskV2 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> mapa = new HashMap<>();

        FileReader reader = new FileReader("words.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            if (mapa.get(line) == null){
                mapa.put(line, 0);
            }
            if (line.equals("A")){
                mapa.put("A", 1 + mapa.get("A"));
            } else if (line.equals("B")) {
                mapa.put("B", 1 + mapa.get("B"));
            } else if (line.equals("C")) {
                mapa.put("C", 1 + mapa.get("C"));
            } else if (line.equals("D")) {
                mapa.put("D", 1 + mapa.get("D"));
            }
        }

        System.out.println(mapa);

        bufferedReader.close();
    }
}
