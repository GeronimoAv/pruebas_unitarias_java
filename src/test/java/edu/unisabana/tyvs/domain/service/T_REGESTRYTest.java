package edu.unisabana.tyvs.domain.service;

import edu.unisabana.tyvs.domain.model.*;
import org.junit.Test;

import java.rmi.registry.Registry;

import org.junit.Assert;

public class T_REGESTRYTest {

    @Test
    public void SHOULREGISTERPERSON() {
        // Arrange: preparar los datos y el objeto a probar
        C_REGISTRY REGISTRY = new C_REGISTRY();
        C_PERSON PERSON = new C_PERSON("Ana", 1, 30, E_GENDER.FEMALE, true);
        
        // Act: ejecutar la acción que queremos probar
        E_REGISTERRE RESULT = REGISTRY.C_REGISTERRESULT(PERSON);

        // Assert: verificar el resultado esperado
        Assert.assertEquals(E_REGISTERRE.VALID, RESULT);
    }
    

    @Test
    public void shouldRejectDeadPerson() {
        // Arrange: preparar los datos y el objeto a probar
        C_REGISTRY REGISTRY = new C_REGISTRY();
        C_PERSON DEAD = new C_PERSON("Carlos", 2, 40, E_GENDER.MALE, false);

        // Act: ejecutar la acción que queremos probar
        E_REGISTERRE RESULT = REGISTRY.C_REGISTERRESULT(DEAD);

        // Assert: verificar el resultado esperado
        Assert.assertEquals(E_REGISTERRE.DEAD, RESULT);
    }

}
 