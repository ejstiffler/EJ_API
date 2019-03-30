package Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import topic.allTopics;

@Entity // making the table of Course
public class Course {

    // member variables
    @Id // my primay key is id String for this Table 
    private String id;
    private String name;
    private String description;
    private allTopics tpc;

    // default constructor
    public Course() {
        System.out.println("Main Default Constructor");
    }

    // copy constructor
    public Course(String id, String name, String description, String topicID) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.tpc = new allTopics(topicID, "", "");
        System.out.println("copy constructor");

    }

    // getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // setters 
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public allTopics getTpc() {
        return tpc;
    }

    public void setTpc(allTopics tpc) {
        this.tpc = tpc;
    }
}
