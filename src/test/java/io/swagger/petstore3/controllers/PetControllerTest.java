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
import io.swagger.petstore3.models.StatusEnum;
import io.swagger.petstore3.utilities.FileWrapper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PetControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static SwaggerPetstoreOpenAPI30Client client;
    
    /**
     * Controller instance (for all tests).
     */
    private static PetController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getPetController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Multiple status values can be provided with comma separated strings.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestFindPetsByStatus() throws Exception {
        // Parameters for the API call
        StatusEnum status = StatusEnum.fromString(
                "available");

        // Set callback and perform API call
        try {
            controller.findPetsByStatus(status);
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
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestFindPetsByTags() throws Exception {
        // Parameters for the API call
        List<String> tags = null;

        // Set callback and perform API call
        try {
            controller.findPetsByTags(tags);
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

}
