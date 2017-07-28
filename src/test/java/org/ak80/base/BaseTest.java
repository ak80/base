package org.ak80.base;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BaseTest {


    @Test
    public void returns_Hello_World_for_hello() {
        // Given
        Base base = new Base();

        // When Then
        assertThat(base.hello(),is(Base.HELLO));
    }

}
