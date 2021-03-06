package com.example.filedemo.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The annotation does its job on application startup and binds all the properties with prefix file to the 
 * corresponding fields of the POJO class.
 * 
 * If you define additional file properties in future, you may simply add a corresponding field in the above class, and 
 * spring boot will automatically bind the field with the property value.
 */
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}