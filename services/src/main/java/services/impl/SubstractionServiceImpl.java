package services.impl;

/**
 * Created by wadi chemkhi on 08/02/14.
 * Email : wadi.chemkhi@gmail.com
 */

import services.SubstractionService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "services.SubstractionService")
public class SubstractionServiceImpl implements SubstractionService {

    @Override
    @WebMethod
    public Integer substract(@WebParam Integer a, @WebParam Integer b) {
        return a-b;
    }
}
