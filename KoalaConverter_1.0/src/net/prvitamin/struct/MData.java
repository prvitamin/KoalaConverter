package net.prvitamin.struct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MData {

  private List<MCategory> categories = new ArrayList<MCategory>();

  public void setCategories(List<MCategory> categories) {
    this.categories = categories;
  }

  public void addCategory(MCategory category) {
    this.categories.add(category);
  }

  public List<MCategory> getCategories() {
    return Collections.unmodifiableList(this.categories);
  }

}
