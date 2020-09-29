package com.learning_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Environment {
    private static final String PRODUCTION_URL = "https://home.google.com";

    private static final List<String> ENVIRONMENTS = new ArrayList<>();

    static {
        ENVIRONMENTS.add("dev");
        ENVIRONMENTS.add("dvi");
        ENVIRONMENTS.add("test");
    }
    //TODO step1 identify if requested env is supported ; if not, throw exception
    //TODO step2 if supported, transform PRODUCTION_URL into environment url
    //TODO step3 return URL
    public String composeEnvUrl(String requestedEnv) {

        boolean flag  = ENVIRONMENTS.contains(requestedEnv);
        if (!flag ) {
            throw new RuntimeException("Given environment is not supported");
        }


        List<String> decomposedUrlAsStringList = Arrays.asList(PRODUCTION_URL.split("//"));
        for (String s:decomposedUrlAsStringList) {
            System.out.println(s);
        }
        String recomposedUrl = decomposedUrlAsStringList.get(0) + "//" + requestedEnv.toLowerCase() + decomposedUrlAsStringList.get(1);
        System.out.println(recomposedUrl);

        return recomposedUrl;
    }
}
