package nc.unc.cours.gl;

public class NePasFaire {

    public static int aaaaaaaaa(int d1, int d2, int d3, int d4, int d5)
    {
        int[] counts = new int[6];
        counts[d1-1]++;
        counts[d2-1]++;
        counts[d3-1]++;
        counts[d4-1]++;
        counts[d5-1]++;
        int n = 0;
        int score = 0;
        for (int i = 0; i < 6; i += 1)
            if (counts[6-i-1] >= 2) {
                n++;
                score += (6-i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println("should be 8 : " + aaaaaaaaa(1, 1, 2, 3, 3));
        System.out.println("should be 0 : " + aaaaaaaaa(1, 1, 2, 3, 4));
        System.out.println("should be 6 : " + aaaaaaaaa(1, 1, 2, 2, 2));
    }
}
