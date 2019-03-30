package topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // making the table of allTopics
public class allTopics {

    // member variables
    
    @Id // my primay key is id String for this Table 
    private String id;
    private String name;
    private String description;

    // default constructor
    public allTopics() { 
        System.out.println("Main Default Constructor");
    }

    // copy constructor
    public allTopics(String id, String name, String description) {
     
        this.id = id;
        this.name = name;
        this.description = description;
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

}
