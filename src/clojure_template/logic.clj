(ns clojure-template.logic
  (:require [clojure.string :as string]))

(defn logic [text]
  (string/split text #" "))
