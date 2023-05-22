<?php 
//membuat fungsi
function hitungumur($thn_lahir, $thn_sekarang){
	$umur = $thn_sekarang - $thn_lahir;
	return $umur;
}

echo "umur saya adalah ". hitungumur(1945, 2021) ."tahun";
?>