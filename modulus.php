<?php

    function cetak()
    {
        for ($i = 1; $i <= 150; $i++) {
            $modulus2 = $i % 2;
            $modulus7 = $i % 7;

            if ($modulus2 == 0 && $modulus7 == 0) {
                echo "positifnegatif\n";
            } else if ($modulus2 == 0){
                echo "positif\n";
            }else if ($modulus7 == 0){
                echo "negatif\n";
            }else {
                echo "{$i}\n";
            }

        }
    }
    cetak();

?>