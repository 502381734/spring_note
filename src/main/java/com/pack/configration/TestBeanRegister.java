package com.pack.configration;

import com.pack.bean.TestImport;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.*;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Neo
 * @date 2020/3/11 22:59
 */
public class TestBeanRegister implements ImportBeanDefinitionRegistrar {
    public TestBeanRegister() {
    }

    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                        BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinition beanDefinition = new RootBeanDefinition(TestImport.class);
        beanDefinitionRegistry.registerBeanDefinition("testimportclass",beanDefinition);
    }
}
