package com.example.importOtherConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig2.class})
public class Appconfig1 {

}
