/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import topic.allTopics;

/**
 *
 * @author EJ
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    public CourseController() {
        System.out.println("Course controller constructor");
    }

    //when GET request comes in, this getAllTopics will be triggered
    @RequestMapping(value = "/topics/{id}/courses", method = RequestMethod.GET)
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getSingleCourse(@PathVariable String id) {

        return courseService.getSingleCourse(id);
    }

    @RequestMapping(value = "/topics/{topicID}/courses", method = RequestMethod.POST)
    public void addCourse(@RequestBody Course crs, @PathVariable String topicID) {
        crs.setTpc(new allTopics(topicID, "", ""));
        courseService.addCourse(crs);
    }

    @RequestMapping(value = "/topics/{topicID}/courses/{id}", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course crs, @PathVariable String topicID,@PathVariable String id) {
        crs.setTpc(new allTopics(topicID, "", ""));
        courseService.updateCourse(crs);
    }

    @RequestMapping(value = "/topics/{topicID}/courses/{id}", method = RequestMethod.DELETE)
    public void DeleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
