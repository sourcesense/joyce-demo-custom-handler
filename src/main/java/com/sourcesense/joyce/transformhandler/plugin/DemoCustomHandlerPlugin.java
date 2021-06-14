package com.sourcesense.joyce.transformhandler.plugin;

import lombok.extern.slf4j.Slf4j;
import org.pf4j.PluginWrapper;
import org.pf4j.spring.SpringPlugin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class DemoCustomHandlerPlugin extends SpringPlugin {

    public DemoCustomHandlerPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        log.info("Successfully loaded custom handler plugin!");
    }

    @Override
    public void stop() {
        log.info("Successfully stopped custom handler plugin!");
    }

    @Override
    protected ApplicationContext createApplicationContext() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.setClassLoader(this.getWrapper().getPluginClassLoader());
        applicationContext.refresh();
        return applicationContext;
    }
}
