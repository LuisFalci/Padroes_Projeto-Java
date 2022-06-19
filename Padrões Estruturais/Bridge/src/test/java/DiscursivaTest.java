import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscursivaTest {
    @Test
    void deveRetornarNotaDasQuestoesDiscursivasDeMatematica() {
        Materia materia = new Matematica();
        QuestaoProva questaoProva = new Discursiva(5f);
        questaoProva.setMateria(materia);
        assertEquals(25f, questaoProva.calcularNota(), 2.5f);
    }

    @Test
    void deveRetornarNotaDasQuestoesDiscursivasDePortugues() {
        Materia materia = new Portugues();
        QuestaoProva questaoProva = new Discursiva(5f);
        questaoProva.setMateria(materia);
        assertEquals(15f, questaoProva.calcularNota(), 1.5f);
    }

    @Test
    void deveRetornarNotaDasQuestoesDiscursivasDeGeografia() {
        Materia materia = new Geografia();
        QuestaoProva questaoProva = new Discursiva(5f);
        questaoProva.setMateria(materia);
        assertEquals(7.5f, questaoProva.calcularNota(), 0.75f);
    }

    @Test
    void deveRetornarNotaDasQuestoesDiscursivasDeHistoria() {
        Materia materia = new Historia();
        QuestaoProva questaoProva = new Discursiva(5f);
        questaoProva.setMateria(materia);
        assertEquals(9f, questaoProva.calcularNota(), 0.9f);
    }

}