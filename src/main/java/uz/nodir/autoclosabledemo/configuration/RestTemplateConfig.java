package uz.nodir.autoclosabledemo.configuration;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: PC
 * @date: 16.02.2025
 * @group: DavrCoders
 **/

@Configuration
@Slf4j
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        var rt = new RestTemplateBuilder()
                .build();

        log.info("Build new rest template: {}", rt);
        return rt;
    }
}
