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
}
