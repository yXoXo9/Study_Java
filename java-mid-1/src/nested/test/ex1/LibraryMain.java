package nested.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4); // 최대 4권의 도서를 저장
        library.addBook("책1", "저자_1");
        library.addBook("책2", "저자_2");
        library.addBook("책3", "저자_3");
        library.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한");
        library.addBook("OneMoreThing", "잡스");
        library.showBooks(); // 도서관의 모든 도서 정보 출력

    }
}
