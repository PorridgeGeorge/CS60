#lang racket
(provide compare cookie)

;;compare: the "compare function"
;;   input: numbers x and y
;;   output: which is larger or if they are the same
(define (compare x y)
  (cond
        [(= x y) "Equivalent"]
        [(> x y) "x is greater"]
        [(< x y) "y is greater"]))

(define(cookie cake pie)
  (if (< cake pie)
      'true
     'false))