<?php 

    $time = time();
    echo($time . "<br/> Sekarang ");
    echo(date("D, d F Y", $time));

    $day = 19;
    $month = 4;
    $year = 2023;

    $days = (int)((mktime(0, 0, 0, $month, $day, $year) - time()) / 86400);
    echo " Masih ada <b>$days<b/> hari lagi, sampai tinggal $day/$month/$year";

?>