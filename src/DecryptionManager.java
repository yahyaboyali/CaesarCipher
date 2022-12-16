import java.util.ArrayList;
import java.util.List;

public class DecryptionManager extends Crypto {

    @Override
    public List<Integer> shifting(int k, List<Integer> messageIndexes) {
        List<Integer> shiftingMessage = new ArrayList<>();
        for(int i = 0; i < messageIndexes.size() ; i++) {
            if(messageIndexes.get(i) -k <0) {
                shiftingMessage.add(i,(messageIndexes.get(i)-k)+25);
            } else {
                shiftingMessage.add(messageIndexes.get(i)-k);
            }
        }
        return shiftingMessage;
    }

    @Override
    public String subsCipher(String message) {
        List<Integer> messageIndex = generateMessageWithIndexsubs(message);
        return returnNewMessage(messageIndex);
    }

    @Override
    public String affineCipher(int a, int b, String message) {
        return null;
    }
}
