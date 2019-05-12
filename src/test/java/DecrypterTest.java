import org.junit.*;
import static org.junit.Assert.*;

public class DecrypterTest {
    @Test
    public void dencrypt_forLetter_String(){
        Decrypter decrypter = new Decrypter();
        assertEquals("w",decrypter.decrypt("x",1));
    }
}
