#lang racket

;; Two functions will be treated as publicly accessible
;;   (so that we can test them)
(provide erdos erdos-count)


;; erdos: the "erdos" function
;;   input: a positive integer, N
;;   output: 3N+1, if N is odd
;;           N/2, if N is even
(define (erdos N)
  (cond
    [(= 0 (modulo N 2))
       (quotient N 2)]
    [(+ 1 (* 3 N))]))
    

;; erdos-count: the "erdos count" function
;; input: a positive integer N
;; output: the number of erdos calls required to reach 1
(define (erdos-count N)
  (+ 1
  (if (= N 1)
      (- 1)
      (erdos-count(erdos N)))))