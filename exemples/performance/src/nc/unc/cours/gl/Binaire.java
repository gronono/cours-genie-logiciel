package nc.unc.cours.gl;

import static nc.unc.cours.gl.Time.time;

public class Binaire {

    public static void main(String[] args) {
        time("Binaire", () -> {
            int value = 0b10000000;
            for (int i = 0; i < 8; i++) {
                System.out.println(value);
                value >>= 1;
            }
        });
    }
}
