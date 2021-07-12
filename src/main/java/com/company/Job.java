package com.company;
 import java.util.Objects;

public class Job {
    private static int nextId = 1;

    private int id;
    private String name;
   private Employer employer;
   private Location location;
   private PositionType positionType;
   private CoreCompetency coreCompetency;

  // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field
    public Job() {
       id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
       this.name = name;
       this.employer = employer;
        this.location = location;
       this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



   // // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    //// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.

    public String getName() {
        return name;
  }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
     if (o == null || getClass() != o.getClass()) return false;
    Job job = (Job) o;
      return id == job.id;
   }

   @Override
    public int hashCode() {
       return Objects.hash(id);
    }

    @Override
   public String toString() {
      String name =  this.getName();
      String employer = this.getEmployer().getValue();
     String location = this.getLocation().getValue();
      String positionType =this.getPositionType().getValue();
      String coreCompetency = this.getCoreCompetency().getValue();

     if(this.getName().isEmpty()){
        name = "Data not Available";
    }else if (this.getEmployer().getValue().isEmpty()){
        employer = "Data not Available";
     }else if(this.getLocation().getValue().isEmpty()){
          location = "Data not Available";
      }else if(this.getPositionType().getValue().isEmpty()){
          positionType = "Data not Available";
     }else if(this.getCoreCompetency().getValue().isEmpty()){
          coreCompetency = "Data is not Available";
     }

       return "\n" +
            "ID: " + id +
            "\nName: " + name +
             "\nEmployer: " + employer +
             "\nLocation: " + location +
             "\nPosition Type: " + positionType +
             "\nCore Competency: " + coreCompetency +
              "\n";
   }

  public void setName(String name) {
      this.name = name;
    }

   public int getId() {
      return id;
   }

   public Employer getEmployer() {
       return employer;
   }

   public void setEmployer(Employer employer) {
      this.employer = employer;
    }

   public Location getLocation() {
       return location;
    }

    public void setLocation(Location location) {
      this.location = location;
   }

  public PositionType getPositionType() {
       return positionType;
   }

   public void setPositionType(PositionType positionType) {
      this.positionType = positionType;
   }

  public CoreCompetency getCoreCompetency() {
     return coreCompetency;
    }

   public void setCoreCompetency(CoreCompetency coreCompetency) {
     this.coreCompetency = coreCompetency;
   }

 }
