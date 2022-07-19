package taxi.web.filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationFilter implements Filter {
    private Set<String> ALLOWED_URLS = new HashSet<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ALLOWED_URLS.add("/login");
        ALLOWED_URLS.add("/drivers/add");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();

        Long driverId = (Long) session.getAttribute("driver_id");
        if (driverId == null && ALLOWED_URLS.contains(req.getServletPath())) {
            chain.doFilter(req, resp);
            return;
        }

        if (driverId == null) {
            resp.sendRedirect(req.getContextPath() + "/login");
            return;
        }

        chain.doFilter(req, resp);
    }
}
