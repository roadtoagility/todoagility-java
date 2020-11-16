package net.roadtoagility.totoagility.agile.domain.businessobjects;

import net.roadtoagility.totoagility.agile.domain.framework.businessobjects.ExposeValue;

import java.util.Objects;

public class Description implements ExposeValue<String> {

    private static final int DESCRIPTION_LENGTH_LIMIT = 100;

    private final String _description;

    public Description(String description) {
        _description = description;
    }

    public static Description From(String description){

         return new Description(description);
    }

    @Override
    public String getValue() {
        return _description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Description that = (Description) o;
        return _description.equals(that._description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_description);
    }

}
