(ns ass2.core)

(use 'clojure.java.io)


(defn Example []
  (def string1 (slurp "map.txt"))
  (println "")
  (println string1)
  (def list1(clojure.string/split string1 #""))
  (println list1)
  (def size (count list1))
  (println size)
  (def i (atom 1))
  (while (< @i size)
    (do
      (def x (nth list1 @i))
      (println x)

      (swap! i inc))))

(Example)

;(defn print_num[]
;  (def a (range 0 118))
;  (print a))
;
;(print_num)