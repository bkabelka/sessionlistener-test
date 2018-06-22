package at.kabelka.test.sessionlistener.war.ui;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Simple web service.
 * 
 * @author bernhard.kabelka
 */
@Path( "/" )
public class WebService
{
    
    @GET
    @Produces( MediaType.TEXT_HTML )
    @Path( "login/form" )
    @SuppressWarnings( "nls" )
    public Response loginForm( @Context HttpServletRequest request )
    {
        return Response.ok( "<!DOCTYPE html>" + 
                "<html>" + 
                "<head>" + 
                "    <title>Login Page</title>" + 
                "</head>" + 
                "<body>" + 
                "<h2>Hello, please log in:</h2>" + 
                "<form action=\"j_security_check\" method=post>" + 
                "    <p><strong>Please Enter Your User Name: </strong>" + 
                "    <input type=\"text\" name=\"j_username\" size=\"25\">" + 
                "    <p><p><strong>Please Enter Your Password: </strong>" + 
                "    <input type=\"password\" size=\"15\" name=\"j_password\">" + 
                "    <p><p>" + 
                "    <input type=\"submit\" value=\"Submit\">" + 
                "    <input type=\"reset\" value=\"Reset\">" + 
                "</form>" + 
                "</body>" + 
                "</html>" ).build(); //$NON-NLS-1$
    }
    
    @GET
    @Produces( MediaType.TEXT_HTML )
    @Path( "login/error" )
    @SuppressWarnings( "nls" )
    public Response loginError( @Context HttpServletRequest request )
    {
        return Response.ok( "<!DOCTYPE html>" + 
                "<html>" + 
                "<head>" + 
                "    <title>Login Error</title>" + 
                "</head>" + 
                "<body>" + 
                "    <h2>Invalid user name or password.</h2>" + 
                "" + 
                "    <p>Please enter a user name or password that is authorized to access this " + 
                "    application. Click here to <a href=\"form\">Try Again</a></p>" + 
                "</body>" + 
                "</html>" ).build(); //$NON-NLS-1$
    }
    
    @GET
    @Produces( MediaType.TEXT_HTML )
    @Path( "test" )
    public Response testPage( @Context HttpServletRequest request )
    {
        return Response.ok( "<html><a href=\"../../sessionlistener-ajax/logout\">Logout</a></html>" ).build(); //$NON-NLS-1$
    }
    
}
