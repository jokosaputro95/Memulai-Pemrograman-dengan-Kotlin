/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihanopsional2

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input Integer dengan panjang digit 2-9.
 *  - Fungsi harus mengembalikan Integer yang merupakan hasil penjumlahan dari angka terkecil dan angka terbesar dari nilai yang diinput.
 *
 *  Contoh:
 *  Input = minAndMax(987234) -> Output = 11 | Penjelasan: Angka terkecil= 2, angka terbesar=9 -> 2+9 -> 11
 *  Input = minAndMax(8812334) -> Output = 9 | Penjelasan: Angka terkecil= 1, angka terbesar=8 -> 1+8 -> 9
 *  Input = minAndMax(10) -> Output = 1 | Penjelasan: Angka terkecil= 0, angka terbesar=1 -> 0+1 -> 1
 *
 *  Modul terkait: Kotlin Fundamental & Collections
 *
 */

fun minAndMax(number: Int): Int {
    /*
    * Konversi angka menjadi string, kemudian ubah setiap karakter menjadi integer,
    * dan simpan dalam list digits.
    * Misalnya jika parameter number menerima inputan 987234, maka nilai number,
    * yang disimpan ke dalam variable digits akan menjadi [9,8,7,2,3,4]
    */
    val digits = number.toString().map { it.toString().toInt() }

    /*
    * Gunakan minOrNull() untuk mencari nilai terkecil dalam list digits.
    * Jika list digits kosong, maka kembalikan nilai 0 sebagai nilai terkecil.
    * Disini variable minValue akan menyimpan nilai terkecil dari list digits yaitu 2
    */
    val minValue = digits.minOrNull() ?: 0 // Mengambil nilai minimum atau default 0 jika kosong

    /*
    * Gunakan maxOfNull() untuk mencari nilai terbesar dalam list digits.
    * Jika list digits kosong, maka kembalikan nilai 0 sebagai nilai terbesar.
    * Disini variable maxValue akan menyimpan nilai terbesar dari list digits yaitu 9
    */
    val maxValue = digits.maxOrNull() ?: 0 // Mengambil nilai maksimum atau default 0 jika kosong

    // Kembalikan hasil penjumlahan dari nilai terkecil dan nilai terbesar.
    // Perhitungannya adalah 2 + 9 = 11
    return minValue + maxValue
}

fun main() {
    println(minAndMax(987234) == 11)
    println(minAndMax(8812334) == 9)
    println(minAndMax(10) == 1)
}
