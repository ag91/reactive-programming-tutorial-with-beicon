(ns reactive-programming-tutorial-with-beicon.util.utils
  (:require [beicon.core :as rx]))

(defn is-prime? [n]
  (empty? (filter #(= 0 (mod n  %)) (range 2 n))))
