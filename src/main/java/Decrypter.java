public class Decrypter {
    public static String decrypt(String testWord, int key){
        String decrypted = "";
        if(key<1 || key>26){
            System.out.println("The key should be between 1 and 26");
        }else {
            for (int i = 0; i < testWord.length(); i++) {
                char position = testWord.charAt(i);
                if(Character.isLetter(position)){
                    char decrypt = (char)(position-key);
                    decrypted += decrypt;
                }else{
                    decrypted += position;
                }
            }
        }
        return decrypted;
    }
}
