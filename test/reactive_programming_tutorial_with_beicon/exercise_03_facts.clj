(ns reactive-programming-tutorial-with-beicon.exercise-03-facts
  (:require  [midje.sweet :as midje]
             [reactive-programming-tutorial-with-beicon.exercises.exercise-03 :as e]
             [beicon.core :as rx]))


(midje/fact "The primeNumber$ stream should contain only prime numbers."
      (let [stream (atom [])]
        (rx/on-value e/primeNumber$ #(swap! stream conj %))
        @stream => [1 7 2 2 7 3]))
