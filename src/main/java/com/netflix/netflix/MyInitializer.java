package com.netflix.netflix;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public abstract class MyInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ SpringWebConfig.class };

    }
}


