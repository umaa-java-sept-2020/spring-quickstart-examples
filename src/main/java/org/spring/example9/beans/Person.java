package org.spring.example9.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Person implements InitializingBean, DisposableBean {

    private String name;

    public Person() {
        name = "john";
        System.out.println("cons executed." + this.getClass());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("person name: "+name);
        System.out.println("after properties set: " + this.getClass());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("pre-destroy :" + this.getClass());
    }
}
