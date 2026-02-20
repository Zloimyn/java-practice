package T16_ClassString_and_more.Task2;

public class Text {
    boolean isCapsLock = false;

    public void capsLock(){
        if (isCapsLock){
            isCapsLock = false;
        }else {
            isCapsLock = true;
        }
        // так или так
        isCapsLock = !isCapsLock;
    }

    public void print(String str){
        if (isCapsLock){
            str = str.toUpperCase();
            System.out.println(str);
        }else {
            str = str.toLowerCase();
            System.out.println(str);
        }
        // так или так
        System.out.println(isCapsLock ?  str.toUpperCase() : str);
    }
}
