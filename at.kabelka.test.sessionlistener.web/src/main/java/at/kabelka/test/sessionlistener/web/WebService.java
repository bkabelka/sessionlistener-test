package at.kabelka.test.sessionlistener.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
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
    @Path( "logout" )
    public Response logout( @Context HttpServletRequest request )
    {
        // invalidate local session
        HttpSession session = request.getSession( false );
        if ( session != null )
        {
            session.invalidate();
        }
        
        return Response.ok().build();
    }
    
}
