package fi.academy.continuousjpaviikkoprojekti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TopicController {
    @Autowired TopicRepository topicRepository;

    @GetMapping("/api/topics")
    public Iterable<Topic> restMetodiGetTopics() {
        return topicRepository.findAll();
    }

    @GetMapping("/api/topics/{id}")
    public Optional<Topic> restMetodiGetTopicWithId(@PathVariable(name="id", required = false) Integer id) {
        return topicRepository.findById(id);
    }
}
