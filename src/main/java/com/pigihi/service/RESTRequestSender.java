/**
 * 
 */
package com.pigihi.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;

/**
 * @author Ashish Sam T George
 *
 */
public abstract class RESTRequestSender {
	
	protected URI uri;
	protected String jsonBody = "";
	
	protected void createUri(String uriString, String queryString, String value) {
		URI uri = URI.create(uriString.concat("?")
							.concat(queryString)
							.concat("=")
							.concat(value));
		this.uri = uri;
	}
	
	protected void createUri(String uriString, String queryString1, String value1,
								String queryString2, String value2) {
		URI uri = URI.create(uriString.concat("?")
							.concat(queryString1)
							.concat("=")
							.concat(value1)
							.concat("&")
							.concat(queryString2)
							.concat("=")
							.concat(value2));
		this.uri = uri;
	}
	
	protected void createUri(String uriString) {
		URI uri = URI.create(uriString);
		this.uri = uri;
	}
	
	protected abstract HttpResponse<String> send() throws IOException, InterruptedException;

}
