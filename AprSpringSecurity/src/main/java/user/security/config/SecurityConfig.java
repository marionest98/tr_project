package user.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig{
	
	@Autowired
	private BoardUserDetailsService boardUserDetailsService;

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
		
		security.authorizeHttpRequests()
        .requestMatchers("/member/**").authenticated()
        .requestMatchers("/manager/**").hasAnyRole("MANAGER", "ADMIN")
        .requestMatchers("/admin/**").hasRole("ADMIN")
        .anyRequest().permitAll()
        .and().formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess", true)
        .and().exceptionHandling().accessDeniedPage("/accessDenied")
        .and().logout().invalidateHttpSession(true).logoutSuccessUrl("/login");
		
		security.userDetailsService(boardUserDetailsService);
		security.csrf().disable();
		
		return security.build();
	}
	
	@Bean 
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	/*
	 * @Autowired public void authenticate(AuthenticationManagerBuilder auth) throws
	 * Exception {
	 * auth.inMemoryAuthentication().withUser("manager").password("{noop}manager123"
	 * ).roles("MANAGER");
	 * 
	 * auth.inMemoryAuthentication().withUser("admin").password("{noop}admin123").
	 * roles("ADMIN"); }
	 */
	
}
