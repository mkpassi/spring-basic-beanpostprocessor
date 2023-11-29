package com.spring.beans;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * Bean1 implements InitializingBean, InitializingBean is a callback interface, it has only one method afterPropertiesSet().
 * afterPropertiesSet() is called after all properties are set by Spring and after the postConstruct() method.
 * initMethod is initialized after afterPropertiesSet() and postConstruct().
 *
 */
public class Bean1 implements InitializingBean {

	/**
	 * postConstruct is called after the constructor and before afterPropertiesSet().
	 */
	@PostConstruct
	public void postConstruct() {
		System.out.println(getClass().getSimpleName() + "::postConstruct");
	}

	/**
	 * afterPropertiesSet is called after all properties are set by Spring and after the postConstruct() method.
	 */

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(getClass().getSimpleName() + "::afterPropertiesSet");
	}

	/**
	 * initMethod is initialized after afterPropertiesSet() and postConstruct().
	 */
	public void initMethod() {
		System.out.println(getClass().getSimpleName() + "::initMethod");
	}
}
