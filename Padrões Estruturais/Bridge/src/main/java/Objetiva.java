public class Objetiva extends QuestaoProva {
    public Objetiva(float numeroQuestoes) {
        super(numeroQuestoes);
    }

    public float calcularNota() {
        return this.numeroQuestoes * this.materia.peso();
    }
}
