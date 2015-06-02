(ns glingo.core-test
  (:require [clojure.test :refer :all]
            [glingo.core :refer :all]
            [clojure.test :refer :all]
            [midje.sweet :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(fact "url builds"
  (make-url "a" "b" "c" ) => 
    2
  )
