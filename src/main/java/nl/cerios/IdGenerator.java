package nl.cerios;

public class IdGenerator {
  static int id = 0;

  static int getId() {
    return ++id;
  }
}
