package spittr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by 胡康 on 2018/5/26.
 */
@Configuration
@ImportResource(value = "classpath:beanConfig/properties.xml")
public class ImportConfig {

}
