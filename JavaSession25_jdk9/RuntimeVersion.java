package JavaSession25_jdk9;

public class RuntimeVersion {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("Java Version = " + version);
        System.out.println("Java Major Version = " + version.major());
        System.out.println("Java Minor Version = " + version.minor());
        System.out.println("Java Security Version = " + version.security());
        System.out.println("Java Version Build = " + version.build().get());

    }
}
/*
output:
Java Version = 9.0.4+11
Java Major Version = 9
Java Minor Version = 0
Java Security Version = 4
Java Version Build = 11
 */