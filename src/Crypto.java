import java.util.ArrayList;
import java.util.List;

public abstract class Crypto {

    public abstract List<Integer> shifting(int k,List<Integer> messageIndexes);
    //this generateMessageWithIndex function take a message and return index list.
    public List<Integer> generateMessageWithIndex(String message) {
        List<Integer> messageWithIndex = new ArrayList<>();
        for (int i = 0; i< message.length(); i++) {
            for(int j = 0 ; j<Alphabet.chars.length;j++) {
                if(message.charAt(i)==Alphabet.chars[j]){
                    messageWithIndex.add(j);
                }
            }
        }
        return messageWithIndex;
    }
    public List<Integer> generateMessageWithIndexsubs(String message) {
        List<Integer> messageWithIndex = new ArrayList<>();
        for (int i = 0; i< message.length(); i++) {
            for(int j = 0 ; j<Alphabet.subschars.length;j++) {
                if(message.charAt(i)==Alphabet.chars[j]){
                    messageWithIndex.add(j);
                }
            }
        }
        return messageWithIndex;
    }
    //cryptoMessage function return new cyrpto message.
    public String returnNewMessage(List<Integer> messageIndexes) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< messageIndexes.size(); i++) {
            sb.append(Alphabet.chars[messageIndexes.get(i)]);
        }
        return sb.toString();
    }
    public String returnNewMessageSubs(List<Integer> messageIndexes) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< messageIndexes.size(); i++) {
            sb.append(Alphabet.subschars[messageIndexes.get(i)]);
        }
        return sb.toString();
    }

    public String shiftChipperAlgorithm (int k,String message) {
       /*System.out.println("message: "+message);
       System.out.println("k: "+k);
       System.out.println("message indexes: "+ generateMessageWithIndex(message));
       System.out.println("message indexes shifting: "+ shifting(k,generateMessageWithIndex(message)));
       System.out.println("new message: "+ cryptoMessage(shifting(k,generateMessageWithIndex(message))));*/
        return returnNewMessage(shifting(k,generateMessageWithIndex(message)));
    }
    public abstract String subsCipher(String message);

    public abstract String affineCipher(int a, int b, String message);
}
