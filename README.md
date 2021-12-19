<div align="center">

## Program Console Segitiga Bintang Java
>Beberapa Kode Logika Pengulangan Untuk Menampilkan Output "Segitiga Bintang" Pada Console Menggunakan Java

</div>

### Segitiga Siku Siku
```java
for(int i = 0; i < 10; i++){
    for(int j = 0; j <= i; j++){
        System.out.print(" *");
    }
    System.out.println();
}

/*

output : 
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *

*/
```
### Segitiga Siku Siku Terbalik

```java
for(int i = 0; i < 10; i++){
    for(int j = i; j < 10; j++){
        System.out.print(" *");
    }
    System.out.println();
}

/*

output : 
* * * * * * * * * *
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/
```

### Segitiga Sama Kaki

```java
for(int i = 0; i <= 10; i++){
    for(int j = i; j < 10; j++){
        System.out.print(" ");
    }
    for(int j = 0; j <= i; j++){
        System.out.print("* ");
    }
    System.out.println();
}

/*

output : 
          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *
    * * * * * * *
   * * * * * * * *
  * * * * * * * * *
 * * * * * * * * * *
* * * * * * * * * * *

*/
```

### Segitiga Sama Kaki Terbalik
```java
for(int i = 0; i <= 10; i++){
    for(int j = 0; j <= i; j++){
        System.out.print(" ");
    }
    for(int j = i; j < 10; j++){
        System.out.print("* ");
    }
    System.out.println();
}

/*

output : 
* * * * * * * * * *
 * * * * * * * * *
  * * * * * * * *
   * * * * * * *
    * * * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

*/
```