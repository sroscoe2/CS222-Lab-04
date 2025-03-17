package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.Author;

public class AuthorTests {

    /**
     * Tests that Author has appropriate constructor and getters.
     */
    @Test
    public void authorTest01(){
        Author a = new Author("Miguel","de Cervantes");
        Assertions.assertEquals("Miguel", a.getFirstName());
        Assertions.assertEquals("de Cervantes", a.getLastName());
    }

    /**
     * Tests that Author has appropriate setters.
     */
    @Test
    public void authorTest02(){
        Author a = new Author("Miguel","de Cervantes");
        a.setFirstName("Rick");
        a.setLastName("Riordan");
        Assertions.assertEquals("Rick", a.getFirstName());
        Assertions.assertEquals("Riordan", a.getLastName());
    }

    /**
     * Tests that Author has appropriate toString() method.
     */
    @Test
    public void authorTest03(){
        Author a = new Author("Christelle","Dabos");
        Assertions.assertEquals("Dabos, Christelle", a.toString());

    }
    
}
