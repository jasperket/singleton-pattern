public class EnhancedSingleton {
    private static volatile EnhancedSingleton instance;
    private String data;

    private EnhancedSingleton(String data) {
        this.data = data;
    }

    public static EnhancedSingleton getInstance(String data) {
        EnhancedSingleton result = instance;
        if(result == null) {
            synchronized (EnhancedSingleton.class) {
                result = instance;
                if(result == null) {
                    instance = result = new EnhancedSingleton(data);
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println(data);
    }
}
