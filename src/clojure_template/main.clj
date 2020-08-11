(ns clojure-template.main
  (:require [clojure-template.logic :as logic]))

(defn -main []
  (let [input-string (slurp *in*)]
    (println (logic/logic input-string))))
