#lang racket

(require rackunit)
(require "range.rkt")


; provided definitions calling make-range-predicate
(define value1to3?   (make-range-predicate 0 4))
(define value1to100? (make-range-predicate 0 101))

; student function
(define value1to64?  (make-range-predicate 0 65))

; student test cases for value1to64
(check-equal? (value1to3? 65)  false)
(check-equal? (value1to3? 123456789098765432345678909876543)  false)
(check-equal? (value1to3? 1.234567)  true)
(check-equal? (value1to3? -42)  false)

; provided test cases for value1to3? and value1to100?
(check-equal? (value1to3? 0)  false)
(check-equal? (value1to3? 1)  true)
(check-equal? (value1to3? 2)  true)
(check-equal? (value1to3? 3)  true)
(check-equal? (value1to3? 4)  false)
(check-equal? (value1to3? 42) false)

(check-equal? (value1to100? 0)   false)
(check-equal? (value1to100? 1)   true)
(check-equal? (value1to100? 20)  true)
(check-equal? (value1to100? 42)  true)
(check-equal? (value1to100? 100) true)
(check-equal? (value1to100? 101) false)
(check-equal? (value1to100? 999) false)

