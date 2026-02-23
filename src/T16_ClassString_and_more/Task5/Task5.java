package T16_ClassString_and_more.Task5;

public class Task5 {
    public static void main(String[] args) {
        String card = "1111 2222 3333 4444";
        cardInvesiable(card);
    }

    static void cardInvesiable(String card){
        String cardFirst = card.substring(0, 4);
        String cardLast = card.substring(card.length() - 4, card.length());
        System.out.println(cardFirst + " **** **** " + cardLast);
    }
}
