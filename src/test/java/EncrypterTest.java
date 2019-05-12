import org.junit.*;
import static org.junit.Assert.*;

public class EncrypterTest {
    @Test
    public void encrypt_forLetter_String(){
        Encrypter encrypter = new Encrypter();
        assertEquals("w",encrypter.encrypt("v",1));
    }

    @Test
    public void encrypt_forWord_String(){
        Encrypter encrypter = new Encrypter();
        assertEquals("wcfsjtfodf",encrypter.encrypt("verisence",1));
    }
}
