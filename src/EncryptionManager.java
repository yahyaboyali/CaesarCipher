import java.util.ArrayList;
import java.util.List;

public class EncryptionManager extends Crypto {
    /*
     this shifting function take key knowledge and List of message indexes. return shift index list.
     */
   public List<Integer> shifting(int k,List<Integer> messageIndexes) {
       List<Integer> shiftingMessage = new ArrayList<>();
       for(int i = 0; i < messageIndexes.size() ; i++) {
           if(messageIndexes.get(i) + k >= Alphabet.chars.length) {
               shiftingMessage.add(i,(messageIndexes.get(i)+k)%26);
           } else {
               shiftingMessage.add(messageIndexes.get(i)+k);
           }
       }
       return shiftingMessage;
   }

    @Override
    public String subsCipher(String message) {
        List<Integer> messageIndex = generateMessageWithIndex(message);
        return returnNewMessageSubs(messageIndex);
    }

    @Override
    public String affineCipher(int a, int b, String message) {
       List<Integer> messageWithIndex = generateMessageWithIndex(message);
       List<Integer> newMessageWithIndexes = new ArrayList<>();
       for (int i = 0 ; i< messageWithIndex.size(); i++) {
           //y = ax +b mod 26
           if(messageWithIndex.get(i)*a+b>Alphabet.chars.length) {
               newMessageWithIndexes.add(((messageWithIndex.get(i)*a)+b)%26);
           } else {
               newMessageWithIndexes.add((messageWithIndex.get(i)*a)+b);
           }
       }
        return returnNewMessage(newMessageWithIndexes);
    }
}
