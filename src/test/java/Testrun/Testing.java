package Testrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;






@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",

glue="Step",
monochrome =true,
snippets =SnippetType.CAMELCASE,
tags ="@Hotel"




)








public class Testing {

}
