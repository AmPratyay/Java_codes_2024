package Signleton;

public class App {

    private static App app;

    private App() {
        // Only single instance of this class
    }

    public static App getInstance() {
        if (app == null)
            app = new App();
        return app;
    }
}
