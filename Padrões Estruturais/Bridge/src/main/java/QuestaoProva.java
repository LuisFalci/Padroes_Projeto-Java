public abstract class QuestaoProva {
    protected Materia materia;
    protected float numeroQuestoes;

    public QuestaoProva(float numeroQuestoes) {
        this.numeroQuestoes = numeroQuestoes;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setNumeroQuestoes(float numeroQuestoes) {
        this.numeroQuestoes = numeroQuestoes;
    }
    public abstract float calcularNota();
}
