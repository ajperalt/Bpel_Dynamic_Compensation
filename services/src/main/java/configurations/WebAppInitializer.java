package configurations;

/**
 * Created by wadi chemkhi on 15/01/14. Email : wadi.chemkhi@gmail.com
 */
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;



public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		servletContext.addListener(new ContextLoaderListener(
				createWebAppContext()));
		addApacheCxfServlet(servletContext);
	}

	private void addApacheCxfServlet(ServletContext servletContext) {
		ServletRegistration.Dynamic appServlet = servletContext.addServlet(
				"CXFServlet", CXFServlet.class);
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/services/*");
	}

	private WebApplicationContext createWebAppContext() {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(WebConfiguration.class);
		return appContext;
	}
}