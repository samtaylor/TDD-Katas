# FizzBuzz

Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

## Setup

The git repo contains a sample implementation, but the fun is in the process. Start with an empty directory and build the FizzBuzz app. You will need to have gradle installed in order to init the project, if you don't already have gradle installed, use:

`brew install gradle`

Visit [https://brew.sh/](https://brew.sh) to install brew.

#### Create the initial project directory, and initialise gradle

```
mkdir FizzBuzz
cd FizzBuzz
gradle init
```

#### Modify build.gradle to run the app

Add the following to your build.gradle:

```
apply plugin: 'application'

mainClassName = "FizzBuzz"
```

#### Create the directory structure for the project and test source classes, and create the empty classes

```
mkdir -p src/main/java
mkdir -p src/test/java
```

```
touch src/main/java/FizzBuzz.java
touch src/test/java/FizzBuzzTest.java
```

## Initial contents of the FizzBuzz, and FizzBuzzTest classes

#### FizzBuzz.class

```
public class FizzBuzz
{
  public static void main( String [] args )
  {
    System.out.println( "Hello, world!" );
  }
}
```

#### FizzBuzzTest.class

```
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzTest
{
  @Test
  public void sampleTest()
  {
    assertTrue( false );
  }
}
```

## Building and Running

To build the kata, use `./gradlew assemble`

To run the tests, use `./gradlew test`

Or to build and run in a single step, use `./gradlew build`
