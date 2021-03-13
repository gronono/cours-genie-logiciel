package nc.unc.cours.gl.paradigms.procedural;

public class Procedural {
    public static void main(String[] args) {
        String [] noms = new String [] { "Gerard", "Bob", "Richard", "Alice", "Albert" };
        float [] notes = new float[] { 10f, 9f, 12f, 13f, 15f};

        float min = Float.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < min) {
                min = notes[i];
                minIndex = i;
            }
        }
        System.out.println("Procedural - La note la plus mauvaise est " + min + " obtenue par " + noms[minIndex] );
    }
}
