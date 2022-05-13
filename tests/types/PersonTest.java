package types;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p;

    @BeforeEach
    void setUp() {
        p = new Person("11111111A", "raul@gmail.com");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setDNI() {
    }

    @Test
    void setMail() {

    }
}