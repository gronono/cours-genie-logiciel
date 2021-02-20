package nc.unc.cours.gl;

public class Time {
    public static void time(String title, Runnable runnable) {
        System.out.println(title);
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        System.out.println(title + " en " + (end - start) + " ms");
        System.out.println("------------");
    }
}
