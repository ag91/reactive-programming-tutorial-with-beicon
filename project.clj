(defproject reactive-programming-tutorial-with-beicon "0.1.0-SNAPSHOT"
  :description "A tutorial of reactive programming in clojure."
  :url "http://example.com/FIXME"
  :license {:license {:name "LGPL"
                      :url "https://www.gnu.org/licenses/lgpl-3.0.txt"}}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [funcool/beicon "4.1.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.3"]]}})
