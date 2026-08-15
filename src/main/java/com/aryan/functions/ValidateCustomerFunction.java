package com.aryan.functions;

import org.platformlambda.core.annotations.PreLoad;

@PreLoad(route = "v1.customer.validate", instances = 10)
public class ValidateCustomerFunction {

}
