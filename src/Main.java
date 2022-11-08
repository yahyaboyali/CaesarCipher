
public class Main {
    public static void main(String[] args) {
        EncriptionManager encriptionManager = new EncriptionManager();
        String deneme = encriptionManager.shiftChipperAlgorithm(6,"deneme");
        DecriptionManager decriptionManager = new DecriptionManager();
        String deneme2 = decriptionManager.shiftChipperAlgorithm(6,deneme);
        System.out.println("şifreli: "+ deneme);
        System.out.println("çözülmüş hal: "+ deneme2);
    }
}