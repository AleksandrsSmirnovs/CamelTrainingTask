package task.training.cameltraining.converter;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component
public class TestBeanPredicate {
    public boolean testBeanPredicate(Exchange exchange) {
        return exchange.getIn().getBody().toString().contains("Russia");
    }
}
