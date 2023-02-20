package com.madhu.listener;

import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import org.apache.naming.java.javaURLContextFactory;

public class RequestDemoListener  implements ServletRequestListener {
	public static int count=0;

   static {
	   System.out.println("DemoListener .class file is loading....");
   }
    public RequestDemoListener() {
    	 System.out.println("DemoListener .class file is instantiated....");
    }
   
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	 System.out.println("requestDestroyed(ServletRequestEvent sre) called");
    }

	
    public void requestInitialized(ServletRequestEvent sre)  { 
    	count++;
    	System.out.println("request object created at"+new java.util.Date());
    	System.out.println("hit count of applicaton:"+count);
System.out.println("requestInitialized(ServletRequestEvent sre) called");    }
	
}
