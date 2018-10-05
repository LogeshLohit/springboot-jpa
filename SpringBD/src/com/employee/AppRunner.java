package com.employee;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages={"com.employee"})
public class AppRunner {

	public static void main(String[] args) {
	/*	Calendar startMonth =Calendar.getInstance();
		startMonth.set(Calendar.DAY_OF_MONTH, 1 );
		startMonth.set(Calendar.HOUR_OF_DAY, 0 );
		startMonth.set(Calendar.MINUTE, 0 );
		startMonth.set(Calendar.SECOND, 0 );
		System.out.println(startMonth.getTime());
		*/
		// TODO Auto-generated method stub
		SpringApplication.run(AppRunner.class, args);
		/*SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();*/
//		public List<Employee> getAllEmployees() {
		/*	Session session = factory.openSession();
			System.out.println("99");
			//session.beginTransaction();
			Integer empId = 3;
			session.beginTransaction();
			Employee employee = session.get(Employee.class, empId.intValue());
			System.out.println(employee);
			session.getTransaction().commit();*/
			
			/*Employee emp = session.get(Employee.class, 3);
			System.out.println(emp);
			*///session.getTransaction().commit();
			
			//Insert works fine
		

		/*
		 * return employees;
		 * 
		 * }
		 */
	}

}
