# Ceaser Cipher.
#### This is a java program that encrypts or decrypts text depending on the users choice, the key and the text.
#### By **Phil Kipkemboi**
## Description
Once the program runs, the user has two choices, whether to encrypt or to decrypt text. This is then followed by a prompt to enter the text and a prompt for the key. The user then gets the result back.

## BDD
| INPUT                                                                       | OUTPUT             |
|-----------------------------------------------------------------------------|--------------------|
| Encrypt choice followed by the text to be encrypted and the key to be used  | The encrypted text |
| Decrypt choice followed by the text to be decrypted and the key to be used  | The decrypted text |

## User Stories
* As a user I should be given a choice on whether to encrypt or decrypt text.
* As a user I should be prompted for the text to be acted on.
* As a user I should be able to give the key.
* As a user I should get the decrypted or the encrypted text back.

### Setup
* To run the application, first install the java development kit from `https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html`
* Next clone the project using `$ git clone https://github.com/verisence/ceaserCipher/` to your preferred folder.
* In the command prompt, navigate to src/main/java/ and run the command `$ javac App.java ; java App`

## Technologies used
* Java.
* Gradle(for unit testing).