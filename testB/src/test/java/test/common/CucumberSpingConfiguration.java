package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.TestBApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { TestBApplication.class })
public class CucumberSpingConfiguration {}
