package spring.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnoMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("anno.xml");
		Foo foo = context.getBean("foo", Foo.class);
		foo.doFoo();
		
		Foo f1 = context.getBean("foo1", Foo.class);
		f1.doFoo();
		
		context.registerShutdownHook();
		
	}
}
