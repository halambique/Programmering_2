package no.hiof.mathibr;
import io.javalin.

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.start();

        app.get("")
        System.out.println("Hello world!");
    }
}