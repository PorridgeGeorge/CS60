#lang racket

(require rackunit)
(require "indivisible.rkt")

;;student tests
(check-equal? (indivisible 2 '(1 2 3 4 5 6))
              '(1 3 5))
(check-equal? (indivisible 10 '(10 20 30))
              '())
(check-equal? (indivisible 1 '(1 2 3 4 5))
              '())
(check-equal? (indivisible 5 '(1 2 3 4))
              '(1 2 3 4))


;;provided test
(check-equal? (indivisible 3 '(2 3 4 5 6 7 8 9 10 )) '(2 4 5 7 8 10))