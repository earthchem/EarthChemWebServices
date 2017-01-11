package com.earthchem.ws;



import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;



/**
* Handle Sample Not FoundException.
*
* @author  Bai
* @version 1.0
* @since   2017-01-11 
*/


public class SampleNotFoundException extends WebApplicationException {
  /**
  * Create a HTTP 404 (Not Found) exception.
  * @param message the String that is the entity of the 404 response.
  */
  public SampleNotFoundException(String message) {
    super(Response.status(Response.Status.NOT_FOUND).
    entity(message).type("text/plain").build());
  }
}
