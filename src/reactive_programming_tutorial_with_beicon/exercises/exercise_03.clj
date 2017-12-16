(ns reactive-programming-tutorial-with-beicon.exercises.exercise-03
  (:require [beicon.core :as rx]
            [reactive-programming-tutorial-with-beicon.util.example-streams :as es]
            [reactive-programming-tutorial-with-beicon.util.utils :as u]))

(def number$ es/number$)

;; ASSIGNMENT: Create a new stream based on the number$ stream that only emits even numbers.

(def evenNumber$ number$) ;???
