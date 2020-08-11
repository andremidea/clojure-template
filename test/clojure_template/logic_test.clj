(ns clojure-template.logic-test
  (:require [clojure.test :refer :all]
            [clojure-template.logic :as logic]
            [matcher-combinators.test]
            [matcher-combinators.matchers :as m]))

(deftest logic-test
  (testing "split text"
    (is (match? (logic/logic "abc dfg") ["abc" "dfg"]))))
