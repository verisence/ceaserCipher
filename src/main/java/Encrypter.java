public class Encrypter {
    public static String encrypt(String testWord, int key){
        String cipher = "";

        if(key<1 || key>26){
            System.out.println("The key should be between 1 and 26");
        }else{
            for( int i=0; i<testWord.length(); i++) {
                char position = testWord.charAt(i);
                cipher += (char)(position+key);
            }
        }

        return cipher;
    }
}
