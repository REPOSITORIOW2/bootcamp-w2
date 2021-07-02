package br.com.meli.modulo6aula3.entity.dto;

public class AlimentoDTO {
  private String name;
  private int calories;

  public AlimentoDTO() {
  }

  public AlimentoDTO(String name, int calories) {
    this.name = name;
    this.calories = calories;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }
}
