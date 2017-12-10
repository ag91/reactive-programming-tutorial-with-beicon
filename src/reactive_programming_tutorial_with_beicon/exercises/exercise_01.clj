(ns reactive-programming-tutorial-with-beicon.exercises.exercise-01
  (:require [beicon.core :as rx]
            [reactive-programming-tutorial-with-beicon.util.example-streams :as es]))

;;; The number$ stream below will emit short a sequence of numbers with an interval of 1 second.)
(def number$ es/number$)
(def numbers (atom []))


;;; ASSIGNMENT: Subscribe to the number$ stream and collect its numbers in the numbers atom.
;;; Hint: check rx/on-value!
