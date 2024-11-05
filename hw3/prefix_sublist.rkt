#lang racket

(provide prefix? sublist?)

;; prefix?: checks if list P is in the initial elements of list L
;;  inputs: prefix to check, P
;;          list being checked, L
;;  output: true or false depending on if P is in inital of L
(define (prefix? P L)
  (cond
    [(empty? P) ;base case
     true]
    [(empty? L) ;base case
     false]
    [(equal? (first P) (first L)) ;checks if first index of each P and L match
     (prefix? (rest P) (rest L))] 
    [else false] ;false case
    )
  )

;; sublist?: checks if list S is in some set of consecutive elements of list L
;;  inputs: list to check, S
;;          list being checked, L
;;  output: true or false depending on if ordered S is in L
(define (sublist? S L)
  (cond
    [(empty? S ) ; true case
     true]
    [(empty? L) ;false case
     false]
    [(equal? (first S) (first L))
     (prefix? (rest S) (rest L))] ;calls prefix to make sure S is found consecutavely in L
    [else (sublist? S (rest L))] ;calls sublist again looking at the next index of L
    )
  )