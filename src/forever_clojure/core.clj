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

;; [Problem 7: Conj on vectors [Elementary]](http://www.4clojure.com/problem/7)

(def vector-one-to-four [1 2 3 4])
(= vector-one-to-four (conj [1 2 3] 4))
(= vector-one-to-four (conj [1 2] 3 4))

;; [Problem 8: Sets [Elementary]](http://www.4clojure.com/problem/8)

(def set-keywords-a-d #{:a :b :c :d})
(= set-keywords-a-d (set '(:a :a :b :c :c :c :c :d :d)))
(= set-keywords-a-d (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; [Problem 9: Conj on sets [Elementary]](http://www.4clojure.com/problem/9)

(= #{1 2 3 4} (conj #{1 4 3} 2))

;; [Problem 10: Maps [Elementary]](http://www.4clojure.com/problem/10)

(= 20 ((hash-map :a 10, :b 20, :c 30) :b))
(= 20 (:b {:a 10, :b 20, :c 30}))

;; [Problem 11: Conj on maps [Elementary]](http://www.4clojure.com/problem/11)

(= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3]))

;; [Problem 12: Sequences [Elementary]](http://www.4clojure.com/problem/12)

(= 3 (first '(3 2 1)))
(= 3 (second [2 3 4]))
(= 3 (last (list 1 2 3)))

;; [Problem 13: Rest [Elementary]](http://www.4clojure.com/problem/13)

(= [20 30 40] (rest [10 20 30 40]))

;; [Problem 14: Functions [Elementary]](http://www.4clojure.com/problem/14)

(= 8 ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn [x] (+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))

;; [Problem 15: Functions [Elementary]](http://www.4clojure.com/problem/15)
(defn doubles [x] (* x 2))

(= (doubles 2) 4)
(= (doubles 3) 6)
(= (doubles 11) 22)
(= (doubles 7) 14)

;; [Problem 16: Hello fun [Elementary]](http://www.4clojure.com/problem/16)
(defn hello [x] (str "Hello, " x "!"))

(= (hello "Dave") "Hello, Dave!")
(= (hello "Jenn") "Hello, Jenn!")
(= (hello "Rhea") "Hello, Rhea!")

;; [Problem 17: Maps [Elementary]](http://www.4clojure.com/problem/17)

(= [6 7 8] (map #(+ % 5) '(1 2 3)))

;; [Problem 18: Filter [Elementary]](http://www.4clojure.com/problem/18)

(= [6 7] (filter #(> % 5) '(3 4 5 6 7)))

;; [Problem 19: Last Element [Elementary]](http://www.4clojure.com/problem/19)
(defn my-last 
  [list]
  (loop [[head & tail] list]
    (if-not tail
      head
      (recur tail))))

(= (my-last [1 2 3 4 5]) 5)
(= (my-last '(5 4 3)) 3)
(= (my-last ["b" "c" "d"]) "d")
