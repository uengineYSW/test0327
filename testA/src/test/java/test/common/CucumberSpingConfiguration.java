package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.TestAApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { TestAApplication.class })
public class CucumberSpingConfiguration {}
