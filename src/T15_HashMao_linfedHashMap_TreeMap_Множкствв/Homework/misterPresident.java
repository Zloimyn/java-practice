package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Homework;

import java.util.HashMap;
import java.util.Scanner;

public class misterPresident {
    public static void main(String[] args) {
        HashMap<String, Integer> misterPresidents = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько раз вы хотите вести голосов и кандидатов: ");
        int userNumber = scanner.nextInt();
        for (int i = 0; i < userNumber; i++) {
            System.out.println("Проголосуйте за одного кандидата введите его имя: ");
            String userNum = scanner.next();
            System.out.println("Сколько голосов вы хотите внести: ");
            int userGolosa = scanner.nextInt();
            if (misterPresidents.containsKey(userNum)){
                misterPresidents.put(userNum, userGolosa + misterPresidents.get(userNum));
            }else {
                misterPresidents.put(userNum, userGolosa);
            }
        }

        System.out.println(misterPresidents);
    }
}
