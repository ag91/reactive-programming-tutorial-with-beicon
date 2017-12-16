(ns reactive-programming-tutorial-with-beicon.exercises.exercise-05
  (:require [beicon.core :as rx]
            [reactive-programming-tutorial-with-beicon.util.example-streams :as es]
            [reactive-programming-tutorial-with-beicon.util.utils :as u]))

(def number$ es/number$)

;;; ASSIGNMENT: create a new stream that emits the square of each number emitted by the number$ stream.

(def squaredNumber$ number$)
