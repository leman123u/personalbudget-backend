package springaz.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class SecurityConfig {
	
	
	 @Bean
	  SecurityFilterChain security(HttpSecurity http) throws Exception {
	    // CORS
	    CorsConfiguration cfg = new CorsConfiguration();
	  
	    cfg.setAllowedOriginPatterns(List.of(
	        "http://localhost:3000",
	        "http://127.0.0.1:3000",
	        "http://172.*.*.*:3000",      // Next.js local network URL
	        "http://localhost:3001",      // ehtiyat port
	        "http://127.0.0.1:3001"
	    ));
	    cfg.setAllowedMethods(List.of("GET","POST","PUT","PATCH","DELETE","OPTIONS"));
	    cfg.setAllowedHeaders(List.of("Authorization","Content-Type","Accept","Origin","X-Requested-With"));
	    cfg.setExposedHeaders(List.of("Location","Authorization")); 
	    cfg.setAllowCredentials(true);

	    UrlBasedCorsConfigurationSource src = new UrlBasedCorsConfigurationSource();
	    src.registerCorsConfiguration("/**", cfg);

	    http
	      .csrf(csrf -> csrf.disable())
	      .cors(c -> c.configurationSource(src))
	      .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
	      .formLogin(f -> f.disable())
	      .httpBasic(b -> b.disable())
	      .authorizeHttpRequests(auth -> auth
	      
	        .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()


	        .requestMatchers("/v3/api-docs/**","/swagger-ui/**","/swagger-ui.html").permitAll()

	       
	        .requestMatchers(HttpMethod.GET, "/api/v1/projects/**").permitAll()
	        .requestMatchers(HttpMethod.GET, "/api/v1/blogs/**").permitAll()
	        .requestMatchers(HttpMethod.POST, "/api/v1/contact/**").permitAll()
	        .requestMatchers(HttpMethod.POST, "/auth/login", "/api/v1/auth/login").permitAll()

	        
	        .anyRequest().permitAll()
	      );

	    return http.build();
	  }
	}
	  
	
	
	


	
	

   

    

   




