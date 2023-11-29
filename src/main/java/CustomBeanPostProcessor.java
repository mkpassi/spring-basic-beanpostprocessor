import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * CustomBeanPostProcessor implements BeanPostProcessor and overrides its two methods:  postProcessBeforeInitialization and postProcessAfterInitialization.
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {


	/**
	 * postProcessBeforeInitialization is called before any initialization method (initMethod, @PostConstruct, afterPropertiesSet) is called.
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("postProcessBeforeInitialization on " + bean.getClass().getSimpleName());
		return bean;
	}

	/**
	 * postProcessAfterInitialization is called after any initialization method (initMethod, @PostConstruct, afterPropertiesSet) is called.
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("postProcessAfterInitialization on " + bean.getClass().getSimpleName());
		return bean;
	}

}
