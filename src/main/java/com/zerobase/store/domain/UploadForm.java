package com.zerobase.store.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UploadForm {
    private String storeName;
    private String storeLocation;
    private String storeDescription;
    private String username;
}