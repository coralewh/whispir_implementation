/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package whispir_implementation;
import whispir_library.Library;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new Library().newGreetings());
        System.out.println(new Library().greetingsWithProps("TEST123"));
        System.out.println(new Library().someLibraryMethod());
        
    }
}
