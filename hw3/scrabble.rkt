#lang racket

(provide subbag? best-word)

(define (subbag? S B)
  (cond
    [(empty? S ) ; true case
     true]
    [(empty? B) ;false case
     false]
    [(member (first S) B)
     (subbag? (rest S) (remove (first S) B))] ;calls subbag again w/o the first instance of the first element of S
    [else
     false] ;no instance of first S in B
  )
  )

(define (best-word rack WL)
  (list '("ranoutoftime" 5)))

