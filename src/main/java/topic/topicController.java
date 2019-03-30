/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author EJ
 */
@RestController
public class topicController {

    @Autowired
    private topicService TS;

    public topicController() {
        System.out.println("topic controller constructor");
    }

    //when GET request comes in, this getAllTopics will be triggered
    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<allTopics> getAllTopics() {
        return TS.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public allTopics getSingleTopic(@PathVariable String id) {

        return TS.getSingleTopic(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody allTopics t) {
        TS.addTopic(t);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody allTopics t, @PathVariable String id) {
        TS.updateTopic(t, id);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void DeleteTopic(@PathVariable String id) {
        TS.deleteTopic(id);
    }
}
