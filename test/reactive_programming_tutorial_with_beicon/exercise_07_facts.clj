(ns reactive-programming-tutorial-with-beicon.exercise-07-facts
  (:require  [midje.sweet :as midje]
             [reactive-programming-tutorial-with-beicon.exercises.exercise-07 :as e]
             [beicon.core :as rx]))

(def solution ["Jirble:"
               "Jirble: spill"
               "Jirble: spill a"
               "Jirble: spill a liquid"
               "Jirble: spill a liquid by"
               "Jirble: spill a liquid by shaking"
               "Jirble: spill a liquid by shaking or"
               "Jirble: spill a liquid by shaking or unsteady"
               "Jirble: spill a liquid by shaking or unsteady moving"
               "Jirble: spill a liquid by shaking or unsteady moving of"
               "Jirble: spill a liquid by shaking or unsteady moving of the"
               "Jirble: spill a liquid by shaking or unsteady moving of the vessel"])

(midje/fact "The sentence$ stream should contain the meaning of jirble."                            
            (let [stream (atom [])]
              (rx/on-value e/sentence$ #(swap! stream conj %))
              @stream => solution))
            
