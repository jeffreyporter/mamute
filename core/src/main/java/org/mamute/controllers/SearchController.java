package org.mamute.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.environment.Environment;

@Controller
public class SearchController {
    
    @Inject private Result result;
	@Inject private Environment env;
    
    @Get("/buscar")
    public void search(String query) {
    	result.include("customGoogleSearchKey", env.get("custom_google_search_key"));
        result.include("query", query);
    }
}