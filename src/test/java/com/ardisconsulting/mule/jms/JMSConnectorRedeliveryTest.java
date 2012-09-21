package com.ardisconsulting.mule.jms;

import org.junit.Test;
import org.mule.module.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;


public class JMSConnectorRedeliveryTest extends FunctionalTestCase {
	private static final boolean TEST = true;

	@Override
	protected String getConfigResources() {
		String configResources = null;

		if (TEST) {
			configResources = "mule-config.xml";
		} else {
			configResources = "";
		}

		return configResources;
	}

	@Test
	public void testRedelivery() throws Exception {
		if (TEST) {
			MuleClient muleClient = new MuleClient(muleContext);

			Thread.sleep(60000);
		}
	}
}
