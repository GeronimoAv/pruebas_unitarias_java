package edu.unisabana.tyvs.domain.service;
import edu.unisabana.tyvs.domain.model.*;


public class C_VALID_VOTO extends C_REGISTRY {


    public E_VOTO_VALID C_VOTO_VALID(C_PERSON PERSON) {

        E_REGISTERRE registerResult = super.C_REGISTERRESULT(PERSON);
        if (registerResult == E_REGISTERRE.VALID && mayorEdad(PERSON)) {
            return E_VOTO_VALID.VALID;
        }
        return E_VOTO_VALID.INVALID;
    }

    public boolean mayorEdad(C_PERSON PERSON) {
        return PERSON.GET_AGE() >= 18;
    }
}
