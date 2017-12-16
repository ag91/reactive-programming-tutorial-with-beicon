(ns reactive-programming-tutorial-with-beicon.exercise-03-facts
  (:require  [midje.sweet :as midje]
             [reactive-programming-tutorial-with-beicon.exercises.exercise-03 :as e]
             [beicon.core :as rx]))


(midje/fact "The evenNumber$ stream should contain only even numbers."
      (let [stream (atom [])]
        (rx/on-value e/evenNumber$ #(swap! stream conj %))
        @stream => [4 6 2 2 4 8]))
