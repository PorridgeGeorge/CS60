#lang racket

(require rackunit)
(require "remove-all.rkt")


; student tests
(check-equal? (remove-all 0 '()) ;; base case
              '())
(check-equal? (remove-all "i" '("i")) ;; generic case
              '())
(check-equal? (remove-all 0 '((1 0) 0))  ;; targeted top-level remove case
              '((1 0)))


; provided tests
(check-equal? (remove-all "i" '("a" "l" "i" "i" "i" "e" "n")) 
              '("a" "l" "e" "n"))
(check-equal? (remove-all "i" '( ("a" "l" "i") "i" "i" "e" "n")) 
              '(("a" "l" "i") "e" "n"))
(check-equal? (remove-all 0 '(1 0 1 0 1 0))  
              '(1 1 1))

