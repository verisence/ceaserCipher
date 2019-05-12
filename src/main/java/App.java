import java.io.Console;

public class App {
    public static void main(String[] args){
        Console console = System.console();

        System.out.println("\nWelcome to the Ceaser Cipher App. \n\nDo you want to encrypt or to decrypt?");
        String response = console.readLine();

        if(response.equals("encrypt")){
            System.out.println("Enter the sentence you want to encrypt");
            String inStr = console.readLine();
            System.out.println("Enter the key to use to encrypt");
            String keyString = console.readLine();
            int key = Integer.parseInt(keyString);
            Encrypter encrypter = new Encrypter();
            String encrypted = encrypter.encrypt(inStr,key);
            System.out.println("The encrypted text is:\n"+encrypted);
//            System.out.println(encrypted);
        }else if (response.equals("decrypt")){
            System.out.println("Enter the sentence you want to decrypt");
            String inStr = console.readLine();
            System.out.println("Enter the key to use to decrypt");
            String keyString = console.readLine();
            int key = Integer.parseInt(keyString);
            Decrypter decrypter = new Decrypter();
            String decrypted = decrypter.decrypt(inStr,key);
            System.out.println("The decrypted text is:\n"+decrypted);
        }

    }
}
