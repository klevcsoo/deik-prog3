Racket kód az óra elejéről

```racket
(define (sum lst)
  (cond
    [(empty? lst) 0]
    [else
      (define fej (first lst))
      (define farok (rest lst))
      (define farok-ertek (sum farok))
      (+ fej farok-ertek)]))
      
(writeln (sum (list 1 2 3 4)))


; -----------------


(define (sum-ver2 lst) (sum-ver3 lst 0))
(define (sum-ver3 lst akku)
    (cond
        [(empty? lst) akku]
        [else
            (define fej (first lst))
            (define farok (rest lst))
            (define akku2 (+ fej akku))
            (sum-ver3 farok akku2)]))
; ez a farok-rekurzív változat
(writeln (sum-ver2 (list 1 2 3 4)))


; -----------------


(define (is-member x lst)
    (cond
        [(empty? lst) false]
        [else
            (define fej (first lst))
            (define farok (rest lst))
            (define farok-ertek (is-member x farok))
            (if (= fej x)
                true
                farok-ertek)]))
; ez NEM farok-rekurzív

(define (is-member-ver2 x lst) (is-member-ver3 x lst false))
(define (is-member-ver3 x lst akku)
    (cond
        [akku true]
        [(empty? lst) akku]
        [else
            (define fej (first lst))
            (define farok (rest lst))
            (define akku2 (if (= fej x)
                true
                akku))
            (is-member-ver3 x farok akku2)]))
; ez farok-rekurzív
; az akku2-t úgy kell számolni, ahogy a farok-értéket számoltuk

; ez majd kell a reduce-hoz


; -----------------


(define (inc x) (+ x 1))
(writeln (map inc (list 1 2 3 4)))

(define (plus5 x) (+ x 5))
(writeln (map plus5 (list 1 2 3 4)))
```

További Racket kód:

```racket
(writeln (map (lambda (x) (+ x 1)) (list 1 2 3 4)))
(writeln "")

(writeln (map (lambda (x) (if (even? x) (+ x 1) x)) (list 1 2 3 4)))
(writeln "")

(writeln (map (lambda (x) (if (even? x) (* x x) x)) (list 1 2 3 4)))
(writeln "")

(writeln (filter (lambda (x) (even? x)) (list 1 2 3 4)))
(writeln (filter even? (list 1 2 3 4)))
(writeln "")

(writeln (filter (lambda (x) (> x 5)) (list 4 5 6 7 8)))
(writeln "")

; ----------

(define (reduce f akku lst) (foldl f akku lst))

(define (mysum lst) (reduce + 0 lst))
(writeln (mysum (list 1 2 3 4)))
(writeln (reduce + 0 (list 1 2 3 4)))

; a reduce úgy működik, hogy a fejre és akkumlátorra kívja meg a két paraméteres
; függvényt. a visszaadott érték, az az akkumlátor következő értéke. ezt addig
; csinálja, amíg el nem fogy a lista.
```