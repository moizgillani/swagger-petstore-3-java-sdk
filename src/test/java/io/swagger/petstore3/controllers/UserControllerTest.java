/*
 * SwaggerPetstoreOpenAPI30Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore3.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import io.apimatic.core.utilities.TestHelper;
import io.swagger.petstore3.ApiHelper;
import io.swagger.petstore3.SwaggerPetstoreOpenAPI30Client;
import io.swagger.petstore3.exceptions.ApiException;
import io.swagger.petstore3.models.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static SwaggerPetstoreOpenAPI30Client client;
    
    /**
     * Controller instance (for all tests).
     */
    private static UserController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getUserController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Creates list of users with given input array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateUsersWithListInput() throws Exception {
        // Parameters for the API call
        List<User> body = null;

        // Set callback and perform API call
        try {
            controller.createUsersWithListInput(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Logs user into the system.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestLoginUser() throws Exception {
        // Parameters for the API call
        String username = null;
        String password = null;

        // Set callback and perform API call
        try {
            controller.loginUser(username, password);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("X-Rate-Limit", TestHelper.NULL_STRING);
        headers.put("X-Expires-After", TestHelper.NULL_STRING);
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
