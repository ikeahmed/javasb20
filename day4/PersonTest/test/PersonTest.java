import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
Person p = new Person();
    @Test
    void shouldReturnTrue() {
        p.setAge(13);
        assertTrue(p.isTeen());
    }

    @Test
    void shouldReturnFalseWhenAgeIs20() {
        p.setAge(20);
        assertFalse(p.isTeen());
    }

    @Test
    void shouldReturnFalseWhenAgeIs12() {
        p.setAge(12);
        assertFalse(p.isTeen());
    }

    @Test
    void shouldMatchName() {
        p.setFirstName("Ahmed");
        assertEquals("Ahmed",p.getFullName());
    }

}