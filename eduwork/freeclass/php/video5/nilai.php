<!-- Menghitung Nilai -->

<?php

    $nilai = 'D';

    switch ($nilai) {
        case 'A':
            echo "Nilai anda antara 90 - 100";
            break;
        case 'B':
            echo "Nilai anda antara 80 - 90";
            break;
        case 'C':
            echo "Nilai anda antara 70 - 80";
            break;
        case 'D':
            echo "Nilai anda antara 0 - 70";
            break;
        
        default:
            echo "Nilai Masukan tidak di temukan";
            break;
    }

?>












