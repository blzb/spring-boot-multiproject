package com.mopgp.framework.frontend;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Created by apimentel on 7/19/16.
 */
@RestController
@CrossOrigin
@RequestMapping("/angular")
public class FrontendController {

    @RequestMapping("/app.js")
    public String getApp() throws IOException {

        StringBuilder finalFile = getMergedResources("frontend/**/*.js");
        return finalFile.toString();
    }
    @RequestMapping("/config.json")
    public String getConfig() throws IOException {

        StringBuilder finalFile = getMergedConfig();
        return finalFile.toString();
    }

    @RequestMapping("/**")
    public String getViews(HttpServletRequest request) throws IOException {
        String path = (String) request.getAttribute(
            HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        String bestMatchPattern = (String ) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);

        AntPathMatcher apm = new AntPathMatcher();
        String finalPath = apm.extractPathWithinPattern(bestMatchPattern, path);
        System.out.println(finalPath);
        StringBuilder finalFile = getMergedResources("frontend/**/"+finalPath);
        return finalFile.toString();
    }

    private StringBuilder getMergedResources(String matcher) throws IOException {
        ClassLoader cl = this.getClass().getClassLoader();
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(cl);
        Resource[] resources = resolver.getResources("classpath*:"+matcher) ;
        StringBuilder finalFile = new StringBuilder();
        for (Resource resource: resources){
            finalFile.append(convertStreamToString(resource.getInputStream()));
            finalFile.append("\n");
        }
        return finalFile;
    }

    private StringBuilder getMergedConfig() throws IOException {
        ClassLoader cl = this.getClass().getClassLoader();
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(cl);
        Resource[] resources = resolver.getResources("classpath*:frontend/**/*.json") ;
        StringBuilder finalFile = new StringBuilder("[");
        for (int i = 0; i< resources.length; i++){
            finalFile.append(convertStreamToString(resources[i].getInputStream()));
            if(i<(resources.length-1)) {
                finalFile.append(",");
            }
        }
        finalFile.append("]");
        return finalFile;
    }



    private String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
