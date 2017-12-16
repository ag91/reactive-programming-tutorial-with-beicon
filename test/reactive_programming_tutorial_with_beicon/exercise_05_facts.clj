(ns reactive-programming-tutorial-with-beicon.exercise-05-facts
  (:require  [midje.sweet :as midje]
             [reactive-programming-tutorial-with-beicon.exercises.exercise-05 :as e]
             [beicon.core :as rx]))


(midje/fact "The squaredNumber$ stream should square the original stream."
      (let [stream (atom [])]
        (rx/on-value e/squaredNumber$ #(swap! stream conj %))
        @stream => [1 81 16 49 36 4 4 49 9 16 64]))
