/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg2.jax.client;

import java.util.Scanner;

/**
 *
 * @author dhruvinparikh.byethost24.com
 */
public class Quiz2JAXClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter a string to reverse : ");
        Scanner read = new Scanner(System.in);
        String myStr = read.nextLine();
        try{
            System.out.println("Reversed string : " + reverseString(myStr));
        }
        catch(Exception ex){
            System.err.println("Exception : " + ex.getMessage());
        }
        read = new Scanner(System.in);
        System.out.println("Enter a sentence to capitalise first letter of each word : ");
        myStr = read.nextLine();
        try{
            System.out.println("Camel case string : " + camelCase(myStr));
        }catch(Exception ex){
            System.err.println("Exception : " + ex.getMessage());
        }
    }

    private static String camelCase(java.lang.String strMessage) {
        my.client.ReverseService_Service service = new my.client.ReverseService_Service();
        my.client.ReverseService port = service.getReverseServicePort();
        return port.camelCase(strMessage);
    }

    private static String reverseString(java.lang.String strStr) {
        my.client.ReverseService_Service service = new my.client.ReverseService_Service();
        my.client.ReverseService port = service.getReverseServicePort();
        return port.reverseString(strStr);
    }

}
