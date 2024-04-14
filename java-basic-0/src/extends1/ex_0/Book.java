package extends1.ex_0;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String pAuthor, String pIsbn) {
        /*super.name = name;
        super.price = price;*/
        super(name, price);
        author = pAuthor;
        isbn = pIsbn;
    }

    /* 불가,
    super class 의 print 메서드가 protected 로 인해
    더 좁은 범위의 접근 제어자 메서드는 사용할 수 없음.
        private void print(){} (X)
    */
    /* 손으로 입력했음...
     => 메서드 오버라이드
    protected void print(){
        super.print();
        System.out.println("- 저자 = " + author + ",  isbn= " + isbn);
    }*/

        @Override
        protected void print() {
            super.print();
            System.out.println("- 저자 = " + author + ",  isbn= " + isbn);
        }
    }


