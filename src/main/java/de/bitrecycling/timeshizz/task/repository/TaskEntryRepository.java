package de.bitrecycling.timeshizz.task.repository;

import de.bitrecycling.timeshizz.task.model.TaskEntry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;

/**
 * The taskentry repository provides persistence the the taskentry model
 *
 * created by robo
 */
public interface TaskEntryRepository extends ReactiveMongoRepository<TaskEntry, String> {
    Flux<TaskEntry> findAllByTaskId(String taskId);

    Flux<TaskEntry> findAllByCreationTimeBetween(LocalDateTime from, LocalDateTime to);
    Flux<TaskEntry> findAllByOrderByCreationTimeDesc(Pageable pageable);
    Flux<TaskEntry> findAllByOrderByCreationTimeAsc(Pageable pageable);
}
