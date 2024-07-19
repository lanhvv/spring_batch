package com.example.demo_batch.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Component
public class Listener extends JobExecutionListenerSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    @Override
    public void afterJob(JobExecution jobExecution) {
        LOGGER.info("dmm");
    }
}
