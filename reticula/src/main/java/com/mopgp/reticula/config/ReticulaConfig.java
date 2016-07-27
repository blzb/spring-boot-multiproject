package com.mopgp.reticula.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by apimentel on 7/26/16.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.mopgp.reticula", entityManagerFactoryRef = "reticulaEntityManager")
public class ReticulaConfig {

    @Bean(name="reticulaDataSource")
    @ConfigurationProperties(prefix="reticula.datasource")
    public DataSource reticulaDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name ="reticulaEntityManager")
    public LocalContainerEntityManagerFactoryBean reticulaEntityManager(EntityManagerFactoryBuilder builder){
        Map<String, Object> properties = new HashMap<>();
        properties.put("generate-ddl", "true");
        properties.put("hibernate.ddl-auto", "update");
        properties.put("hibernate.hbm2ddl.auto", "update");
        return builder.dataSource(reticulaDataSource()).persistenceUnit("reticula")
            .packages("com.mopgp.reticula").properties(properties).build();
    }
}
