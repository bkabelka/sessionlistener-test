package at.kabelka.test.sessionlistener.war.ui;

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
public class UISessionListener implements HttpSessionListener
{

    private static final Logger LOGGER = Logger.getLogger( UISessionListener.class );
    
    @Override
    public void sessionCreated( HttpSessionEvent e )
    {
        LOGGER.infov( "[UI] Session {0} created", e.getSession().getId() ); //$NON-NLS-1$
    }

    @Override
    public void sessionDestroyed( HttpSessionEvent e )
    {
        LOGGER.infov( "[UI] Session {0} destroyed", e.getSession().getId() ); //$NON-NLS-1$
    }
    
}
