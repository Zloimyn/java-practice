package T16_ClassString_and_more.Task2;

public class Text {
    boolean isCapsLock = false;

    public void capsLock(){
        if (isCapsLock){
            isCapsLock = false;
        }else {
            isCapsLock = true;
        }
    }

    public void print(String str){
        if (isCapsLock){
            str = str.toUpperCase();
            System.out.println(str);
        }else {
            str = str.toLowerCase();
            System.out.println(str);
        }
    }
}
