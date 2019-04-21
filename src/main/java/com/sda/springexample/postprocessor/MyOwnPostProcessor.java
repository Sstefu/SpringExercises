package com.sda.springexample.postprocessor;

import com.sda.springexample.production.Worker;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyOwnPostProcessor implements BeanPostProcessor {
    private static final Log LOGGER = LogFactory.getLog(MyOwnPostProcessor.class);
    private final String postProcessBeforeInitializationMessage = "PostProcess is On!";
    private final String postProcessAfterInitialization = " PostProcess if OFF !";


    @Override
    public Object postProcessBeforeInitialization(Object bean, String myownpostprocessornName) throws BeansException {
        LOGGER.info(postProcessBeforeInitializationMessage);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String myownpostprocessor) throws BeansException {
        LOGGER.info(postProcessAfterInitialization);
        return bean;
    }

    @Override
    public String toString() {
        return "MyOwnPostProcessor{" +
                "postProcessBeforeInitializationMessage='" + postProcessBeforeInitializationMessage + '\'' +
                ", postProcessAfterInitialization='" + postProcessAfterInitialization + '\'' +
                '}';
    }
}
