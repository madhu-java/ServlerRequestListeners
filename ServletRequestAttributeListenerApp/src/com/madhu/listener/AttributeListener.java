package com.madhu.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;


public class AttributeListener  implements ServletRequestAttributeListener {

	static {
		 System.out.println("servletRequestAttribute .class file is loading...");
	}
    public AttributeListener() {
        System.out.println("servletRequestAttribute .class file is instantiated...");
    }

	
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
    	 System.out.println(srae.getName()+"  attribute removed...");
    }

    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	System.out.println(srae.getName()+"  attribute added...");
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
    	System.out.println(srae.getName()+"  attribute replaced...");
    }
	
}
