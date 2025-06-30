package in.ubersid.cassidoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLastNonRepeatingCharacter {

    @Test
    void getLastNonRepeatingCharacter() {
        Character result = new LastNonRepeatingCharacter().getLastNonRepeatingCharacter("candy canes do taste yummy");
        assertEquals('u', result);
    }

}