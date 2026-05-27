# testing
(TODA LA DOCUMENTACION SE ENCUENTRA EN LA WIKI DEL REPOSITORIO)
## INTEGRANTES

Sadane Geronimo Miguel Santiago Acevedo Virgues

## estructura del proyecto

``` bash
README.md
pom.xml
.gitignore
jacoco/
└─ index.html
src/
├─ main/java/edu/unisabana/tyvs/
│ ├─ domain/
│ │ ├─ model/
│ │ │ ├─ C_PERSON.java
│ │ │ ├─ E_GENDER.java
│ │ │ ├─ E_REGISTERRE.java
│ │ │ └─ E_VOTO_VALID.java
│ │ └─ service/
│ │ ├─ C_REGISTRY.java
│ │ └─ C_VALID_VOTO.java
└─ test/java/edu/unisabana/tyvs/
├─ domain/
│ └─ service/
│ └─ T_REGESTRYTest.java
```

## indicaciones

las siguientes pruebas se realizaron con Java y maven, se utilizan los siguientes comandos para compilar y correr los test

**Compilar**

``` cli
mvn clean compile
```

**correr test unitarios**

``` cli
mvn clean test
```

**cobertura del codigo**

```
mvn jacoco:report
```