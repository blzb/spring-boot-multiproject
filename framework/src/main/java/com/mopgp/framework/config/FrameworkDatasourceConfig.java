package com.mopgp.framework.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by apimentel on 7/26/16.
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.mopgp.framework", "com.mopgp.ejemplo2"}, entityManagerFactoryRef = "entityManager", transactionManagerRef = "transactionManager")
public class FrameworkDatasourceConfig {

    @Bean(name = "dataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource frameworkDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name ="entityManager")
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManager(EntityManagerFactoryBuilder builder){
        Set<String> packageNames = getPackages();
        return builder.dataSource(frameworkDataSource()).persistenceUnit("primary")
            .packages(packageNames.toArray(new String[packageNames.size()])).build();
    }

    private Set<String> getPackages() {
        Package[] packages = Package.getPackages();
        Set<String> packageNames = new HashSet<>();
        for(Package pack: packages){
            String name = pack.getName();
            if(name.startsWith("com.mopgp")) {
                String[] nameParts = name.split("\\.");
                if (nameParts.length >= 3 && !nameParts[2].equalsIgnoreCase("reticula")) {
                    packageNames.add(String.join(".", Arrays.copyOfRange(nameParts, 0, 3)));
                }
            }

        }
        return packageNames;
    }
}
