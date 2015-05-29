package com.testing.citrus;

import org.testng.annotations.Test;

import com.consol.citrus.annotations.CitrusXmlTest;
import com.consol.citrus.testng.AbstractTestNGCitrusTest;

/**
 * This is a sample Citrus integration test using SOAP client and server.
 * @author Citrus
 */
@Test
public class HelloService_Ok_Test extends AbstractTestNGCitrusTest {

    @CitrusXmlTest(name = "HelloService_Ok_Test")
    public void helloServiceOkTest() {}
}
