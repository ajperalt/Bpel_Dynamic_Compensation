package services;

import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

/**
 * Created by wadi chemkhi on 08/02/14.
 * Email : wadi.chemkhi@gmail.com
 */
@WebService(targetNamespace="http://ppp.gl4.insat.tn/sevices/substraction-service")
public interface SubstractionService {
	@RequestWrapper(localName = "substractRequest")
    Integer substract(Integer a, Integer b);
}
