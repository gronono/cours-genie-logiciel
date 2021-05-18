package gl.visitor;

public class Main {




    public static void main(String[] args) {
        System.out.println(Saison.ETE.accept(new SportVisitor()));
    }
}
