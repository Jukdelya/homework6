public class Main {
    public static void main(String[] args) {
        Exception();
    }
    public static void Exception() {
        try (TryRes res = new TryRes()) {
            throw new Exception("Ичключение поймано в блоке Try");
        } catch (Exception e) {
            throw new RuntimeException("Исключение поймано в блоке Catch");
        }
    }
}
class TryRes implements AutoCloseable {
    @Override
    public void close(){
        throw new RuntimeException("Исключение поймано в блоке try with resources");
    }
}