package com.company;
import javax.management.StringValueExp;
import java.util.Objects;
public class PositionType extends JobField {
    public PositionType(String value) {
        super(value);
    }
}


/*package com.company;

public class PositionType {
    private static int nextId = 1;

    private int id;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when their id fields match.

    // Getters and Setters:

    public int getId() { return this.id; };

    public String getValue() { return this.value; }

    public void setValue(String value) { this.value = value; }
}*/
