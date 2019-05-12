import org.junit.*;
import static org.junit.Assert.*;

public class DecrypterTest {
    @Test
    public void decrypt_forLetter_String(){
        Decrypter decrypter = new Decrypter();
        assertEquals("w",decrypter.decrypt("x",1));
    }

    @Test
    public void decrypt_forNonLetter_String(){
        Encrypter encrypter = new Encrypter();
        assertEquals("!",encrypter.encrypt("!",1));
    }
}
