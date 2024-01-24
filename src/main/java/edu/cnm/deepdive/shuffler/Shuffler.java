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

}
