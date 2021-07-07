package com.company.completed.passing;

import com.company.Employer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployerTests {

    private static final Employer noArgEmployer = new Employer();
    private static final Employer oneArgEmployer = new Employer("Seaworld");

    @Test
    public void noArgConstructorTest() {
        Assertions.assertEquals(1, noArgEmployer.getId());
    }

    @Test
    public void oneArgConstructorTest() {
        Assertions.assertEquals(2, oneArgEmployer.getId());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("Seaworld", oneArgEmployer.toString());
    }

    @Test
    public void testNotEquals() {
        Assertions.assertFalse(noArgEmployer.equals(oneArgEmployer));
    }
}
