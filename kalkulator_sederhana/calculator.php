<html>
<head>
   <title>Kalkulator Sederhana</title>
</head>
<body>
   <form method="post" action="">
      <input type="text" name="angka1" placeholder="Angka pertama">
      <select name="operator">
         <option>Pilih</option>
         <option value="+">+</option>
         <option value="-">-</option>
         <option value="*">*</option>
         <option value="/">/</option>
      </select>
      <input type="text" name="angka2" placeholder="Angka kedua">
      <button type="submit" name="hitung">Hitung</button>
   </form>
   <br><br>
   <?php
   if(isset($_POST['hitung'])){
      $angka1 = $_POST['angka1'];
      $angka2 = $_POST['angka2'];
      $operator = $_POST['operator'];

      if($operator == "+"){
         $hasil = $angka1+$angka2;
      } elseif($operator == "-"){
         $hasil = $angka1-$angka2;
      } elseif($operator == "*"){
         $hasil = $angka1*$angka2;
      } elseif($operator == "/"){
         $hasil = $angka1/$angka2;
      }

      echo "Hasilnya adalah: " .$hasil;
   }
   ?>
</body>
</html>
