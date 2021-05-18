package gl.visitor;

public interface SaisonVisitor<R> {
    R visitEte();
    R visitAutomne();
    R visitHiver();
    R visitPrintemps();
}
