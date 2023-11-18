package com.ecommerce.restapi.ecommercerestapi.UserRespondException;

public class UserResourceNotFoundException extends RuntimeException {

    private static final long serialversionUID = 1L;
    private String resourceName;
    private String fieldvalue;
    private String fieldName;

    public UserResourceNotFoundException(String arg0, String resourceName, String fieldvalue, String fieldName) {
        super(arg0);
        this.resourceName = resourceName;
        this.fieldvalue = fieldvalue;
        this.fieldName = fieldName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldvalue() {
        return fieldvalue;
    }

    public void setFieldvalue(String fieldvalue) {
        this.fieldvalue = fieldvalue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public String toString() {
        return "UserResourceNotFoundException [resourceName=" + resourceName + ", fieldvalue=" + fieldvalue
                + ", fieldName=" + fieldName + "]";
    }

}
