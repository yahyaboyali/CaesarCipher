import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EncryptionManager encryptionManager = new EncryptionManager();
        String message = "deneme";
        System.out.println("ana mesaj : "+ message);
        String deneme = encryptionManager.shiftChipperAlgorithm(6,message);
        DecryptionManager decryptionManager = new DecryptionManager();
        String deneme2 = decryptionManager.shiftChipperAlgorithm(6,deneme);
        System.out.println("---------shiftt cipher-----------");
        System.out.println("şifreli: "+ deneme);
        System.out.println("çözülmüş hal: "+ deneme2);
        String subsdeneme = encryptionManager.subsCipher(message);
        String subsdeneme2 = decryptionManager.subsCipher(subsdeneme);
        System.out.println("---------Substitution-----------");
        System.out.println("şifreli: "+ subsdeneme);
        System.out.println("çözülmüş hal: "+ subsdeneme2);
        System.out.println("---------affine-----------");
        System.out.println(encryptionManager.affineCipher(21,43,"selam"));
    }
}