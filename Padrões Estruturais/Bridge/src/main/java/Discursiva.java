public class Discursiva extends QuestaoProva {
    public Discursiva(float numeroQuestoes) {
        super(numeroQuestoes);
    }
    public float calcularNota() {
        return (this.numeroQuestoes * this.materia.peso()) *2;
    }
}
