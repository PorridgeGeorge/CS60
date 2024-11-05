#lang racket

(require rackunit)
(require "scrabble.rkt")

;student tests
(check-true  (subbag? '(s p a m s)      '(s p a m s)) )
(check-false (subbag? '(q r)   '(s p a m s)) )


;provided tests
(check-true  (subbag? '()      '(s p a m s)) )
(check-true  (subbag? '(s s)   '(s p a m s)) )
(check-true  (subbag? '(s m)   '(s p a m s)) )
(check-true  (subbag? '(a p)   '(s p a m s)) )
(check-false (subbag? '(a m a) '(s p a m s)) )
(check-true  (subbag? '(a s)   '(s a))       )