package org.pensatocode.sample.application;

import org.pensatocode.sample.HelloResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class MyJerseyApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(HelloResource.class);
        return classes;
    }
}
