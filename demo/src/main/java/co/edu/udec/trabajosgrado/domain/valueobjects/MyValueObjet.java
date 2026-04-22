package co.edu.udec.trabajosgrado.domain.valueobjects;

public record MyValueObjet(String value) {
    public MyValueObjet {
        if (value == null || value.isBlank()){
            throw new IllegalArgumentException("MyValueObjet no puede estar vacío");
        }
    }
}
