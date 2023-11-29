import com.spring.beans.Bean1;
import com.spring.beans.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.spring.beans")
public class AppConfiguration {

	/**
	 * This is a static method that returns a CustomBeanPostProcessor object.
	 * @return
	 */
	@Bean
	public static CustomBeanPostProcessor customBeanPostProcessor() {
		return new CustomBeanPostProcessor();
	}

	/**
	 * This is a method that returns a Bean1 object.
	 * initMethod is called afterPropertiesSet() and postConstruct().
	 * @return
	 */
	@Bean(initMethod = "initMethod")
	public Bean1 bean1() {
		return new Bean1();
	}

	/**
	 * This is a method that returns a Bean2 object.
	 * destroyMethod is called destroyMethod() after destroy() and preDestroy().
	 * @return
	 */
	@Bean(destroyMethod = "destroyMethod")
	public Bean2 bean2() {
		return new Bean2();
	}

}
