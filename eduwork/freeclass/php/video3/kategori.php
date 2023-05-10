<!-- Menghitung Nilai BMI -->

<?php

    // BMI
    $nama = "Haikal";
    echo "Halo, $nama <br>";

    $tinggiBadan = 160;
    $kuadratTinggiBadan = $tinggiBadan * $tinggiBadan;
    $beratBadan = 70;
    $bmi = $beratBadan / $kuadratTinggiBadan;
    echo "Nilai BMI Anda adalah $bmi <br>";

    if ($bmi == 0.001171875) {
        echo "Anda termasuk Kurus";
    } else if ($bmi == 0.0021484375) {
        echo "Anda termasuk Sedang";
    } else {
        echo "Anda termasuk Gemuk";
    }
    

?>






















