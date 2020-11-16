package net.roadtoagility.totoagility.agile.domain.businessobjects;

import net.roadtoagility.totoagility.agile.domain.framework.businessobjects.EntityId;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DescriptionTest {

    @Test
    public void testDescriptionValid(){
        String descr = "description";
        assertNotNull(Description.from(descr));
    }

    @Test
    public void testDescriptionValueValid(){
        String descr = "description";
        Description value = Description.from(descr);
        assertEquals(value.getValue(),descr);
    }

    @Test
    public void testEntityIdValid(){
        EntityId id = EntityId.from(1414141);
        assertNotNull(id);
    }

    @Test
    public void testEntityIdFromNext(){
        EntityId value = EntityId.getNext();
        assertNotNull(value.getValue());
    }
}