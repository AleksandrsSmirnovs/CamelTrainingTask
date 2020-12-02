package task.training.cameltraining.converter;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;
import task.training.cameltraining.model.OrderCsvRecord;

@Component
public class OfflineOrderFilter {

    public boolean isOffline(Exchange exchange) {
        OrderCsvRecord orderCsvRecord = (OrderCsvRecord) exchange.getIn().getBody();
        return orderCsvRecord.getSalesChannel().equals("Offline");
    }
}
