package co.com.energiasolar.diseño.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Sede implements ValueObject<String> {

    private final String value;

    public Sede(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La sede no puede estar vacia");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sede sede = (Sede) o;
        return Objects.equals(value, sede.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
