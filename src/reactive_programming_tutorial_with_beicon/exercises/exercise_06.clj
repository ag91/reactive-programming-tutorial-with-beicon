(ns reactive-programming-tutorial-with-beicon.exercises.exercise-06
  (:require [beicon.core :as rx]
            [reactive-programming-tutorial-with-beicon.util.example-streams :as es]
            [reactive-programming-tutorial-with-beicon.util.utils :as u]))

(def number$ es/number$)

;;; ASSIGNMENT: Compute the sum of all numbers emitted by the number$ stream. 
;;; The result should be a new stream that also contains the intermediate sums,
;;; for example given a stream of numbers 1, 2, 3,
;;; then the resulting stream should emit the numbers
;;; 1 (first value), 3 (1 + 2) and 6 (3 + 3).

(def sum$ number$) ;???
