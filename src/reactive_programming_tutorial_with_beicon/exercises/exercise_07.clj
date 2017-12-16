(ns reactive-programming-tutorial-with-beicon.exercises.exercise-07
  (:require [beicon.core :as rx]
            [reactive-programming-tutorial-with-beicon.util.example-streams :as es]
            [reactive-programming-tutorial-with-beicon.util.utils :as u]))

(def word$ es/word$)

;;; ASSIGNMENT: Concatenate all the words from the word$ stream to
;;; form a sentence. Emit the final and intermediate results (the
;;; partial sentences) in the sentence$ stream.


(def sentence$ word$) ;???
