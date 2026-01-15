package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.time.LocalDate;

import main.Author;
import main.Book;

public class BookTests {

	@Test
	public void BookTest01() {
		Author a = new Author("Miguel", "de Cervantes");
		Book b = new Book("Don Quijote", a, "978-0393315097", "1996-09-17");
		Assertions.assertEquals("Don Quijote", b.getTitle());
		Assertions.assertEquals("978-0393315097", b.getISBN());
	}

	@Test
	public void BookTest02() {
		Author a = new Author("Rick", "Riordan");
		Book b = new Book("Don Quijote", null, "978-0393315097", "1996-09-17");
		b.setAuthor(a);
		b.setTitle("The Lightning Thief");
		b.setISBN("978-0786856299");
		b.setPublishDate("2005-06-28");
		Assertions.assertEquals("The Lightning Thief", b.getTitle(),"Check your Title getters and setters.");
		Assertions.assertEquals("978-0786856299", b.getISBN(),"Check your ISBN getters and setters.");
	}

	@Test
	public void BookTest03() {
		Author a = new Author("Christelle", "Dabos");
		Book b = new Book("A Winter's Promise", a, "978-1609454838", "2018-09-25");
		Assertions.assertEquals("Dabos, Christelle. \"A Winter's Promise\". 978-1609454838. Published 2018-09-25.", b.toString(),"Some aspect of printing a Book isn't working.");
	}

	@Test
	public void LocalDateTest(){
		// tests that the student did not change publishDate to a String.
		Author a = new Author("Christelle", "Dabos");
		Book b = new Book("A Winter's Promise", a, "978-1609454838", "2018-09-25");

		Assertions.assertTrue(b.getPublishDate() instanceof LocalDate,"You converted publishDate to a String! :("));
	}
}
