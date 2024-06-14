
# Java Challenge

Jawaban dan penjelasan dari method yang dibuat.

### Method Rusak
Berapa kali string `Hello` dicetak setelah pemanggilan `rusak(1000)`?


string `Hello` akan dicetak sebanyak 1994 kali.

Penjelasan:

terdapat pemanggilan fungsi recursive yang akan mencetak string `hello` kembali, sehingga dilakukan pencetakan sebanyak:

`1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7 + 3 + 1 = 1994`


### Method Roger
Berapakah return value dari pemanggilan `roger(8,8)`?


return valuenya adalah `4`


Penjelasan:

- Method roger dipanggil dengan k = 8 dan b = 8. Karena b sama dengan 1, nilai 1 dikembalikan (kondisi terpenuhi).

- roger(8, 7) dipanggil. Karena k (8) habis dibagi b (7), nilai 1 ditambahkan ke hasil pemanggilan rekursif roger(8, 6).

- Berikutnya, Setiap panggilan rekursif mengikuti pola dibawah:
    - Jika k habis dibagi b, tambahkan 1 ke hasil pemanggilan   rekursif dengan k dan b dikurangi 1.

    - Jika k tidak habis dibagi b, tambahkan 0 ke hasil pemanggilan rekursif dengan k dan b dikurangi 1.

    - Proses tersebut berlanjut hingga b mencapai 1, di mana nilai 1 dikembalikan (kondisi terpenuhi).

- Setelah semua panggilan rekursif selesai, nilai akhir yang dikembalikan adalah total 1 dari setiap level rekursif

`return valuenya adalah 4`
