package fi.academy.continuousjpaviikkoprojekti;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TopicRepository extends PagingAndSortingRepository<Topic, Integer> {
}
