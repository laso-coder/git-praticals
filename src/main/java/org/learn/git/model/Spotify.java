package org.learn.git.model;

import static java.util.Objects.*;

public class Spotify {
  private int id;
  private String song;

  private String category;

  public Spotify(int id, String song, String category) {
    this.id = id;
    this.song = song;
    this.category = category;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSong() {
    return song;
  }

  public void setSong(String song) {
    this.song = song;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Spotify spotify = (Spotify) o;
    return id == spotify.id && song.equals(spotify.song) && category.equals(spotify.category);
  }

  @Override
  public int hashCode() {
    return hash(id, song, category);
  }

  @Override
  public String toString() {
    return String.format("Spotify [id=%d, song='%s', category='%s']", id, song, category);
  }
}
