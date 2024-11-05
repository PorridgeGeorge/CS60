#lang racket
(provide count1bits)


;; count1bits the "count1bits" function
;;   input: a non negative integer N
;;   output: the number of times the bit 1
;;           appears in the binary representation of N
(define (count1bits N)
  (cond
    [(= 0 N) (+ 0)]
    [(= 1 (modulo N 2)) (+ 1 (count1bits (quotient N 2)))]
    [else (+ 0 (count1bits (quotient N 2)))])
  )