package at.kabelka.test.sessionlistener.war.ajax;

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
public class AjaxSessionListener implements HttpSessionListener
{

    private static final Logger LOGGER = Logger.getLogger( AjaxSessionListener.class );
    
    @Override
    public void sessionCreated( HttpSessionEvent e )
    {
        LOGGER.infov( "[AJAX] Session {0} created", e.getSession().getId() ); //$NON-NLS-1$
    }

    @Override
    public void sessionDestroyed( HttpSessionEvent e )
    {
        LOGGER.infov( "[AJAX] Session {0} destroyed", e.getSession().getId() ); //$NON-NLS-1$
    }
    
}
