package com.example.demo_batch.config;

import com.example.demo_batch.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class StudentItemProcessor implements ItemProcessor<Student, Student> {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentItemProcessor.class);

    @Override
    public Student process(final Student information) throws Exception {
        LOGGER.info("Converting ( {} ) into ( {} )", information, information);
        information.setLastname(information.getLastname().toUpperCase());
        information.setFirstname(information.getFirstname().toUpperCase());
        return information;
    }
}
