package br.com.meli.modulo6aula3.entity;

public class Alimento {
  private String Id;
  private String name;
  private int calories;

  public Alimento(String id, String name, int calories) {
    Id = id;
    this.name = name;
    this.calories = calories;
  }

  public String getId() {
    return Id;
  }

  public String getName() {
    return name;
  }

  public int getCalories() {
    return calories;
  }
}
