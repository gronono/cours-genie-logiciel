package nc.unc.cours.gl;

import static nc.unc.cours.gl.Time.time;

public class Concat {

    private static final int NUM = 1_000;

    public static void main(String[] args) {
        time("Concaténation", () -> {
            String s = "";
            for (int i = 0; i < NUM; i++) {
                s = s + i;
            }
            System.out.println(s);
        });

        time("StringBuilder", () -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < NUM; i++) {
                builder.append(i);
            }
            System.out.println(builder.toString());
        });

        time("StringBuffer", () -> {
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < NUM; i++) {
                buffer.append(i);
            }
            System.out.println(buffer.toString());
        });
    }
}
