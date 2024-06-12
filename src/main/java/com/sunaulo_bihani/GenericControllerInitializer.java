package com.sunaulo_bihani;

import com.sunaulo_bihani.controller.GenericController;
import com.sunaulo_bihani.model.BaseEntity;
import com.sunaulo_bihani.model.EnableGenericController;
import com.sunaulo_bihani.repository.GeneralJpaRepository;
import com.sunaulo_bihani.service.CommonService;
import com.sunaulo_bihani.service.impl.CommonServiceImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Component
public class GenericControllerInitializer implements ApplicationContextAware {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private GeneralJpaRepository<BaseEntity> generalJpaRepository;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
    this.applicationContext=applicationContext;
    }

    @PostConstruct
    public void postProcessAfterInitialization() throws BeansException {
        Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(EnableGenericController.class);

        for (Object beanInstance : beansWithAnnotation.values()) {
            if (beanInstance instanceof BaseEntity) {
                BaseEntity baseEntity = (BaseEntity) beanInstance;
                EnableGenericController annotation = baseEntity.getClass().getAnnotation(EnableGenericController.class);
                if (annotation != null) {
                    String path = annotation.path();
                    GenericController<BaseEntity> genericController = new GenericController<>(new CommonServiceImpl<>(generalJpaRepository));
                    // Configure the request mapping path for the generic controller
                    RequestMapping requestMapping = genericController.getClass().getAnnotation(RequestMapping.class);
                    if (requestMapping != null) {
                        String[] value = requestMapping.value();
                        if (value.length > 0) {
                            value[0] += path;
                        }
                    }
                }
            }
        }
    }
}
