package edu.unisabana.tyvs.domain.service;

import edu.unisabana.tyvs.domain.model.*;
import org.junit.Test;
import org.junit.Assert;

public class T_REGESTRYTest {

    @Test
    public void SHOULREGISTERPERSON() {

        C_REGISTRY REGISTRY = new C_REGISTRY();
        
        C_PERSON PERSON = new C_PERSON("Ana", 1, 30, E_GENDER.FEMALE, true);
        
        E_REGISTERRE RESULT = REGISTRY.C_REGISTERRESULT(PERSON);

        Assert.assertEquals(E_REGISTERRE.VALID, RESULT);
    }
}
