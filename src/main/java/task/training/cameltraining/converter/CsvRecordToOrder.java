package task.training.cameltraining.converter;

import org.springframework.stereotype.Component;
import task.training.cameltraining.entity.Order;
import task.training.cameltraining.entity.enums.OrderPriority;
import task.training.cameltraining.model.OrderCsvRecord;

import java.math.BigDecimal;

@Component
public class CsvRecordToOrder {

    public Order convert(OrderCsvRecord csvRecord) {
        Order order = new Order();
        return order;
    }


}
