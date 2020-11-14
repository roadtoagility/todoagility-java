package net.roadtoagility.totoagility.agile.domain.businessobjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DescriptionTest {

    @Test
    public void testDescriptionValid(){
        String descr = "description";
        assertNotNull(Description.From(descr));
    }
}