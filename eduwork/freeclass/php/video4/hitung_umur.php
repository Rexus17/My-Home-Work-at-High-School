<!-- Hitung Umur -->

<?php

    $nama = "Lulu Falya Tantri";
    $jenisKelamin = "Perempuan";
    $tanggalLahir = 2007;
    $umur = date('Y') - $tanggalLahir;

    if ($jenisKelamin == "laki") {
        echo "Selamat Malam, tuan $nama <br>";
        echo "Umur anda sekarang $umur tahun <br>";
    } else {
        echo "Selamat Malam, Nyonya $nama <br>";
        echo "Umur anda sekarang $umur tahun <br>";
    }
    

?>












