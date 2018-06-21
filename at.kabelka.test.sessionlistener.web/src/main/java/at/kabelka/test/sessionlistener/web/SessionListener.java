package at.kabelka.test.sessionlistener.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.jboss.logging.Logger;

/**
 * Listen for session creation/destruction.
 * 
 * @author bernhard.kabelka
 */
@WebListener
public class SessionListener implements HttpSessionListener
{

    private static final Logger LOGGER = Logger.getLogger( SessionListener.class );
    
    @Override
    public void sessionCreated( HttpSessionEvent e )
    {
        LOGGER.infov( "Session {0} created", e.getSession().getId() ); //$NON-NLS-1$
    }

    @Override
    public void sessionDestroyed( HttpSessionEvent e )
    {
        LOGGER.infov( "Session {0} destroyed", e.getSession().getId() ); //$NON-NLS-1$
    }
    
}
