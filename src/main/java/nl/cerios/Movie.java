/**
 *
 */
package nl.cerios;

public class Movie {

  private Integer id;
  private String name;
  private String status;

  public Movie(Integer id, String name) {
    this.id = id;
    this.name = name;
    this.status = "";
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
