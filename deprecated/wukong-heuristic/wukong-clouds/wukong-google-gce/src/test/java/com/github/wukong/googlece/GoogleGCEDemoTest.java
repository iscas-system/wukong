package com.github.wukong.googlece;

import java.lang.reflect.Method;

import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;

import com.google.api.services.compute.Compute;
import com.google.api.services.compute.Compute.Instances;

public class GoogleGCEDemoTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		Compute client = null;
//		client.instances().start(null, null, null);
//		client.instances().delete(null, null, null);
//		client.instances().list(null, null);
//		client.instanceGroups().addInstances(null, null, null, null);
		Class<?> clazz = Class.forName(Instances.class.getName());
//		System.out.println(clazz.getName());
		for (Method method : clazz.getMethods()) {
			if (method.getName().equals("start")) {
				System.out.println(method.getParameterCount());
				ParameterNameDiscoverer pnd = new LocalVariableTableParameterNameDiscoverer();
				String[] filedNames = pnd.getParameterNames(method);
				System.out.println(filedNames);
			}
		}
	}

}
