import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObjetivaTest {

    @Test
    void deveRetornarNotaDasQuestoesObjetivasDeMatematica() {
        Materia materia = new Matematica();
        QuestaoProva questaoProva = new Objetiva(5f);
        questaoProva.setMateria(materia);
        assertEquals(12.5f, questaoProva.calcularNota(), 2.5f);
    }

    @Test
    void deveRetornarNotaDasQuestoesObjetivasDePortugues() {
        Materia materia = new Portugues();
        QuestaoProva questaoProva = new Objetiva(5f);
        questaoProva.setMateria(materia);
        assertEquals(7.5f, questaoProva.calcularNota(), 1.5f);
    }

    @Test
    void deveRetornarNotaDasQuestoesObjetivasDeGeografia() {
        Materia materia = new Geografia();
        QuestaoProva questaoProva = new Objetiva(5f);
        questaoProva.setMateria(materia);
        assertEquals(3.75f, questaoProva.calcularNota(), 0.75f);
    }

    @Test
    void deveRetornarNotaDasQuestoesObjetivasDeHistoria() {
        Materia materia = new Historia();
        QuestaoProva questaoProva = new Objetiva(5f);
        questaoProva.setMateria(materia);
        assertEquals(4.5f, questaoProva.calcularNota(), 0.9f);
    }

}