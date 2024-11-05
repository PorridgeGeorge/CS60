#lang racket

(require rackunit)
(require "lotto-winner.rkt")


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Testing matches
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; provided tests
(check-equal? (matches '(cat 1)     '())       0)
(check-equal? (matches '(cat 1)     '(2 3 4))  0)
(check-equal? (matches '(cat 1)     '(1))      1)
(check-equal? (matches '(ace 2 3 4) '(3 42 2)) 2)
(check-equal? (matches '(ace 2 3 4) '(8 4 5))  1)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Testing lotto-winner
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; student tests
(check-equal? 
   (lotto-winner
        '( (isaiah 1 2 3 4 5)
           (christian 1 2 3 4 5)
           (matt 3 15 16 43 21) )
        '(1 2 3 4 5))
   '(isaiah 5))

(check-equal? 
   (lotto-winner
        '( (aarya 2 4 16 33 42)
           (bao 3 4 5 6 7)
           (cruz 3 15 16 41 42) )
        '(2 3 15 32 42))
   '(cruz 3))


              
; provided tests
(check-equal? 
   (lotto-winner
        '( (aarya 2 4 16 33 42)
           (bao 3 4 5 6 7)
           (cruz 3 15 16 41 42) )
        '(2 3 15 32 42))
   '(cruz 3))
