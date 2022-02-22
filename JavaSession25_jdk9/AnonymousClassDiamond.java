package JavaSession25_jdk9;

abstract class Method<G>{
    abstract G show(G a, G b);
}
public class AnonymousClassDiamond{
    public static void main(String[] args) {
        Method<String> a = new Method<String>() {
            String show(String a, String b) {
                return a+b;
            }
        };
        String result = a.show("gita","5");
        System.out.println(result);
    }
}
/*
Output:
gita5

// G is the type variable
 */