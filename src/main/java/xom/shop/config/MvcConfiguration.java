/*
package xom.shop.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration

@ComponentScan(basePackages = "xom.shop")

@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	DataSource jdbctemplet;

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	 * @Bean public HibernateTemplate getHibernatrTemplet() { HibernateTemplate temp
	 * = new HibernateTemplate(); temp.setSessionFactory( getSessionFactory());
	 * 
	 * return temp; }
	 

	@Bean
	public JdbcTemplate getJdbcTemplet() {
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());

		return temp;
	}

	
	 * @Bean private SessionFactory getSessionFactory() { SessionFactory session =
	 * new LocalSessionFactoryBean()
	 * 
	 * return session; }
	 

	@Bean
	public LocalSessionFactoryBean hibernateSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setHibernateProperties(additionalProperties());

		return sessionFactory;
	}

	public Properties additionalProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.setProperty("connection.autoReconnect", "true");
		properties.setProperty("connection.autoReconnectForPools", "true");
		properties.setProperty("connection.is-connection-validation-required", "true");
		properties.setProperty("cglib.use_reflection_optimizer", "true");

		return properties;
	}

	
	 * @Bean private SessionFactory getSessionFactory() { SessionFactory anobean =
	 * return anobean; }
	 
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource drivManeger = new DriverManagerDataSource("jdbc:mysql://localhost:3308/Shop_biz_cart",
				"root", "ased");
		drivManeger.setDriverClassName("com.mysql.jdbc.Driver");
		DataSource data = drivManeger;
		return data;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}
*/