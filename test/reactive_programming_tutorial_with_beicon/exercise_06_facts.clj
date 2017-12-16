(ns reactive-programming-tutorial-with-beicon.exercise-06-facts
  (:require  [midje.sweet :as midje]
             [reactive-programming-tutorial-with-beicon.exercises.exercise-06 :as e]
             [beicon.core :as rx]))


(midje/fact "The squaredNumber$ stream should square the original stream."
      (let [stream (atom [])]
        (rx/on-value e/sum$ #(swap! stream conj %))
        @stream => [1 10 14 21 27]))
