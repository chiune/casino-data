package com.casino.common.util;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilTests {

    @Autowired
    private Util util;

    @Test
    @DisplayName("Common Simple Date Formatter")
    void shouldFormatDate() throws Exception {
        // Given
        final Date date = new Date(1677660411241l);
        final String expectedDate = "2023-03-01 08:46:51:241";
        // When
        final String formattedDate = util.getDateFormatter().format(date);
        // Then
        assertEquals(expectedDate, formattedDate);
    }
}
