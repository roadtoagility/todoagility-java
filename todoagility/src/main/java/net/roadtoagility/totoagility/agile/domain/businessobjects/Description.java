package net.roadtoagility.totoagility.agile.domain.businessobjects;

import java.util.Objects;

public class Description{

    private final String _description;

    public Description(String description) {
        _description = description;
    }

    public static Description from(String description){

         return new Description(description);
    }

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
