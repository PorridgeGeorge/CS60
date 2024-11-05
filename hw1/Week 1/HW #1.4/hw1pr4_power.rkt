#lang racket

(provide power fast-power)

;; power the "power" function
;;   input: two non negative integers base and pow
;;   output: base raised to the power of pow
(define (power base pow)
    (cond
        [(= 0 pow) (* 1)] ;base case
        [(* base (power base (- pow 1)))] ;power computation and recursive step
        )
)
;; fast-power: the "fast-power" function
;;        the power function with a faster runtime
;;   input: two non negative integers base and pow
;;   output: base raised to the power of pow
(define (fast-power base pow)
    (cond
        [(= pow 0) (* 1)] ;base case
        [(= 1 (modulo pow 2)) (* base (fast-power base (- pow 1)))] ;odd case
        [(= 0 (modulo pow 2)) ;even case
          (let ([half_power (fast-power base (quotient pow 2))]) ;more efficient recursive step
            (* half_power half_power))]
        )
)

