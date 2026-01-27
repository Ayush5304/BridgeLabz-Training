package com.Day1.HealthCheckPro;

public class LabController {

    @PublicAPI(description = "Fetch blood test report")
    public void getBloodTestReport() {}

    @RequiresAuth
    public void submitTestSample() {}

    public void deleteTestRecord() {}   
}
