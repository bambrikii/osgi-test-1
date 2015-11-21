package org.bambrikii.examples.osgi.osgi1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by Alexander Arakelyan on 15/11/15.
 */

public class Activator implements BundleActivator {
	//	ServiceTracker httpServiceTracker;

	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
		//		httpServiceTracker = new HttpServiceTracker(context);
		//		httpServiceTracker.open();
	}

	//
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
		//		httpServiceTracker.close();
		//		httpServiceTracker = null;
	}
}
