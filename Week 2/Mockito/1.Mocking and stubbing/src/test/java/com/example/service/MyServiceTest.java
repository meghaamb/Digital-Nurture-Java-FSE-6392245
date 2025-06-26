package com.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Use mock in service and test
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Verify result
        assertEquals("Mock Data", result);

        // Optional: Verify interaction
        verify(mockApi).getData();
    }
}
