# HttpSessionListener Test

This is a small project for testing the functionality of an HttpSessionListener for sessions shared across different WARs in a single EAR, see also https://issues.jboss.org/browse/WFLY-10630

To deploy in a WildFly instance (version 8.2.0 or above), define a security-domain with the name "sessionlistener".

Then, after deployment of the built EAR, connect to http://[SERVER]:[PORT]/sessionlistener/test in your browser to login in. After login, press the "Logout" link to logout.

There are two HttpSessionListener: one in the UI WAR (which provides the login page and the initial web page), and one in the AJAX WAR (which is called when clicking the "Logout" link, and calls HttpSession.invalidate() in turn). In WildFly 13, only one of these two listeners is invoked by session creation (in the UI WAR) and destruction (in the AJAX WAR).
