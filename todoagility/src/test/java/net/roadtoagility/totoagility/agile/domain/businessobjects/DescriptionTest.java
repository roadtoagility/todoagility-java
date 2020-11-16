package net.roadtoagility.totoagility.agile.domain.businessobjects;

import net.roadtoagility.totoagility.agile.domain.framework.businessobjects.ExposeValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DescriptionTest {

    @Test
    public void testDescriptionValid(){
        String descr = "description";
        assertNotNull(Description.From(descr));
    }

    @Test
    public void testDescriptionValueValid(){
        String descr = "description";
        ExposeValue<String> value = Description.From(descr);
        assertEquals(value.getValue(),descr);
    }

    @Test
    public void testEntityIdValid(){
        EntityId id = EntityId.From(1414141);
        assertNotNull(id);
    }

    @Test
    public void testEntityIdFromNext(){
        EntityId id = EntityId.getNext();
        ExposeValue value = id;
        assertNotNull(value.getValue());
    }
}