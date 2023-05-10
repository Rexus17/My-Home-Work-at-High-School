<!-- Menghitung Bangun Datar menggunakan Function PHP -->

<?php

    // Luas Persegi
    function persegi($sisiPersegi1, $sisiPersegi2)
    {
        $luasPersegi = $sisiPersegi1 * $sisiPersegi2;
        echo "Luas Persegi : $sisiPersegi1 * $sisiPersegi2 = $luasPersegi";
    }

    persegi(50, 40);

    echo "<br>";


    // Luas Persegi Panjang
    function persegiPanjang($panjangPersegiPanjang, $lebarPersegiPanjang)
    {
        $luasPersegiPanjang = $panjangPersegiPanjang * $lebarPersegiPanjang;
        echo "Luas Persegi Panjang : $panjangPersegiPanjang * $lebarPersegiPanjang =$luasPersegiPanjang";
    }

    persegiPanjang(70, 50);

    echo "<br>";


    // Luas Segitiga
    function segitiga($alasSegitiga, $tinggiSegitiga)
    {
        $luasSegitiga = 0.5 * $alasSegitiga * $tinggiSegitiga;
        echo "Luas Segitiga : 0.5 * $alasSegitiga * $tinggiSegitiga = $luasSegitiga";
    }

    segitiga(10, 14);

    echo "<br>";


    // Luas Trapesium
    function trapesium($aTrapesium, $bTrapesium, $tinggiTrapesium)
    {
        $luasTrapesium = 0.5 * ($aTrapesium + $bTrapesium) * $tinggiTrapesium;
        echo "Luas Trapesium : 0.5 * $aTrapesium + $bTrapesium * $tinggiTrapesium = $luasTrapesium";
    }

    trapesium(6, 6, 10);

    echo "<br>";


    // Luas Jajar Genjang
    function jajarGenjang($alasJajarGenjang, $tinggiJajarGenjang)
    {
        $luasJajarGenjang = $alasJajarGenjang * $tinggiJajarGenjang;
        echo "Luas Jajar Genjang : $alasJajarGenjang * $tinggiJajarGenjang = $luasJajarGenjang";
    }

    jajarGenjang(10, 20);
    

?>










