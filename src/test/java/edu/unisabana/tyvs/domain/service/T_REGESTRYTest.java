package edu.unisabana.tyvs.domain.service;

import edu.unisabana.tyvs.domain.model.*;
import org.junit.Test;

import org.junit.Assert;

public class T_REGESTRYTest {

    @Test
    public void PERSON_VALID() {
        // Arrange: preparar los datos y el objeto a probar

        C_VALID_VOTO VALID_VOTE = new C_VALID_VOTO();
        C_PERSON PERSON = new C_PERSON("Ana", 1, 30, E_GENDER.FEMALE, true);
        
        // Act: ejecutar la acción que queremos probar
        E_VOTO_VALID VOTE_RESULT = VALID_VOTE.C_VOTO_VALID(PERSON);

        // Assert: verificar el resultado esperado
        Assert.assertEquals(E_VOTO_VALID.VALID, VOTE_RESULT);
    }
    

    @Test
    public void YOUNG_PERSON() {
        // Arrange: preparar los datos y el objeto a probar

        C_VALID_VOTO VALID_VOTE = new C_VALID_VOTO();
        C_PERSON YOUNG_PERSON = new C_PERSON("Carlos", 2, 12, E_GENDER.MALE, true);

        // Act: ejecutar la acción que queremos probar
        E_VOTO_VALID VOTE_RESULT = VALID_VOTE.C_VOTO_VALID(YOUNG_PERSON);

        // Assert: verificar el resultado esperado
        Assert.assertEquals(E_VOTO_VALID.INVALID, VOTE_RESULT);
    }

    @Test
    public void AGE_INVALID() {

        C_VALID_VOTO VALID_VOTE = new C_VALID_VOTO();
        C_PERSON AGE_INVALID_PERSON = new C_PERSON("Carlos", 2, -1, E_GENDER.MALE, true);

        // Act: ejecutar la acción que queremos probar
        E_VOTO_VALID VOTE_RESULT = VALID_VOTE.C_VOTO_VALID(AGE_INVALID_PERSON);

        // Assert: verificar el resultado esperado
        Assert.assertEquals(E_VOTO_VALID.INVALID, VOTE_RESULT);
    }

    @Test
    public void DEAD_PERSON() {
        C_VALID_VOTO VALID_VOTE = new C_VALID_VOTO();
        C_PERSON DEAD_PERSON = new C_PERSON("Ana", 1, 100, E_GENDER.FEMALE, false);
        
        // Act: ejecutar la acción que queremos probar
        E_VOTO_VALID VOTE_RESULT = VALID_VOTE.C_VOTO_VALID(DEAD_PERSON);

        // Assert: verificar el resultado esperado
        Assert.assertEquals(E_VOTO_VALID.INVALID, VOTE_RESULT);
    }

        @Test
    public void NULL_PERSON() {
        C_VALID_VOTO VALID_VOTE = new C_VALID_VOTO();
        C_PERSON NULL_PERSON = null;

        // Act: ejecutar la acción que queremos probar
        E_VOTO_VALID VOTE_RESULT = VALID_VOTE.C_VOTO_VALID(NULL_PERSON);

        // Assert: verificar el resultado esperado
        Assert.assertEquals(E_VOTO_VALID.INVALID, VOTE_RESULT);
    }
}