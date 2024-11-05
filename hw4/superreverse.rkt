#lang racket

(provide superreverse)


;; superreverse: returns the reverse of all top level lists
;;  inputs: list L
;;  output: a list identical to L except for the top level
;;          lists inside L which are reversed
(define (superreverse L)
  (map (lambda (L) (reverse L)) L)) ;; maps reverse onto each element of L

