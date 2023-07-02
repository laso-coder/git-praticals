package org.learn.git.model;

import static java.util.Objects.*;

public class Spotify {
  private int id;
  private String song;

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
    return id == spotify.id && song.equals(spotify.song);
  }

  @Override
  public int hashCode() {
    return hash(id, song);
  }

  public Spotify(int id, String song) {
    this.id = id;
    this.song = song;
  }

  @Override
  public String toString() {
    return "Spotify[" + "id=" + id + ", song='" + song + '\'' + ']';
  }
}
