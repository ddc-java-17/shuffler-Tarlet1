package edu.cnm.deepdive.shuffler;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Shuffler {

  private final RandomGenerator rng;

  public Shuffler(RandomGenerator rng) {
    this.rng = rng;
  }

  public void shuffle(int[] data) {
    for (int destIndex = data.length - 1; destIndex > 0; destIndex --) {
      int scrIndex = rng.nextInt(destIndex + 1);
      int temp = data[destIndex];
      data[destIndex] = data[scrIndex];
      data[scrIndex] = temp;
    }
  }

  public void shuffle(long[] data) {
    for (int destIndex = data.length - 1; destIndex > 0; destIndex --) {
      int scrIndex = rng.nextInt(destIndex + 1);
      long temp = data[destIndex];
      data[destIndex] = data[scrIndex];
      data[scrIndex] = temp;
    }
  }

  public void shuffle(boolean[] data) {
    for (int destIndex = data.length - 1; destIndex > 0; destIndex --) {
      int scrIndex = rng.nextInt(destIndex + 1);
      boolean temp = data[destIndex];
      data[destIndex] = data[scrIndex];
      data[scrIndex] = temp;
    }
  }

  public void shuffle(char[] data) {
    for (int destIndex = data.length - 1; destIndex > 0; destIndex --) {
      int scrIndex = rng.nextInt(destIndex + 1);
      char temp = data[destIndex];
      data[destIndex] = data[scrIndex];
      data[scrIndex] = temp;
    }
  }

  public void shuffle(short[] data) {
    for (int destIndex = data.length - 1; destIndex > 0; destIndex --) {
      int scrIndex = rng.nextInt(destIndex + 1);
      short temp = data[destIndex];
      data[destIndex] = data[scrIndex];
      data[scrIndex] = temp;
    }
  }

  public void shuffle(float[] data) {
    for (int destIndex = data.length - 1; destIndex > 0; destIndex --) {
      int scrIndex = rng.nextInt(destIndex + 1);
      float temp = data[destIndex];
      data[destIndex] = data[scrIndex];
      data[scrIndex] = temp;
    }
  }

  public void shuffle(double[] data) {
    for (int destIndex = data.length - 1; destIndex > 0; destIndex --) {
      int scrIndex = rng.nextInt(destIndex + 1);
      double temp = data[destIndex];
      data[destIndex] = data[scrIndex];
      data[scrIndex] = temp;
    }
  }

  public void shuffle(byte[] data) {
    for (int destIndex = data.length - 1; destIndex > 0; destIndex --) {
      int scrIndex = rng.nextInt(destIndex + 1);
      byte temp = data[destIndex];
      data[destIndex] = data[scrIndex];
      data[scrIndex] = temp;
    }
  }

  public void shuffle(Object[] data) {
    for (int destIndex = data.length - 1; destIndex > 0; destIndex --) {
      int scrIndex = rng.nextInt(destIndex + 1);
      Object temp = data[destIndex];
      data[destIndex] = data[scrIndex];
      data[scrIndex] = temp;
    }
  }




}
