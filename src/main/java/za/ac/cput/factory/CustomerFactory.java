/* CustomerFactory.java
   Author: Damone Hartnick
   Student Number : 219093717
   Date: April 2022
*/
package za.ac.cput.factory;


import za.ac.cput.domain.Customer;
import za.ac.cput.util.GenericHelper;

public class CustomerFactory {
    public static Customer createCustomer( String customerID, String firstName, String lastName, String email , String address, String contactNumber ) {

        if (!GenericHelper.isValidEmail(email))
                return null;

        if (GenericHelper.isNullorEmpty(firstName) || GenericHelper.isNullorEmpty(lastName))
            return null;

        return new Customer.Builder()
                .setCustomerID(customerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setAddress(address)
                .setContactNumber(contactNumber)
                .build();


    }


}
