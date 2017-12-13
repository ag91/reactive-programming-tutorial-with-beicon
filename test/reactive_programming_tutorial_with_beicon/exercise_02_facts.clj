(ns reactive-programming-tutorial-with-beicon.exercise-02-facts
  (:require  [midje.sweet :as midje]
             [reactive-programming-tutorial-with-beicon.exercises.exercise-02 :as e]))


(midje/fact "The strings atom should contain the stream numbers and its error message."
      (let [stream e/strings]
        @stream => ["next: 1"
                    "next: 9"
                    "next: 4"
                    "next: 7"
                    "error: uh oh! an error!"]))
