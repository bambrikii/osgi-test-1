package org.bambrikii.examples.osgi.osgi1.impl;

import junit.framework.TestCase;
import org.bambrikii.examples.osgi.osgi1.Bean;

public class BeanImplTest extends TestCase {

	public void testBeanIsABean() {
		Bean aBean = new BeanImpl();
		assertTrue(aBean.isABean());
	}

}
