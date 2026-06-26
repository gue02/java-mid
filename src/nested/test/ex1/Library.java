package nested.test.ex1;

public class Library {
    int max_count;
    int count = 0;
    Book[] books;
    Library(int book_count){
        books = new Book[book_count];
        max_count = book_count;
    }

    class Book{
        private String title;
        private String author;
        Book(String title, String author){
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author){
        if(count >= max_count){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        books[count] = new Book(title,author);
        count++;
    }
    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books){
            System.out.println("도서 제목: "+book.title+", 저자: "+book.author);
        }
    }
}
