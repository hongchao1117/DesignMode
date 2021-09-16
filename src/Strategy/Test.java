package Strategy;

import com.sun.tools.javac.Main;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println(context.execute(1, 2));
    }
}
