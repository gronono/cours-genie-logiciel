package gl.visitor;

public class SportVisitor implements SaisonVisitor<String> {
    @Override
    public String visitEte() {
        return "ski nautique";
    }

    @Override
    public String visitAutomne() {
        return "rando";
    }

    @Override
    public String visitHiver() {
        return "ski";
    }

    @Override
    public String visitPrintemps() {
        return "balade";
    }
}
