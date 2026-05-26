# testing
## estructura del proyecto

``` bash

```

## Test

### GREEN

Esta es la implementacion minima para que la prueba pueda pasar sin problemas

``` java
    public void SHOULREGISTERPERSON() {

        C_REGISTRY REGISTRY = new C_REGISTRY();
        
        C_PERSON PERSON = new C_PERSON("Ana", 1, 30, E_GENDER.FEMALE, true);
        
        E_REGISTERRE RESULT = REGISTRY.C_REGISTERRESULT(PERSON);

        Assert.assertEquals(E_REGISTERRE.VALID, RESULT);
    }
```

![test_minimo](image.png)

### RED

esta es una porueba con la logica incompleta por tal motivo la prueba va a fallar

``` java
    public void shouldRejectDeadPerson() {
        // Arrange: preparar los datos y el objeto a probar
        C_REGISTRY REGISTRY = new C_REGISTRY();
        C_PERSON DEAD = new C_PERSON("Carlos", 2, 40, E_GENDER.MALE, false);

        // Act: ejecutar la acción que queremos probar
        E_REGISTERRE RESULT = REGISTRY.C_REGISTERRESULT(DEAD);

        // Assert: verificar el resultado esperado
        Assert.assertEquals(E_REGISTERRE.DEAD, RESULT);
    }
```

![test_fallando](image-1.png)