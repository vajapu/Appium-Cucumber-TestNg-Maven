package com.comcast.ucAppAutomation.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.Factory;
import org.testng.annotations.ITestAnnotation;
import com.comcast.ucAppAutomation.businessDrivenTesting.cucumberOptions.TestRunner;

public class TestNGParallelRunner{

	@Factory
	private Object[] createInstance() {
		// TODO Auto-generated method stub
		Object[] result=new Object[5];
		for(int i=0;i<5;i++){
			result[i]=new TestRunner();
		}
		return result;
	}

}
