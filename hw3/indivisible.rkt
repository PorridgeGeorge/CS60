#lang racket

(provide indivisible)


;; indivisible: returns all elements of L that are not divisble by e
;;  inputs: positive int e and list L of positive integers
;;  output: a list of all elements of L that return no remainder
;;          when divided by e

(define (indivisible e L)
  (filter (lambda (e L)
         (false? (equal? (modulo L e) 0)))
          ))