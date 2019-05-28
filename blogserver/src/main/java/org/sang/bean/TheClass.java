package org.sang.bean;

public class TheClass {
    private String theClassId;
    private String theClassName;
    private String teacherId;

    public String getTheClassId() {
        return theClassId;
    }

    public void setTheClassId(String theClassId) {
        this.theClassId = theClassId;
    }

    public String getTheClassName() {
        return theClassName;
    }

    public void setTheClassName(String theClassName) {
        this.theClassName = theClassName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "TheClass{" +
                "theClassId='" + theClassId + '\'' +
                ", theClassName='" + theClassName + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }
}
