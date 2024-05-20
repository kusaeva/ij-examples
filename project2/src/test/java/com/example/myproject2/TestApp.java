package com.example.myproject2;

import static org.junit.Assert.assertEquals;

import com.example.myproject2.App;
import org.junit.Test;

/**
 * Tests for correct dependency retrieval with maven rules.
 */
public class TestApp {

  @Test
  public void testCompare() throws Exception {
    com.example.myproject2.App app = new App();
    assertEquals("should return 0 when both numbers are equal", 0, app.compare(1, 1));
  }

}
