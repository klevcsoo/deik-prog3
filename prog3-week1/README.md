# Magas szintű programozási nyelvek 3

## 1. hét

A programozási nyelvek jól kiforrott megoldások, melyek problémákat oldanak meg.
3 fajta tervezési mintról beszélünk:

- létrehozási (creational)
- viselkedési (behavioural)
- struktúrális (structural)
- _architektúrális (architectural)_

A GOF könyv az első háromról szó. A tervezési minta ellentétje az anti-pattern. A tervezési minták megmutatják, hogyan
kell a dolgokat megvalósítani. A tervezési minták alatt már a program van.

A programozsi nyelveket két csoportba lehet sorolni:

- **imperatív (imperative)**
    - hangsúly: hogyan?
    - fajtái:
        - procedural
        - OOP
        - ASP
- **deklaratív (declarative)**
    - hangsúly: mit?
    - fajtái:
        - logikai
        - funcionális
            - Racket
            - LISP
            - Haskell
            - Erlang (még van piaca is elv)

### Racket nyelv basics

```rkt
#lang racket/base
(define x 5)                            ; syntax 1: létrehozzuk x-et, értéke 5
(define (egy) 1)                        ; syntax 2: létrehozunk egy függvényt
(define (ketto) (+ 1 1))                ; az operátorok elől vannak
(define (id x) x)                       ; függvény paraméterek
(define (square x) (* x x))             ; ismét
(define (max x y) (if (> x y) x y))     ; feltételek

(writeln (egy))
(writeln (ketto))
(writeln (square 5))
(writeln (max 5 3))

(writeln (id 5))
(writeln (id 8))
```

