public class Main {
    public static void main (String [] ergs){
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(5, 0, 2));}
    public static float containers (int x, int y, int z){
        return x * 20 + y * 50 + z * 100;
    }
}