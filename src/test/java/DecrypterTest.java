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
        Decrypter decrypter = new Decrypter();
        assertEquals("w!",decrypter.decrypt("x!",1));
    }

    @Test
    public void decrypt_forCase_String(){
        Decrypter decrypter = new Decrypter();
        assertEquals("Efrs",decrypter.decrypt("Fgst",1));
    }
}
