package kr.co.pcninc.ecoes.api.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
/*멀티DB사용시 mapper클래스파일 스켄용 basePackages를 DB별로 따로설정*/
@MapperScan(basePackages = "kr.co.pcninc.ecoes.api.mappers", sqlSessionFactoryRef = "db1SqlSessionFactory")
public class DataBaseConfig {

    @Primary
    @Bean(name = "db1DataSource")
    @ConfigurationProperties(prefix = "spring.db1.datasource")
    public DataSource db1DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "db1SqlSessionFactory")
    public SqlSessionFactory db1SqlSessionFactory(@Qualifier("db1DataSource") DataSource dataSource,
                                                  ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(applicationContext.getResources("classpath:mybatis/mapper/**/*.xml"));
        return sessionFactory.getObject();
    }

    @Primary
    @Bean(name="db1SqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory db1sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(db1sqlSessionFactory);
    }

    @Primary
    @Bean(name = "db1transactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("db1DataSource") DataSource db1DataSource) {
        return new DataSourceTransactionManager(db1DataSource);
    }
}
