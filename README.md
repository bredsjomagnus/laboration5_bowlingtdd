# LABORATION5_BOWLINGTDD


## TASK DESCRIPTION
In this assignment your group should develop software for calculating score of a single bowl-
ing game.  You must use Test Driven Development approach and use of JUnit framework for
automating testing scripts.

## TDD STEPS TO USE IN DEVELOPMENT
Following TDD, the tests are first written before the actual implementation takes place. Please
familiarize  yourself  with  the  TDD  concept  before  starting.   Then  follow  the  steps  outlined
below:

1. Write one single test-case
2. Run this test-case.  If it fails continue with step 3.  If the test-case succeeds, continue
with step 1.
3. Implement the minimal code to make the test-case run
4. Run the test-case again. If it fails again, continue with step 3. If the test-case succeeds,
continue with step 5.
5. Refactor the implementation to achieve the simplest design possible.
6. Run the test-case again, to verify that the refactored implementation still succeeds the
test-case.  If it fails, continue with step 5.  If the test-case succeeds, continue with step
1, if there are still requirements left in the specification.

### USER STORIES
1. **Frame**: Each turn of a bowling game is called a frame. 10 pins are arranged in each frame.
The goal of the player is to knock down as many pins as possible in each frame.  The player
has two chances, or throws, to do so. The value of a throw is given by the number of pins
knocked down in that throw. Requirement: Define a frame as composed of two throws.  The
first and second throws should be distinguishable.
Example: [2, 4] is a frame with two throws, in which two pins were knocked down in the
first throw and four pins were knocked down in the second.
