package step9_02.bookshop;

import java.util.Date;

public class BookShop {

	public static void main(String[] args) {													// main
			
		BookList bookList = new BookList();														// booklist 생성
		
		BookVO book1 = new BookVO("자바1", "홍길동", "코리아출판사", new Date(), 18000);		//bookVo에서 정보 입력 -> set
		BookVO book2 = new BookVO("자바2", "홍길자", "코리아출판사", new Date(), 17000);		//bookVo에서 정보 입력 -> set
		BookVO book3 = new BookVO("자바3", "홍길숙", "코리아출판사", new Date(), 21000);		//bookVo에서 정보 입력 -> set
		
		bookList.addBook(book1);																// 북리스트에 book1 변수 추가
		bookList.addBook(book2);																// 북리스트에 book2 변수 추가
		bookList.addBook(book3);																// 북리스트에 book3 변수 추가
		bookList.addBook(new BookVO("자바4", "홍길희", "코리아출판사", new Date(), 35000));		// 북리스트에 변수가 아닌 바로 생성자로 데이터 입력
		bookList.addBook(new BookVO("자바5", "홍길영", "코리아출판사", new Date(), 12000));		// 북리스트에 변수가 아닌 바로 생성자로 데이터 입력
		bookList.addBook(new BookVO("자바6", "홍길도", "코리아출판사", new Date(), 15000));		// 북리스트에 변수가 아닌 바로 생성자로 데이터 입력
		
		System.out.println(bookList);															// 북리스트 출력
		
	}
	
}








