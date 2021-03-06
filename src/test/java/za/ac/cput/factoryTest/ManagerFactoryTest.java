package za.ac.cput.factoryTest;

/* ManagerFactoryTest.Java
 *  Author: Tim Davids 219296219
 *  Entity for ManagerFactoryTest
 *  Date: 27 March 2022
 * */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Managers;
import za.ac.cput.factory.ManagerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFactoryTest {

   @Test
    public void test() {

        Managers managers = ManagerFactory.createManager("3452" ,"Tim","Davids","35", "0823456798");
        System.out.println(managers.toString());
        assertNotNull(managers);
       System.out.println(managers);
    }


    @Test
    void createManager() {
   }
}