package spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {
	@Autowired
	Bar bar;
	
	public void doFoo() {
		System.out.println("Foo.doFoo() 실행");
		bar.doBar();
	}

	/*
	 * public void setBar(Bar bar) { this.bar = bar; }
	 */
	
	
}
