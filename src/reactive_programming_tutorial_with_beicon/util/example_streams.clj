(ns reactive-programming-tutorial-with-beicon.util.example-streams
  (:require [beicon.core :as rx]
            [reactive-programming-tutorial-with-beicon.util.utils :as u]))


(def number$ (rx/from-coll [1 9 4 7 6 2 2 7 3 4 8]))
