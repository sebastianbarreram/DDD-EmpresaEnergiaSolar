package co.com.energiasolar.cotizacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Informacion implements ValueObject<String> {
    private final String value;

    public Informacion(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El informacion no puede estar vacia");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informacion informacion = (Informacion) o;
        return Objects.equals(value, informacion.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
