### SOLID - a legfontosabb 5 alapelv.

A SOLID-on belül az I az interfész szegregációs alapelv. Röviden ISP.
Az ISP azt mondja ki, hogy kis interfészeket használjunk. Egy nagy osztály sok mindenre jó, minden funkciójához érdemes
csinálni egy interfészt.

```java
class Fenymasolo implements Szkenner, Nyomtato {
}
```