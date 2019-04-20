package com.sda.springexample.config;

import com.sda.springexample.production.WorkerMotto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.misc.Contended;

@Configuration
public class WorkerConfig {

    @Bean
    public WorkerMotto workerMotto()
    {

        return new WorkerMotto("A new way of thinking");
    }

}
