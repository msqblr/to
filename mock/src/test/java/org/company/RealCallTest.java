package org.company;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class RealCallTest extends Mockito {

    @Mock
    private Dependency dependency;

    @InjectMocks
    private RealCall realCall;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRealCall() throws Exception {
        // Given
        Mockito.when(dependency.printMethod()).thenReturn("s");

        // When
        realCall.print();

        // Then
    }

}
