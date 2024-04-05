package com.loan.loanapp.security;

import java.util.function.Function;

//import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration// ----   contains no of beans ( we are creating no of beans )
public class SpringSecurityConfiguration {
// let's use InMemoryUserDetailsManager  --- constructor   takes UserDetails ( I ) as an argument 
// UserDetails is an Interface , hence we have a class User to build it

//	@Bean
//	public InMemoryUserDetailsManager createUserManager(){
//
//		UserDetails userDetails=User.withDefaultPasswordEncoder().   // withDefaultPasswordEncoder is deprecated -- 
//					username("Admin").
//					password("123").
//					roles("USER","ADMIN").
//					build();
//				return new InMemoryUserDetailsManager(userDetails);
//	} // first try the above , then the following
	
	@Bean
	public InMemoryUserDetailsManager createUserManager(){
			// lambda function --- takes string as input , encodes it and gives enoded string as output 
			Function<String,String> passwordEncoder = input->passwordEncoder().encode(input);
//		Function<String, String> passwordEncoder;
//		UserDetails userDetails = User.builder().passwordEncoder(passwordEncoder)		
		UserDetails userDetails = User.builder().passwordEncoder(passwordEncoder) // create a local variable ( lambda )after entering the passwordEncoder argument
								.username("Admin")
								.password("123")
								.roles("USER","ADMIN")
								.build();
//		
		return new InMemoryUserDetailsManager(userDetails);
		}

		@Bean
		public PasswordEncoder passwordEncoder(){
				return new BCryptPasswordEncoder();//Encrypt class that encrypts the incoming  input
			}
}
