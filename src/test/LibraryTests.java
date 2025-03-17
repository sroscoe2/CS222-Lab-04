package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.Author;
import main.Book;
import main.Library;

public class LibraryTests {

    @Test
	public void LibraryTest01() {
        Library lib = new Library();
		Author a = new Author("Miguel", "de Cervantes");
		Book b = new Book("Don Quijote", a, "978-0393315097", "1996-09-17");
        Author a1 = new Author("Rick", "Riordan");
		Book b1 = new Book("The Lightning Thief", a1, "978-0786856299", "2005-06-28");
		Author a2 = new Author("Christelle", "Dabos");
		Book b2 = new Book("A Winter's Promise", a2, "978-1609454838", "2018-09-25");

        lib.add(b);
        lib.add(b1);
        lib.add(b2);

		Assertions.assertEquals("Don Quijote", lib.getBook("Don Quijote").getTitle());
		Assertions.assertEquals("Riordan, Rick", lib.getBook("The Lightning Thief").getAuthor().toString());
        Assertions.assertEquals(null, lib.getBook("Darius The Great Is Not Okay"));
	}

    @Test
	public void LibraryTest02() {
        Library lib = new Library();
		Author a = new Author("Miguel", "de Cervantes");
		Book b = new Book("Don Quijote", a, "978-0393315097", "1996-09-17");
        Author a1 = new Author("Rick", "Riordan");
		Book b1 = new Book("The Lightning Thief", a, "978-0786856299", "2005-06-28");
		Author a2 = new Author("Christelle", "Dabos");
		Book b2 = new Book("A Winter's Promise", a, "978-1609454838", "2018-09-25");

        lib.add(b);
        lib.add(b1);
        lib.add(b2);

        Assertions.assertEquals(3, lib.size());

        lib.remove(2);
        
        Assertions.assertEquals(2, lib.size());
	}

    @Test
	public void LibraryTest03() {
        Library lib = new Library();
		Author a = new Author("Miguel", "de Cervantes");
		Book b = new Book("Don Quijote", a, "978-0393315097", "1996-09-17");
        Author a1 = new Author("Rick", "Riordan");
		Book b1 = new Book("The Lightning Thief", a1, "978-0786856299", "2005-06-28");
		Author a2 = new Author("Christelle", "Dabos");
		Book b2 = new Book("A Winter's Promise", a2, "978-1609454838", "2018-09-25");

        lib.add(b);
        lib.add(b1);
        lib.add(b2);
        
        String strMatch = """
        Library:
        1. de Cervantes, Miguel. "Don Quijote". 978-0393315097. Published 1996-09-17.
        2. Riordan, Rick. "The Lightning Thief". 978-0786856299. Published 2005-06-28.
        3. Dabos, Christelle. "A Winter's Promise". 978-1609454838. Published 2018-09-25.
        """;
        
        Assertions.assertEquals(strMatch, lib.toString());
	}
}
