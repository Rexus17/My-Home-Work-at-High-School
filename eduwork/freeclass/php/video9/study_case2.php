
<?php

    $array = file_get_contents('data.json');
    $data = json_decode($array, true);

    foreach ($data as $key => $value) {
        echo "Nama : ".$value['nama'].
            "Kelas : ".$value['kelas'].
            "Umur : ".$value['umur'];
        echo "<br>";
    }

?>















