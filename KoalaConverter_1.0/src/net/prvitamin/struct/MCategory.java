package net.prvitamin.struct;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MCategory {

  private String name = "category";
  private Map<String, String> value = new HashMap<String, String>();

  public void setName(String name) {
    this.name = name;
  }

  public void setValue(Map<String, String> value) {
    this.value = value;
  }

  public void addValue(String key, String value) {
    this.value.put(key, value);
  }

  public String getName() {
    return this.name;
  }

  public Set<String> getKeys() {
    return Collections.unmodifiableSet(this.value.keySet());
  }

  public String getValueByKey(String key) {
    if (key != null) {
      return this.value.get(key);
    }
    return null;
  }

}
