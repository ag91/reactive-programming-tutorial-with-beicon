(ns reactive-programming-tutorial-with-beicon.exercises.exercise-04
  (:require [beicon.core :as rx]
            [reactive-programming-tutorial-with-beicon.util.example-streams :as es]
            [reactive-programming-tutorial-with-beicon.util.utils :as u]))

(def number$ es/number$)

;;; ASSIGNMENT: Use to number$ to define a new stream that only contains those numbers that are prime.
;;;
;;; HINT: You can make use of the utility function u/is-prime? to check if a given number is a prime number.

(def primeNumber$ number$) ;???
