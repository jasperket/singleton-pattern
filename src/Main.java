public class Main {
    public static void main(String[] args) {
        EnhancedSingleton instance = EnhancedSingleton.getInstance("Jasper");
        EnhancedSingleton instance1 = EnhancedSingleton.getInstance("Chris");
        instance.print();
        instance1.print();
    }
}