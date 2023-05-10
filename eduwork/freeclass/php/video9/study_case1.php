
<?php

$array = array(
    array (
        'nama' => 'Ahmad',
        'umur' => 17,
        'kelas' => 'Laravel'
    ),
    array (
        'nama' => 'Rifai',
        'umur' => 20,
        'kelas' => 'Node JS'
    ),
    array (
        'nama' => 'Ganteng',
        'umur' => 15,
        'kelas' => 'Python'
    ),
);

    foreach ($array as $key => $value) {
        echo "Nama : " .$value['nama'].
             ", Umur : " .$value['umur'].
             ", Kelas : " .$value['kelas'];
        echo "<br>";
    }

?>





















