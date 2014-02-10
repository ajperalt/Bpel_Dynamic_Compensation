package services.impl;

import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

import services.AdditionService;

/**
 * Created by wadi chemkhi on 08/02/14.
 * Email : wadi.chemkhi@gmail.com
 */
@WebService(endpointInterface = "services.AdditionService")
public class AdditionServiceImpl implements AdditionService {

    @Override
    @RequestWrapper(localName = "addRequest")
    public Integer add( Integer a,  Integer b) {
        return a+b;
    }
}
