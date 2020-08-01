package com.pack.configration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.pack.bean.*;
import com.pack.controller.TestController;
import com.pack.myinterface.BaseConfigImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author Neo
 * @date 2020/3/11 21:08
 */
@Configuration
@ComponentScan(value = "com.pack")
@PropertySource("classpath:/test.properties")
@Import({TestBeanRegister.class, ImportedConfig.class, BaseConfig.class})
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class BeanConfig implements BaseConfigImporter {

    private ApplicationContext context;

    @Bean(initMethod = "init",destroyMethod = "des")
    @Scope("singleton")
    public Animal singletonAnimal(@Autowired TestController controller){
        return new Animal(controller);
    }

    @Bean(initMethod = "init",destroyMethod = "des")
    @Scope("prototype")
//    @Primary
    public Animal prototypeAnimal(@Autowired TestController controller){
        return new Animal(controller);
    }

    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/blog?3useUnicode=true&characterEncoding=utf8");
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public MathCaculator mathCaculator(){
        return new MathCaculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }

    public BeanConfig() {
    }

    @Override
    public BaseConfig baseConfig() {
        return new BaseConfig();
    }


    //    @Configuration
    public class NestedConfig{

    }

}
