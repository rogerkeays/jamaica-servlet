package jamaica.servlet;

import jamaica.core.testing.TestGrouper.NetworkLayer;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class get_cookie_value implements NetworkLayer {
    
    /**
     * Fetch a request cookie by name or return null if it is not found.
     * This function returns the first cookie with the matching name.
     */
    public static String get_cookie_value(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for(int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (name.equals(cookie.getName())) {
                    return(cookie.getValue());
                }
            }
        }
        return null;
    }
}
