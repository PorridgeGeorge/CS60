#lang racket

(provide superreverse duperreverse)

;; superreverse: returns the reverse of all top level lists
;;  inputs: list L
;;  output: a list identical to L except for the top level
;;          lists inside L which are reversed

(define (superreverse L)
  (cond
    [(empty? L)
     '()]
    [(cons (reverse (first L)) (superreverse (rest L)))]
    )
  )
     
;; duperreverse: executes the function of enumerate
;;  inputs: list L
;;  output: a list with the elements of L in reverse along with the
;;          lists inside each element of L in reverse
(define (duperreverse L)
  (cond
    [(empty? L)
     '()]
    [(list? (first L))
            (append (duperreverse (rest L)) ; puts the rest of the list in front
                    (cons (duperreverse (first L)) '()))] ;reverses the deep list
    [(append (duperreverse (rest L)) ; puts the rest of the list in front
                    (cons (first L) '()))] ;puts the element at the end
    )
  )