package fr.isep.simizer.laws;

import org.junit.Before;

/**
 * Tests for the ZipfLaw class.
 * 
 * @author Max Radermacher
 */
public class ZipfLawTest extends LawTest {
  @Before
  public void setUp() {
    law = new ZipfLaw(20, 0.25);
  }
}
