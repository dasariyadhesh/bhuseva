package com.bhuseva.backend.security;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * Author: Yadhesh DG © Bhuseva Public Charitable Trust
 */
@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
	        throws ServletException, IOException {

	    String path = request.getRequestURI();
	    if (path.startsWith("/api/auth/")) {
	        // Skip JWT validation for auth endpoints like login/register
	        chain.doFilter(request, response);
	        return;
	    }

	    String header = request.getHeader("Authorization");
	    String token = null;
	    String email = null;

	    if (header != null && header.startsWith("Bearer ")) {
	        token = header.substring(7);
	        email = jwtUtil.extractUsername(token);
	    }

	    if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
	        var userDetails = userDetailsService.loadUserByUsername(email);
	        if (jwtUtil.validateToken(token)) {
	            var auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
	            auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	            SecurityContextHolder.getContext().setAuthentication(auth);
	        }
	    }
	    chain.doFilter(request, response);
	}

}
