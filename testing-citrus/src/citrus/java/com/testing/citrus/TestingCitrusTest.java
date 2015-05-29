package com.testing.citrus;

import org.springframework.core.io.ClassPathResource;
import org.testng.annotations.Test;

import com.consol.citrus.dsl.TestNGCitrusTestBuilder;
import com.consol.citrus.dsl.annotations.CitrusTest;

/**
 * This is a sample Citrus integration test using SOAP client and server.
 * 
 * @author Citrus
 */
@Test
public class TestingCitrusTest extends TestNGCitrusTestBuilder {

    ClassPathResource message = new  ClassPathResource("messages/common-message.xml");    
    ClassPathResource soapMessage = new  ClassPathResource("messages/soap-message.xml");


    @CitrusTest(name = "JMS_TEST")
    public void jmsTest() {

        echo("end JMS request message to queue destination");

        send("JmsInputEndpoint").payload(message);

        receive("JmsOutputEndpoint").payload(message);

    }

    @CitrusTest(name = "Rest_Test")
    public void restTest() {

        echo("end REST request message to queue destination");

        send("RestEndpoint").payload(message);

        receive("RestEndpoint").payload(message);

    }
    
    @CitrusTest(name = "Soap_Test")
    public void soapTest() {

        echo("end SOAP request message to queue destination");

        send("soapClient").payload(soapMessage);

        receive("soapClient").payload(soapMessage);

    }


}
