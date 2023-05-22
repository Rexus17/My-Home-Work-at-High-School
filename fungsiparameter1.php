<?php  
//membuat fungsi
function perkenalan($nama, $salam){
	echo $salam.", ";
	echo "perkenalkan, nama saya ".$nama."<br/>";
	echo "senang berkenalan dengan anda<br/>";
}

//memanggil fungsi yang sudah dibuat
perkenalan("Rifai", "Hi");

    echo "<hr/>";

    $saya = "Wizard";
    $ucapansalam = "selamat pagi";    
    //memanggil lagi 
    perkenalan($saya, $ucapansalam);
?>