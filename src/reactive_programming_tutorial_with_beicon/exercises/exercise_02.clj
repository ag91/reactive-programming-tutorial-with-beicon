(ns reactive-programming-tutorial-with-beicon.exercises.exercise-02
  (:require [beicon.core :as rx]
            [reactive-programming-tutorial-with-beicon.util.example-streams :as es]))

(def numbersWithError$ es/numbersWithError$)
(def strings (atom []))

;;; ASSIGNMENT: Subscribe to the numbersWithError$ stream and collect
;;; each event (next, error, complete) in the strings atom.
;;;
;;; Note: if a stream emits an error event, it will no longer emit a complete event, so a stream
;;; either terminates with an error event or a complete event.
;;; Hint: check rx/subscribe and .getMessage can be handy.
