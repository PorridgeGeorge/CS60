#lang racket

(require "BST.rkt")
(provide height)
(provide find-min)
(provide in-order)
(provide delete)
(provide insertWrong)
(provide insert)


;; height: returns the height of a BST
;;   input: a BST
;;   output: the number of edges on the longest path from the root to a leaf
(define (height tree)
  (if (emptyTree? tree)
      -1
      [max (+ 1 (height (leftTree tree)))
           (+ 1 (height (rightTree tree)))]
  )
)
      
  


;; find-min: returns the smallest element in a non-empty BST
;;   input: a non-empty BST
;;   outputs: the smallest number in the tree
(define (find-min tree)
  (if (emptyTree? (leftTree tree)) ;; TODO: implement find-min
      (key tree)
      (find-min (leftTree tree)
      )
  )
)

;; in-order: returns an ordered list of the elements in a BST
;;   input: a BST
;;   outputs: a list of all the elements in the BST, in increasing order
(define (in-order tree)
  (if (emptyTree? tree)
      '()
      (append
             (in-order (leftTree tree)) ;left
             (append (list (key tree)) ;node
                     (in-order (rightTree tree)) ;right
             )
       )
  )
)


;; insertWrong: incorrectly inserts an element into a BST
;;   inputs: an element e to insert and a BST
;;   output: a new BST with e inserted
(define (insertWrong e tree)
  (cond [(emptyTree? tree)
         (make-BST-leaf e)]
        [(= e (key tree)) ; already have the element
         tree]
        [(< e (key tree)) ; insert to the LEFT
         (insertWrong e (leftTree tree))]
        [else             ; insert to the RIGHT
         (insertWrong e (rightTree tree))]
        ))


;; insert: inserts an element into a BST
;;   inputs: an element e to insert and a BST
;;   output: a new BST with e inserted
(define (insert e tree)
  (cond [(emptyTree? tree)
         (make-BST-leaf e)]
        [(= e (key tree)) ; already have the element
         tree]
        [(< e (key tree)) ; insert to the LEFT
         (make-BST (key tree)
                   (insert e (leftTree tree))
                   (rightTree tree))]
        [else             ; insert to the RIGHT
         (make-BST (key tree)
                   (leftTree tree)
                   (insert e (rightTree tree)))]
        ))


;; delete: removes an element from a BST
;;   input: an element e to delete and a BST
;;   outputs: a new BST with e removed (if e appears in the tree)
(define (delete e tree)
  (cond [(emptyTree? tree) ; element not in tree
         tree]
        [(= e (key tree)) ; found the element
         (cond [(leaf? tree) ; element is a leaf
                (make-empty-BST)]
               [(emptyTree? (leftTree tree))  ; element has one right branch
                (rightTree tree)]
               [(emptyTree? (rightTree tree)) ; element has one left branch
                (leftTree tree)]
               [else ; element has two branches
                (make-BST (find-min (rightTree tree))
                          (leftTree tree)
                          (delete (find-min (rightTree tree)) (rightTree tree)))]
         )]
        [(< e (key tree)) ; look to the LEFT
         (make-BST (key tree)
                   (delete e (leftTree tree))
                   (rightTree tree))]
        [else             ; look to the RIGHT
         (make-BST (key tree)
                   (leftTree tree)
                   (delete e (rightTree tree)))]
   )
)


;if the node doesn't have kids check equal and remove or return tree
;if e is less than key go left
;if e is greater than key go right
;if e equals key remove key