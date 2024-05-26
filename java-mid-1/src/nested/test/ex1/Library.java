package nested.test.ex1;

public class Library {
    private int arrIdx = 0;
    private Book[] arrBooks;

    public Library(int size){
        arrBooks = new Book[size];
    }

    // Library 클래스 변수를 사용하는 경우 (Library 인스턴스와 데이터 공유를 하거나 의존관계인 경우) 정적을 제외하지만
    // 여기선 Book 클래스가 단독으로 쓰이므로 (바깥 클래스, Library 클래스에 의존하지 않으므로) 정적으로 선언...
    private static class Book {
        private String title; // 제목
        private String author; // 저자명

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String pTitle, String pAuthor){
        // 책을 넣는 시점에서 공간을 체크하는것이.. 좀 더 행위에 대한 에러 파악이 명확해지는 것
        if(arrIdx >= arrBooks.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        // 정상 수행
        arrBooks[arrIdx++] = new Book(pTitle, pAuthor);
    }

    public void showBooks(){
        /* 들어있는 정보를 확인하는 곳, 저장 공간이 부족한 것을 파악하는 시점은
        등록할 때 보는 것이 좀 더 명확함.......
        if(arrIdx > arrBooks.length -1){
            for (int i = 0; i < arrIdx - arrBooks.length; i++) {
                System.out.println("도서관 저장 공간이 부족합니다.");
            }
        }
        */
        System.out.println("== 책 목록 출력 ==");
        /* 배열이 생성된 모든 공간을 탐색 => 좋지 않음(빈공간까지 포함해서..)
        for (Book arrBook : arrBooks) {
            System.out.println("도서 제목: " + arrBook.title + ", 저자: " + arrBook.author);
        }
        */
        for (int i = 0; i < arrBooks.length; i++) {
            Book arrBook = arrBooks[i];
            System.out.println("도서 제목: " + arrBook.title + ", 저자: " + arrBook.author);
        }
    }
}
