import java.util.ArrayList;
import java.util.List;

public class DecriptionManager extends Cription{

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
}
