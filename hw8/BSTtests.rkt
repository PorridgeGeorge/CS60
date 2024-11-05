#lang racket

(require rackunit)
(require "BST.rkt")
(require "BSTfunctions.rkt")


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Part A : Create 4 additional trees
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; provided: an empty binary search tree
(define emptyBST (make-empty-BST))

;; TODO: make simpler trees

;; student: a binary search tree with one node
(define tree-wOneNode
  (make-BST 7
            (make-empty-BST)
            (make-empty-BST)
   )
)

;; student: a binary search tree with a left child
(define tree-wLeftChild
  (make-BST 7
            (make-BST-leaf 1)
            (make-empty-BST)
  )
)
;; student: a binary search tree with a right child
(define tree-wRightChild
  (make-BST 7
            (make-empty-BST)
            (make-BST-leaf 8)
  )
)
;; student: a binary search tree with two children
(define tree-wTwoChildren
  (make-BST 7
            (make-BST-leaf 1)
            (make-BST-leaf 8)
  )
)
;; provided: a big binary search tree
(define bigBST 
  (make-BST 42
            (make-BST 20
                      (make-BST 7
                                (make-BST-leaf 1)
                                (make-BST-leaf 8))
                      (make-BST 31
                                (make-empty-BST)
                                (make-BST-leaf 41)))
            (make-BST 100 
                      (make-BST-leaf 60)
                      (make-empty-BST))))

; provided tests
(check-equal? (key tree-wOneNode) 7)
(check-equal? (leftTree tree-wOneNode) emptyBST)
(check-equal? (rightTree tree-wOneNode) emptyBST)

(check-equal? (key tree-wLeftChild) 7)
(check-equal? (leftTree tree-wLeftChild) (make-BST-leaf 1))
(check-equal? (rightTree tree-wLeftChild) emptyBST)
(check-equal? (key (leftTree tree-wLeftChild)) 1)

(check-equal? (key tree-wRightChild) 7)
(check-equal? (leftTree tree-wRightChild) emptyBST)
(check-equal? (rightTree tree-wRightChild) (make-BST-leaf 8))
(check-equal? (key (rightTree tree-wRightChild)) 8)

(check-equal? (key tree-wTwoChildren) 7)
(check-equal? (leftTree tree-wTwoChildren) (make-BST-leaf 1))
(check-equal? (rightTree tree-wTwoChildren) (make-BST-leaf 8))
(check-equal? (key (leftTree tree-wTwoChildren)) 1)
(check-equal? (key (rightTree tree-wTwoChildren)) 8)

(check-true  (emptyTree? emptyBST))
(check-false (emptyTree? tree-wOneNode))
(check-false (emptyTree? tree-wLeftChild))
(check-false (emptyTree? (leftTree tree-wLeftChild)))
(check-true  (emptyTree? (rightTree tree-wLeftChild)))
(check-false (emptyTree? tree-wRightChild))
(check-true  (emptyTree? (leftTree tree-wRightChild)))
(check-false (emptyTree? (rightTree tree-wRightChild)))
(check-false (emptyTree? tree-wTwoChildren))
(check-false (emptyTree? (leftTree tree-wTwoChildren)))
(check-false (emptyTree? (rightTree tree-wTwoChildren)))

(check-true  (leaf? tree-wOneNode))
(check-false (leaf? tree-wLeftChild))
(check-true  (leaf? (leftTree tree-wLeftChild)))
(check-false (leaf? tree-wRightChild))
(check-true  (leaf? (rightTree tree-wRightChild)))
(check-false (leaf? tree-wTwoChildren))
(check-true  (leaf? (leftTree tree-wTwoChildren)))
(check-true  (leaf? (rightTree tree-wTwoChildren)))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Part B: Test height
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; provided tests
(check-equal? (height emptyBST) -1)
(check-equal? (height bigBST) 3)

; student tests
(check-equal? (height tree-wOneNode) 0)
(check-equal? (height tree-wLeftChild) 1)
(check-equal? (height tree-wRightChild) 1)
(check-equal? (height tree-wTwoChildren) 1)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Part C: Test find-min
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; provided tests
(check-equal? (find-min bigBST) 1)

; student tests
(check-equal? (find-min tree-wOneNode) 7)
(check-equal? (find-min tree-wLeftChild) 1)
(check-equal? (find-min tree-wRightChild) 7)
(check-equal? (find-min tree-wTwoChildren) 1)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Part D: Test in-order
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; 

; provided tests
(check-equal? (in-order emptyBST) '())
(check-equal? (in-order bigBST) '(1 7 8 20 31 41 42 60 100))

; student tests
(check-equal? (in-order tree-wOneNode) '(7))
(check-equal? (in-order tree-wLeftChild) '(1 7))
(check-equal? (in-order tree-wRightChild) '(7 8))
(check-equal? (in-order tree-wTwoChildren) '(1 7 8))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Part F: Test delete
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; provided tests
(define bigBST_without20
    (make-BST 42
         (make-BST 31
             (make-BST 7
                 (make-BST-leaf 1)
                 (make-BST-leaf 8))
             (make-BST-leaf 41))
         (make-BST 100
             (make-BST-leaf 60)
             (make-empty-BST))))

(check-equal? (delete 20 bigBST) bigBST_without20)

(define bigBST_without42
    (make-BST 60
        (make-BST 20
             (make-BST 7
                 (make-BST-leaf 1)
                 (make-BST-leaf 8))
             (make-BST 31
                 (make-empty-BST)
                 (make-BST-leaf 41)))
        (make-BST-leaf 100))) 

(check-equal? (delete 42 bigBST) bigBST_without42)

; student tests
(define tree-test1
  (make-BST 1
            (make-empty-BST)
            (make-empty-BST)
   )
)

(define tree-test2
  (make-BST 8
            (make-empty-BST)
            (make-empty-BST)
   )
)

(define tree-test3
  (make-BST 8
            (make-BST-leaf 1)
            (make-empty-BST)
   )
)
; Remove X from a tree that does not contain X
(check-equal? (delete 10 bigBST) bigBST)

; Remove X from a tree where X is the only node
(check-equal? (delete 7 tree-wOneNode) emptyBST)

; Remove X from a tree where X has no children & was in a left subtree
(check-equal? (delete 1 tree-wLeftChild) tree-wOneNode)

; Remove X from a tree where X has no children & was in a right subtree
(check-equal? (delete 8 tree-wRightChild) tree-wOneNode)

; Remove X from a tree where X was at the root & has only a right child
(check-equal? (delete 7 tree-wRightChild) tree-test2)

; Remove X from a tree where X was at the root & has only a left child
(check-equal? (delete 7 tree-wLeftChild) tree-test1)

; Remove X from a tree where X was at the root & has two children
(check-equal? (delete 7 tree-wTwoChildren) tree-test3)