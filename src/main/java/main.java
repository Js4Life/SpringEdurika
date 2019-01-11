import employee.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.HelloWorld;

public class main {
    public static void main(String[] args) {

      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld1");
//
//        obj.getMessage();
//
//
//        Employee employee = new Employee();
//        employee.setEid(101);
//        employee.setEname("raghu");
//        employee.setEaddress("india");

 //       System.out.println(employee);

//        Resource resource = new ClassPathResource("Beans.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);

        Employee e1 = (Employee) context.getBean("emp1");
    //    Employee e2 = factory.getBean("emp2",Employee.class);

        System.out.println("emp1 details : " + e1);
     //   System.out.println("emp2 details : " + e2);

        ClassPathXmlApplicationContext cxt =(ClassPathXmlApplicationContext) context;
        cxt.close(); // close the context


    }
}
