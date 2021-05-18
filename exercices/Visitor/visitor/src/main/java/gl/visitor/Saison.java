package gl.visitor;

public enum Saison {
    ETE {
        @Override
        <R> R accept(SaisonVisitor<R> visitor) {
            return visitor.visitEte();
        }
    },
    AUTOMNE{
        @Override
        <R> R accept(SaisonVisitor<R> visitor) {
            return visitor.visitAutomne();
        }
    },
    HIVER{
        @Override
        <R> R accept(SaisonVisitor<R> visitor) {
            return visitor.visitHiver();
        }
    },
    PRINTEMPS{
        @Override
        <R> R accept(SaisonVisitor<R> visitor) {
            return visitor.visitPrintemps();
        }
    };

    abstract <R> R accept(SaisonVisitor<R> visitor);
}
