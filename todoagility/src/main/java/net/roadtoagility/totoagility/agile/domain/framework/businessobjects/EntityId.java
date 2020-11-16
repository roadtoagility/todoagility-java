package net.roadtoagility.totoagility.agile.domain.framework.businessobjects;

import java.util.Date;
import java.util.Objects;

public class EntityId {

    private final long _id;

    public EntityId(long id) {
        _id = id;
    }

    public static EntityId from(long id){

         return new EntityId(id);
    }

    public static EntityId getNext(){
        Date date = new Date();
        return new EntityId(date.getTime());
    }

    public Long getValue() {
        return _id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityId that = (EntityId) o;
        return _id == that._id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id);
    }

}
