package at.kabelka.test.sessionlistener.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Simple web service
 * 
 * @author bernhard.kabelka
 */
@Path( "/" )
public class WebService
{
    
    @GET
    @Produces( MediaType.TEXT_HTML )
    @Path( "login/form" )
    public Response loginForm( @Context HttpServletRequest request )
    {
        return Response.ok( "<!DOCTYPE html>\r\n" + 
                "<html>\r\n" + 
                "<head>\r\n" + 
                "    <title>Login Page</title>\r\n" + 
                "</head>\r\n" + 
                "<body>\r\n" + 
                "<h2>Hello, please log in:</h2>\r\n" + 
                "<form action=\"j_security_check\" method=post>\r\n" + 
                "    <p><strong>Please Enter Your User Name: </strong>\r\n" + 
                "    <input type=\"text\" name=\"j_username\" size=\"25\">\r\n" + 
                "    <p><p><strong>Please Enter Your Password: </strong>\r\n" + 
                "    <input type=\"password\" size=\"15\" name=\"j_password\">\r\n" + 
                "    <p><p>\r\n" + 
                "    <input type=\"submit\" value=\"Submit\">\r\n" + 
                "    <input type=\"reset\" value=\"Reset\">\r\n" + 
                "</form>\r\n" + 
                "</body>\r\n" + 
                "</html>\r\n" ).build(); //$NON-NLS-1$
    }
    
    @GET
    @Produces( MediaType.TEXT_HTML )
    @Path( "login/error" )
    public Response loginError( @Context HttpServletRequest request )
    {
        return Response.ok( "<!DOCTYPE html>\r\n" + 
                "<html>\r\n" + 
                "<head>\r\n" + 
                "    <title>Login Error</title>\r\n" + 
                "</head>\r\n" + 
                "<body>\r\n" + 
                "    <h2>Invalid user name or password.</h2>\r\n" + 
                "\r\n" + 
                "    <p>Please enter a user name or password that is authorized to access this \r\n" + 
                "    application. For this application, this means a user that has been created in the \r\n" + 
                "    <code>file</code> realm and has been assigned to the <em>group</em> of \r\n" + 
                "    <code>TutorialUser</code>.  Click here to <a href=\"form\">Try Again</a></p>\r\n" + 
                "</body>\r\n" + 
                "</html>\r\n" ).build(); //$NON-NLS-1$
    }
    
    @GET
    @Produces( MediaType.TEXT_HTML )
    @Path( "service/test" )
    public Response testPage( @Context HttpServletRequest request )
    {
        return Response.ok( "<html><a href=\"../../sessionlistener-web/logout\">Logout</a></html>" ).build(); //$NON-NLS-1$
    }
    
}
