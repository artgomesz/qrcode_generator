package com.example.ports;

public interface StoragePort {

    String upoloadFile(byte[] fileData, String fileName, String contentType);

}
