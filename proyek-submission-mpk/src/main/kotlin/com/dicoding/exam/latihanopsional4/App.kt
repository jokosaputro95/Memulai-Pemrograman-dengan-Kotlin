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

package com.dicoding.exam.latihanopsional4

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input string dengan panjang karakter 1-100.
 *  - Fungsi harus mengembalikan karakter yang ditengah dari string yang diinput.
 *      - Jika panjang string bernilai genap, maka yang dikembalikan adalah 2 karakter.
 *      - Jika panjang string bernilai ganjil, maka yang dikembalikan adalah 1 karakter.
 *
 *  Contoh:
 *  Input = getMiddleCharacters("dicoding") -> Output = od | Penjelasan: panjang string "dicoding" adalah 8 (genap) dan dua karakter paling tengah adalah "od"
 *  Input = getMiddleCharacters("dicodingindonesia")  -> Output = i | Penjelasan: panjang string "dicodingindonesia" adalah 17 (ganjil) dan satu karakter paling tengah adalah "i"
 *  Input = getMiddleCharacters("A")  -> Output = A | Penjelasan: panjang string "A" adalah 1 (ganjil) dan satu karakter paling tengah adalah "A"
 *
 *  Hint:  Kotlin Fundamental & Collections
 *
 */

fun getMiddleCharacters(string: String): String {
    // Cara 1
    val strLength = string.length
    val middleIndex = strLength / 2

    return if (strLength % 2 == 0) {
        // Panjang string genap, ambil 2 karakter di tengah
        string.substring(middleIndex - 1, middleIndex + 1)
    } else {
        // Panjang string ganjil, ambil 1 karakter ditengah
        string[middleIndex].toString()
    }

    // Cara 2
    /*
    * val strLength = string.length
    * return if (strLength % 2 == 0) {
    *    string.slice(strLength / 2 - 1..strLength / 2)
    *       // Inputan: "dicodingindonesia" maka panjang string adalah 17 (ganjil)
    *       // `strLength / 2` adalah 17/2 = 8 (index tengah)
    *       // `..` ini adalah operator range yang digunakan pada rentang index yang ingin diambil
    *       // `strLength / 2 - 1` adalah 8-1 = 7 (index sebelum index tengah)
    *       // maka `string.slice(strLength / 2 - 1..strLength / 2)`,
    *       // akan mengambil potongan string mulai dari indeks 7 hingga indeks 8
    *       // yang artinya akan mengambil karakter pada indeks 7 (karakter ke-8 dalam string) dan karakter pada indeks 8 (karakter ke-9 dalam string).
    *       // Hasilnya adalah String "i", karena "i" adalah karakter pada indeks 7, dan "i" adalah karakter pada indeks 8, dan dua karakter ini diambil sebagai hasil.
    * } else {
    *    string[strLength / 2].toString()
    * }
    */

    // Perbedaanya pada penggunaan `substring` dan `slice`
}

fun main() {
    println(getMiddleCharacters("dicodingindonesia") == "i")
    println(getMiddleCharacters("dicoding") == "od")
    println(getMiddleCharacters("A") == "A")
}
