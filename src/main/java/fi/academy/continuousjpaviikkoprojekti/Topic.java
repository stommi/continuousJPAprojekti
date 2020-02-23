package fi.academy.continuousjpaviikkoprojekti;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = IDENTITY,
            generator = "topic_id_seq")
    @SequenceGenerator(name = "topic_id_seq",
            sequenceName = "topic_id_seq",
            allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    private String title;
    private String description;
    private String additionalsource;
    private boolean complete;
    private LocalDateTime creationdate;
    private LocalDateTime completiondate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionalsource() {
        return additionalsource;
    }

    public void setAdditionalsource(String additionalsource) {
        this.additionalsource = additionalsource;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public LocalDateTime getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(LocalDateTime creationdate) {
        this.creationdate = creationdate;
    }

    public LocalDateTime getCompletiondate() {
        return completiondate;
    }

    public void setCompletiondate(LocalDateTime completiondate) {
        this.completiondate = completiondate;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", additionalsource='" + additionalsource + '\'' +
                ", complete=" + complete +
                ", creationdate=" + creationdate +
                ", completiondate=" + completiondate +
                '}';
    }
}
