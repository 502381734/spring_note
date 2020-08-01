package com.pack.bean;

import com.pack.configration.BaseClass;
import com.pack.controller.TestController;
import com.pack.dao.Dao;
import com.pack.service.TestService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.*;

import javax.annotation.*;

/**
 * @author Neo
 * @date 2020/3/11 21:13
 */
public class Animal implements InitializingBean, DisposableBean, ApplicationContextAware {

    @Value("${name}")
    private String name;

    private String weight;

    @Autowired
    private Dao dao;

    private TestController controller;

    @Autowired
    private TestService service;

    @Autowired
    private BaseClass baseClass;

    public Animal() {
        System.out.println("constructing....");
    }

    public Animal(TestController controller) {
        this.controller = controller;
    }

    public Animal(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public TestController getController() {
        return controller;
    }

    public void setController(TestController controller) {
        this.controller = controller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public TestService getService() {
        return service;
    }

    public void setService(TestService service) {
        this.service = service;
    }

    public BaseClass getBaseClass() {
        return baseClass;
    }

    public void setBaseClass(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }


    public void destroy() throws Exception {
        System.out.println("destroy......");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet....");
    }

    public void init() {
        System.out.println("init method....");
    }

    public void des() {
        System.out.println("destory method.....");
    }

    @PostConstruct
    public void postConstuct() {
        System.out.println("postConstuct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("predestory");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        return;
    }

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
