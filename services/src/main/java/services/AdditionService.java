package services;


import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

/**
 * Created by wadi chemkhi on 08/02/14.
 * Email : wadi.chemkhi@gmail.com
 */
@WebService(targetNamespace="http://ppp.gl4.insat.tn/sevices/addition-service")
public interface AdditionService {
	@RequestWrapper(localName = "addRequest")
    Integer add(Integer a,Integer b);
}
