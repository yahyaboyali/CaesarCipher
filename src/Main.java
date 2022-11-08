
public class Main {
    public static void main(String[] args) {
        EncryptionManager encryptionManager = new EncryptionManager();
        String deneme = encryptionManager.shiftChipperAlgorithm(6,"deneme");
        DecryptionManager decryptionManager = new DecryptionManager();
        String deneme2 = decryptionManager.shiftChipperAlgorithm(6,deneme);
        System.out.println("şifreli: "+ deneme);
        System.out.println("çözülmüş hal: "+ deneme2);
    }
}