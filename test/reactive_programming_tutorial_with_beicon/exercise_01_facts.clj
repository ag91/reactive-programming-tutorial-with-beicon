(ns reactive-programming-tutorial-with-beicon.exercise-01-facts
  (:require  [midje.sweet :as midje]
             [reactive-programming-tutorial-with-beicon.exercises.exercise-01 :as e]))


(midje/fact "The numbers atom should contain the contents of the numbers stream."
      (let [stream e/numbers]
        @stream => [1 9 4 7 6 2 2 7 3 4 8]))
