package Creational.Singleton;

public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    private LazyInitialization() {

    }

    public static LazyInitialization getInstance() {
        if (lazyInitialization == null) {
            lazyInitialization = new LazyInitialization();
        }
        return lazyInitialization;
    }
}
