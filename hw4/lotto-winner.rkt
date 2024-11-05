#lang racket

(provide matches)
(provide lotto-winner)


;; matches: finds the number of matches between ticket and winning numbers
;;   inputs: tickets - lotto ticket, list of numbers
;;             expected format:  '(name # # ... #)
;;           winning-numbers - winning numbers, list of numbers
;;             expected format:  '(# # .. #)
;;   output: the number elements that match between tickets and winning-numbers
(define (matches ticket winning-numbers)
  (length 
   (filter (lambda (potential-match) 
             (member potential-match winning-numbers))
           ticket)))


;; matches-list: converts list-of-tickets to a list of matching numbers for each ticket
;;   inputs: list-of-tickets - list of lotto tickets, list of lists of numbers
;;             expected format:  '((name1 # # ... #) ... (nameN # # ... #)) 
;;           winning-numbers - winning numbers, list of numbers
;;             expected format:  '(# # .. #)
;;   outout: a list of the name of the player and how many numbers their ticket shares with the winning set
(define (matches-list list-matches winning)
  (map (lambda (num-matches)
         (list (first num-matches) ;;keeps the name of the player
               (matches num-matches winning))) ;;creates number of matches for each ticket
       list-matches))

;; sorted: sorts list of number of matches
(define (sorted matched)
  (sort matched
        (lambda (x y)
          (> (first(rest x)) (first(rest y))))))

;; lotto-winner: finds the name and number of the winning ticket
;;   inputs: list-of-tickets - list of lotto tickets, list of lists of numbers
;;             expected format:  '((name1 # # ... #) ... (nameN # # ... #)) 
;;           winning-numbers - winning numbers, list of numbers
;;             expected format:  '(# # .. #)
;;   output: the name and number of matching tickets from the ticket 
;;           with the most matches in winning-numbers
(define (lotto-winner list-of-tickets winning-numbers)
  (if (equal? (cdr (first (sorted (matches-list list-of-tickets winning-numbers)))) 0) ;;nobody has a match
      '()
      (first (sorted (matches-list list-of-tickets winning-numbers))))) ;;person with the most matches
