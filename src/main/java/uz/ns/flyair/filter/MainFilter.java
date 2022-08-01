package uz.ns.flyair.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebFilter(urlPatterns = "/*")
public class MainFilter implements Filter {

    public static final List<String> WHITE_LIST = List.of(
            "/signUp",
            "/login",
            "/"
    );

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        String method = request.getMethod();
        String req = request.getRequestURI();

        if(WHITE_LIST.contains(req)){
            filterChain.doFilter(request, response);
        }else {
            response.sendRedirect("/signUp");
        }

    }

    @Override
    public void destroy() {
    }
}
