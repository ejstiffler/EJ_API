/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author EJ
 */
// make this class a buisness service and its Singleton
// on startup of porject the class path scan will be performed and makes an instance of this class and store in RAM
@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepo; // dependency injection

//    private List<allTopics> topics = new ArrayList<>(Arrays.asList(
//            new Course("1", "Java", "This is Java "),
//            new Course("2", "C++", "This is C++ "),
//            new Course("3", "C#", "This is C#"),
//            new Course("4", "Python", "This is Python"),
//            new Course("5", "Pearl", "This is Pearl"),
//            new Course("6", "Angular", "This is Angular")
//    ));
    
    public List<Course> getAllCourses(String id) {
//        return topics;
        List<Course> tp = new ArrayList<>();
        courseRepo.findAll().forEach(tp::add);
        return tp;
    }
    
    public Course getSingleCourse(String id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepo.findOne(id);
    }
    
    public void addCourse(Course crs) {
//        topics.add(tpc);
        courseRepo.save(crs);
    }
    
    public void updateCourse(Course crs) {
//        for (int i = 0; i < topics.size(); i++) {
//            Course top = topics.get(i);
//            if (top.getId().equals(id)) {
//                topics.set(i, t);
//                return;
//
//            }
//        }
        courseRepo.save(crs);
    }
    
    public void deleteCourse(String id) {

//        int i = Integer.parseInt(id);
//        Course top = topics.get(i - 1);
//        if (top.getId().equals(id)) {
//            topics.remove(top);
//        }
//        topics.removeIf(t -> t.getId().equals(id));
        courseRepo.delete(id);
        
    }
}
