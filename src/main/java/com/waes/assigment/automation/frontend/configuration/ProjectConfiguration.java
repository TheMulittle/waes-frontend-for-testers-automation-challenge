package com.waes.assigment.automation.frontend.configuration;

import org.jbehave.web.selenium.PropertyWebDriverProvider;
import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.web.selenium.WebDriverScreenshotOnFailure;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.waes.assigment.automation.frontend"})
public class ProjectConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public WebDriverProvider webDriverProvider() {
        WebDriverProvider webDriverProvider = new PropertyWebDriverProvider();
        System.setProperty("browser", "chrome");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        return webDriverProvider;
    }

    @Bean
    public WebDriverScreenshotOnFailure screenshotOnFailure() {
        return new WebDriverScreenshotOnFailure(webDriverProvider());
    }

}
