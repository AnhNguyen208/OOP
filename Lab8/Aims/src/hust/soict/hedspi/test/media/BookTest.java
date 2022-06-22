package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.book.Book;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("The lion King", null, 0, 0, null);
		book.setContentString("Người đờn ông giữa một rừng gấu đỏ chỉ biết cặm cụi dâng bánh rót trà");
		book.processContent();
	}

}
