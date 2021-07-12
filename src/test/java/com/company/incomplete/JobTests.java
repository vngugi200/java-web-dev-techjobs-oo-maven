package com.company.incomplete;

import com.company.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class JobTests {
    static Job job1, job2, job3, job4, job5;

    @BeforeAll
    static void createItemObjects() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

        // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    @Test
    public void testSettingJobId() {
        job1 = new Job();
        job2 = new Job();
        assertEquals(1, (job2.getId()) - (job1.getId()));
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertEquals(job3.getName(), "Product tester");
        assertEquals(3, job3.getId());
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(job3.getEmployer() instanceof Employer);

    }

    @Test
    public void testJobsForEquality() {
    assertFalse(job3.equals(job4));
    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {
    assertTrue(job3.toString().startsWith("\n"));
    assertTrue(job3.toString().endsWith("\n"));

    }

    @Test
    public void testToStringHasLabelsForEachField() {
        String expected = String.format("\nID: %d\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s\n",
                job3.getId(), job3.getName(),job3.getEmployer().getValue(), job3.getLocation().getValue(), job3.getPositionType().getValue(), job3.getCoreCompetency().getValue());
        String actual = job3.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringDataNotAvailable() {
        String expected = String.format("\nID: %d\nName: Data not Available\nEmployer: %s\nLocation: %s\nPosition Type: " +
                        "%s\nCore Competency: %s\n", job5.getId(),
                job5.getEmployer().getValue(), job5.getLocation().getValue(),
                job5.getPositionType().getValue(), job5.getCoreCompetency().getValue());
        String actual = job5.toString();
        assertEquals(expected, actual);
    }

}
