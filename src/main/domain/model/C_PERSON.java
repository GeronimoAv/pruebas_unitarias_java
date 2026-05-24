package edu.unisabana.tyvs.domain.model;

public class C_PERSON {
    private final String A_NAME;
    private final int A_ID;
    private final int A_AGE;
    private final E_GENDER A_GENDER;
    private final boolean A_ALIVE;

    public C_PERSON(String A_NAME, int A_ID, int A_AGE, E_GENDER A_GENDER, boolean A_ALIVE) {
        
        this.A_NAME = A_NAME;
        this.A_ID = A_ID;
        this.A_AGE = A_AGE;
        this.A_GENDER = A_GENDER;
        this.A_ALIVE = A_ALIVE;
    }

    public String GET_NAME() {return A_NAME;}
    public int GET_ID() {return A_ID;}
    public int GET_AGE() {return A_AGE;}
    public E_GENDER GET_GENDER() {return A_GENDER;}
    public boolean IS_ALIVE() {return A_ALIVE;}

}
