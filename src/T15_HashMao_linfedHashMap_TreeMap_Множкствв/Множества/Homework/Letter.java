package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.Homework;

import java.time.LocalDate;

public class Letter {
    public String authorName;      // имя отправителя
    public LocalDate dateReceived; // дата получения письма
    public String text;            // текст письма

    public Letter(String senderName, LocalDate dateReceived, String text) {
        this.authorName = senderName;
        this.dateReceived = dateReceived;
        this.text = text;
    }
}
