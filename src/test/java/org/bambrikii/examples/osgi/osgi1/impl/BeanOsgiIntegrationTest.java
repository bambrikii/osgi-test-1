package org.bambrikii.examples.osgi.osgi1.impl;

import org.springframework.osgi.test.AbstractConfigurableBundleCreatorTests;

/**
 * OSGi integration test (inside OSGi).
 *
 * @see AbstractConfigurableBundleCreatorTests
 */
public class BeanOsgiIntegrationTest extends AbstractConfigurableBundleCreatorTests {

	protected String[] getConfigLocations() {
		return new String[]{"META-INF/spring/*.xml"};
	}

	public void testOsgiBundleContext() {
		//	  Assert.assertNotNull(bundleContext);
	}

}
