package edu.cnm.deepdive.shuffler;


import static org.junit.jupiter.api.Assertions.*;

import java.security.SecureRandom;
import java.util.Set;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  RandomGenerator rng;
   Shuffler shuffler;
  @BeforeEach
  void setup() {
    rng = new SecureRandom();
    shuffler = new Shuffler(rng);
  }

  @Test
  void shuffle_ints() {
    int[] data = IntStream.range(0, 1_000_000)
        .toArray();
    Set<Integer> expected = IntStream.of(data)
        .boxed()
        .collect(Collectors.toSet());
    shuffler.shuffle(data);
    Set<Integer> actual = IntStream.of(data)
        .boxed()
        .collect(Collectors.toSet());

    assertEquals(expected, actual);


  }




}