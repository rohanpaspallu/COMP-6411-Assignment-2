(ns ass2.core
  (:require [clojure.string :as str]))

(use 'clojure.java.io)
;(use '[clojure.string :only (join split)])
;(use '[clojure.contrib.seq :only (positions)])


;(defn Example []
;  (def string1 (slurp "map.txt"))
;  (println "")
;  (println string1)
;  (def list1(clojure.string/split string1 #""))
;  (println list1)
;  (def size (count list1))
;  (println size)
;  (def i (atom 1))
;  (while (< @i size)
;    (do
;      (def x (nth list1 @i))
;      ;(println x)
;
;      (swap! i inc))))
;  (def game_size(.indexOf list1 "\r"))
;  (println game_size)
;  (def s (- size game_size))
;  (println s)
;  (def ans(nth list1 (- s 3)))
;  (println ans)


  ;(def dummy [])
  ;(if (= ans "#")
  ;  (dummy(concat dummy "#"))
  ;  (println "nothing"))
  ;
  ;
  ;(println dummy)

  ;(doseq [i (range 118)]
  ;  (println i)
  ;  (def map11(map #(hash-map % i) (seq string1))))
;(println map11)


; (Example)


(defn read-in-board [filepath]
  (str/split-lines (slurp filepath)))


(def str1(mapv vec (read-in-board "map.txt")))
(println str1)
;(def  (str (get-in str1 [7 12])))

(def z (count str1))

(println z)
(doseq [item str1]
  (def x (count item))
  (doseq [item2 item]
    ;(println item2)
    )
  )
(println x)
(def row_val (- z 1))
(def col_val (- x 1))


(def vecVal(get (get str1 row_val) col_val))
(println vecVal)
;(def z (last (last str1)))
;(println z)
;(def revStr (rseq str1))
;(println revStr)
