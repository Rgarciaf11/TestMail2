package types;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p;

    @BeforeEach
    void setUp() {
        p = new Person();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setDNI() {
    }

    @Test
    void setMail() {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        if
        p.setMail("asdasda");
        assertEquals("", );
    }
}