package examples;

public class findClassLoader
{
    public static void main(String[] args)
    {
        ClassLoader loader = findClassLoader.class.getClassLoader();
        System.out.println(loader.getResource("examples/findClassLoader.class"));
    }
}
