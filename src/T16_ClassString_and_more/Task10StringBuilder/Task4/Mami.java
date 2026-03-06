package T16_ClassString_and_more.Task10StringBuilder.Task4;

public class Mami {
    public static void main(String[] args) {
        String name1 = "Молебен о коне белом";
        String name2 = "Молебен о коне";
        String name3 = "Молебен о коне белом";
        String name4 = "Молебен о коне белом";
        String name5 = "казак";
        System.out.println(isPalidromeLine(name1));
        System.out.println(isPalidromeLine(name2));
        System.out.println(isPalidromeLine(name5));
    }
    public static Boolean isPalidromeLine(String name){
        String emae = name.replace(" ","");
        StringBuilder stringBuilder1 = new StringBuilder(emae);

        stringBuilder1.reverse();

        if (stringBuilder1.toString().equals(emae)){
            return true;
        }else {
            return false;
        }

//        for (int i = 0; i < emae.length(); i++) {
//            if (stringBuilder1.charAt(i) == stringBuilder.charAt(i)){
//                trueOrFalse = true;
//            }else {
//                trueOrFalse = false;
//                return trueOrFalse;
//            }
//        }

    }

}
