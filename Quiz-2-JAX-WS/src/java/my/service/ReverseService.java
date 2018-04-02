/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author dhruvinparikh.byethost24.com
 */
@WebService(serviceName = "ReverseService")
@Stateless()
public class ReverseService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "reverseString")
    public String reverseString(@WebParam(name = "strStr") String strStr) {
        return new StringBuilder(strStr).reverse().substring(0);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "camelCase")
    public String camelCase(@WebParam(name = "strMessage") String strMessage) {
        //TODO write your implementation code here:
        String[] strArray = strMessage.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        
        for(int i = 0; i < strArray.length ; i++){
            stringBuffer.append(Character.toUpperCase(strArray[i].charAt(0))).append(strArray[i].substring(1)).append(" ");
        }
        return stringBuffer.toString().trim();
    }

   
}
