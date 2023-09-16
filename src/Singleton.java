public class Singleton {
    public static Singleton instance;
    public String data;

    private Singleton(String data) {
        this.data = data;
    }

    private static Singleton getInstance(String data) {
        if(instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }
}
