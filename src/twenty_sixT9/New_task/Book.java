package twenty_sixT9.New_task;

public class Book {
    private String title;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages){
        if (pages > 0){
            this.pages = pages;
        }else {
            System.out.println("Страницы должны быть в книге");
        }
    }

    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }
}
