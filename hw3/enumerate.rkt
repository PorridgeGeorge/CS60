#lang racket

(provide enumerate)

;; counter: executes the function of enumerate
;;  inputs: integer C that represents the index value of L
;;          list L 
;;  output: a list with elements of L along with their index number
(define (counter C L)
    (cond
    [(empty? L) ;;base case
     '()]
    [(cons (list C (first L)) (counter (+ C 1) (rest L)))]
    )
  )
    
;; enumerate: returns a list with the index of each element
;;            along with the element
;;  inputs: list L
;;  output: a list with elements of L along with their index number
(define (enumerate L)
  (counter 0 L))
