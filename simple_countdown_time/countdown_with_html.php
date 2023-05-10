<html>
<head>
    <title>Tutorial Cara Membuat Script PHP Hitung Mundur</title>
</head>
<body>
    <h2>Hitung Mundur dengan Script PHP Menggunakan mktime</h2>
    <p>countdown php</p>
    <?php
        $t    =time();
        echo($t . "<br /> Sekarang: ");
        echo(date("D, d F Y",$t));
    ?>
    <br /><br />
    <?php
        $day    =21;
        $month    =6;
        $year    =2019;
        
        $days    =(int)((mktime (0,0,0,$month,$day,$year) - time())/86400);
        echo "Masih ada <b>$days</b> hari lagi, sampai tanggal $day/$month/$year";
    ?>
</body>
</html>