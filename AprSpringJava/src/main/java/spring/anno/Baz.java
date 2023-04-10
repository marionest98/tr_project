package spring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Baz {
	
	@Bean(name = "foo1") //return한 객체를 bean으로 등록 여기서는 Foo타입의 f
	public Foo getFoo() {
		Foo f = new Foo();
		return f;
	}
}