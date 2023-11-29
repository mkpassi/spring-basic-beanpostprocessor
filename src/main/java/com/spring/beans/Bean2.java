package com.spring.beans;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

public class Bean2 implements DisposableBean {

	/**
	 * @PreDestroy is the JSR-250 annotation that marks a method to be called on, when the bean is removed from the container.
	 */
	@PreDestroy
	public void preDestroy() {
		System.out.println(getClass().getSimpleName() + "::preDestroy");
	}

	/**
	 * DisposableBean is a callback interface, it has only one method destroy().
	 *
	 * @throws Exception
	 */

	@Override
	public void destroy() throws Exception {
		System.out.println(getClass().getSimpleName() + "::destroy");
	}

	/**
	 * destroyMethod is called after the destroy() method.
	 */
	public void destroyMethod() {
		System.out.println(getClass().getSimpleName() + "::destroyMethod");
	}

}
