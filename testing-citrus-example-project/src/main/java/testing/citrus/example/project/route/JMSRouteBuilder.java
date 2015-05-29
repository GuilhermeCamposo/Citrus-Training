package testing.citrus.example.project.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class JMSRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("jms:TESTING.CITRUS.JMS.INPUT")
        .process(new Processor() {
            
            @Override
            public void process(Exchange exchange) throws Exception {
                String incoming = exchange.getIn().getBody(String.class);
                
                exchange.getIn().setBody(incoming);
                exchange.getOut().setBody(incoming);;
            }
        })
        .inOnly("jms:TESTING.CITRUS.JMS.OUTPUT");

    }

}
