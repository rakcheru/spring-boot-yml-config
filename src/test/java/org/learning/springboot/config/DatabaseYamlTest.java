package org.learning.springboot.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@Import(DatabaseYaml.class)
public class DatabaseYamlTest {
  
  @Autowired
  DatabaseYaml databaseYaml;
  
  @Test
  public void user() {
    assertNotNull(databaseYaml);
    assertEquals("scott-yaml", databaseYaml.getUser());
  }
  
}