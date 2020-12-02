package task.training.cameltraining.repository;

import org.springframework.data.repository.CrudRepository;
import task.training.cameltraining.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
