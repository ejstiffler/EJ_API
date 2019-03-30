/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
public class topicService {
    
    @Autowired // the best way to get an instance into a spring service class is to autowiring object of class
    private topicRepository topicRepo; // dependency injection

//    private List<allTopics> topics = new ArrayList<>(Arrays.asList(
//            new allTopics("1", "Java", "This is Java "),
//            new allTopics("2", "C++", "This is C++ "),
//            new allTopics("3", "C#", "This is C#"),
//            new allTopics("4", "Python", "This is Python"),
//            new allTopics("5", "Pearl", "This is Pearl"),
//            new allTopics("6", "Angular", "This is Angular")
//    ));
    public List<allTopics> getAllTopics() {
//        return topics;
        List<allTopics> lst = new ArrayList<>();
//        topicRepo.findAll();
        Iterator<allTopics> iter = topicRepo.findAll().iterator();
        while(iter.hasNext()){
            lst.add(iter.next());
        }
        return lst;
        
//        topicRepo.findAll().forEach(lst::add);
//        return lst;
        
     
        
    }
    
    public allTopics getSingleTopic(String id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepo.findOne(id);
    }
    
    public void addTopic(allTopics tpc) {
//        topics.add(tpc);
        topicRepo.save(tpc);
    }
    
    public void updateTopic(allTopics topic, String id) {
//        for (int i = 0; i < topics.size(); i++) {
//            allTopics top = topics.get(i);
//            if (top.getId().equals(id)) {
//                topics.set(i, t);
//                return;
//
//            }
//        }
        topicRepo.save(topic);
    }
    
    public void deleteTopic(String id) {

//        int i = Integer.parseInt(id);
//        allTopics top = topics.get(i - 1);
//        if (top.getId().equals(id)) {
//            topics.remove(top);
//        }
//        topics.removeIf(t -> t.getId().equals(id));
        topicRepo.delete(id);
        
    }
}
