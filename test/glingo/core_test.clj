(ns glingo.core-test
  (:require [clojure.test :refer :all]
            [glingo.core :refer :all]
            [clojure.test :refer :all]
            [midje.sweet :refer :all]))


(fact "url builds"
  (make-url "a" "b" "c" ) => #(.startsWith % "http" )
    
  )
