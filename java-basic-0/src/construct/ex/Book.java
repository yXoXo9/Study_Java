package construct.ex;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    // TODO-CODE

    void displayInfo(){
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }

    /*
    * 생성자는 객체 생성 직후 객체를 초기화 하기 위한,
    * 특별한 메서드로 생각할 수 있다.
    * */
    Book(){
        this("","",0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author){
        this(title, author, 1500);
    }
}
