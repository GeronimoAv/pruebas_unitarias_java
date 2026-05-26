package edu.unisabana.tyvs.domain.service;

import edu.unisabana.tyvs.domain.model.*;

public class C_REGISTRY {

    public E_REGISTERRE C_REGISTERRESULT(C_PERSON PERSON) {
        if (PERSON == null) {return E_REGISTERRE.INVALID;}
        if (!PERSON.IS_ALIVE()) {return E_REGISTERRE.DEAD;}
        return E_REGISTERRE.VALID;
    }
}
