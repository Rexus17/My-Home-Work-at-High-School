<!-- Membuat Volume Bangun Ruang -->

<?php

    // Volume Kubus
    function kubus($sisi1, $sisi2, $sisi3)
    {
        $volumeKubus = $sisi1 * $sisi2 * $sisi3;
        echo "Volume Kubus : $sisi1 * $sisi2 * $sisi3 = $volumeKubus";
    }

    kubus(10, 20, 30);

    echo "<br>";


    // Volume Balok
    function balok($panjangBalok, $luasBalok, $tinggiBalok)
    {
        $volumeBalok = $panjangBalok * $luasBalok * $tinggiBalok;
        echo "Volume Balok : $panjangBalok * $luasBalok * $tinggiBalok = $volumeBalok";
    }

    balok(2, 10, 3);

    echo "<br>";


    // Volume Prisma
    function prismaSegitiga($luasPrismaSegitiga, $tinggiPrismaSegitiga)
    {
        $volumePrismaSegitiga = $luasPrismaSegitiga * $tinggiPrismaSegitiga;
        echo "Volume Prisma : $luasPrismaSegitiga * $tinggiPrismaSegitiga = $volumePrismaSegitiga";
    }

    prismaSegitiga(10, 16);

    echo "<br>";


    // Volume Limas
    function limas($luasAlasLimas, $tinggiLimas)
    {
        $volumeLimas = 0.3 * $luasAlasLimas * $tinggiLimas;
        echo "Volume Limas : 0.3 * $luasAlasLimas * $tinggiLimas = $volumeLimas";
    }

    limas(8, 18);

    echo "<br>";


    // Volume Tabung
    function tabung($dimensiTabung, $tinggiTabung)
    {
        $volumeTabung = 3.14 * (0.5 * $dimensiTabung) * $tinggiTabung;
        echo "Volume Tabung : 3.14 * 0.5 * $dimensiTabung * $tinggiTabung = $volumeTabung";
    }

    tabung(10, 20);

?>




















