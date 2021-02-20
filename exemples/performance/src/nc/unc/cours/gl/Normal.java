package nc.unc.cours.gl;

import static nc.unc.cours.gl.Time.time;

public class Normal {

    public static void main(String[] args) {
        time("Normal", () -> {
            int value = 128;
            for (int i = 0; i < 8; i++) {
                System.out.println(value);
                value = value / 2;
            }
        });
    }
}
