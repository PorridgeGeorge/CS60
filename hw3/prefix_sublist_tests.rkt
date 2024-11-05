#lang racket

(require rackunit)
(require "prefix_sublist.rkt")

;student tests
(check-false  (prefix? '(a)    '()))
(check-true  (prefix? '(s) '(s)))
(check-true  (prefix? '(1 0) '(1 0 0)))

;provided tests
(check-true  (prefix? '()    '(s p a m)))
(check-true  (prefix? '(s p) '(s p a m)))
(check-false (prefix? '(s m) '(s p a m)))
(check-false (prefix? '(p a) '(s p a m)))

;student tests
;provided tests
(check-false  (sublist? '(a)    '()))
(check-true  (sublist? '(s) '(s)))
(check-true  (sublist? '(1 0) '(0 1 0)))

;provided tests
(check-true  (sublist? '()    '(s p a m)))
(check-true  (sublist? '(s p) '(s p a m)))
(check-false (sublist? '(s m) '(s p a m)))
(check-true  (sublist? '(p a) '(s p a m)))