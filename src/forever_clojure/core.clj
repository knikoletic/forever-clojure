(ns forever-clojure.core
  (:gen-class))

;; [Problem 1: Nothing but the Truth [Elementary]](http://www.4clojure.com/problem/1)

(= true true)

;; [Problem 2: 	Simple Math [Elementary]](http://www.4clojure.com/problem/2)

(= (- 10 (* 2 3)) 4)

;; [Problem 3: Strings [Elementary]](http://www.4clojure.com/problem/3)

(= "HELLO WORLD" (.toUpperCase "hello world"))

;; [Problem 4: Lists [Elementary]](http://www.4clojure.com/problem/4)

(= (list :a :b :c) '(:a :b :c))

;; [Problem 5: Conj on lists [Elementary]](http://www.4clojure.com/problem/5)

(def list-one-to-four '(1 2 3 4))
(= list-one-to-four (conj '(2 3 4) 1))
(= list-one-to-four (conj '(3 4) 2 1))

;; [Problem 6: Intro to Vectors [Elementary]](http://www.4clojure.com/problem/6)

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
