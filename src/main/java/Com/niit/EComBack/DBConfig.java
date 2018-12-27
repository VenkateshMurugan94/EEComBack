package Com.niit.EComBack;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("Com.niit")
@EnableTransactionManagement
public class DBConfig 
{
	@Bean("datasource")
	DataSource dbConnect()
	{
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName("org.h2.Driver");
		d.setUrl("jdbc:h2:~/test");
		d.setUsername("sa");
		d.setPassword("sa");
		return d;
	}
	
	@Bean("myprop")
	Properties myDBProperties()
	{
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		return p;
		
	}
	
	
	@Bean("sessionfactory")
	LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
		lsfb.setDataSource(dbConnect());
		lsfb.setHibernateProperties(myDBProperties());
		lsfb.setPackagesToScan("Com.niit.EComBack.model");
		return lsfb;
	}
	
	@Autowired
	@Bean
	HibernateTransactionManager manager(SessionFactory sessionfactory)
	{
		HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory(sessionfactory);
		return htm;
	}

}
