package fi.academy.continuousjpaviikkoprojekti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TopicController {
    @Autowired TopicRepository topicRepository;

    @GetMapping("/api/topics")
    public Iterable<Topic> restMetodiGetTopics() {
        return topicRepository.findAll();
    }

    @GetMapping("/api/topics/{id}")
    public Optional<Topic> restMetodiGetTopicWithId(@PathVariable(name="id", required = true) Integer id) {
        return topicRepository.findById(id);
    }

    @DeleteMapping("/api/topics/{id}")
    public void restMetodiDeleteTopic (@PathVariable(name="id", required = true) Integer id) {
        topicRepository.deleteById(id);
    }

    @PostMapping("/api/topics")
    public void restMetodiPostTopic(@RequestBody Topic topic) {
        topicRepository.save(topic);
    }

    @PutMapping("api/topics/{id}")
    public void restMetodiPutTopic(@PathVariable(name="id", required = true) Integer id, @RequestBody Topic topic) {
        topicRepository.save(topic);
    }


}
