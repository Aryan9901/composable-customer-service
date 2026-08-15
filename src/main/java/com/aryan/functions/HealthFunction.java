package com.aryan.functions;

import org.platformlambda.core.annotations.PreLoad;
import org.platformlambda.core.models.TypedLambdaFunction;

import java.util.Map;

@PreLoad(route = "v1.health.check", instances = 2)
public class HealthFunction implements TypedLambdaFunction<Map<String, Object>, Map<String,Object>> {

    @Override
    public Map<String, Object> handleEvent(Map<String, String> headers, Map<String, Object> input, int instance) throws Exception {
        return Map.of(
                "status", "UP",
                "service", "customer-service"
        );
    }

}
