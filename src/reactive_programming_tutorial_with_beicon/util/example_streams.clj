(ns reactive-programming-tutorial-with-beicon.util.example-streams
  (:require [beicon.core :as rx]
            [reactive-programming-tutorial-with-beicon.util.utils :as u]))


(def number$ (rx/from-coll [1 9 4 7 6 2 2 7 3 4 8]))

(def numbersWithError$ (let [few-number$ (rx/take 4 number$)]
                         (rx/concat
                           few-number$
                           (rx/throw (ex-info "uh oh! an error!" {})))))

(def word$ (rx/from-coll ["Jirble:" "spill" "a" "liquid" "by" "shaking" "or" "unsteady"
                          "moving" "of" "the" "vessel"]))
