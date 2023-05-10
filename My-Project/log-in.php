<?php

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Log-In</title>
    <!-- Menghubungkan ke Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css">
    <!-- Menghubungkan ke CSS Internal -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <br><br><br><br>

    <center>

    <h1>Login Peminjaman Mobil</h1>

    <br><br>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="floatingInput" placeholder="Masukan ID">
            <label for="floatingInput">ID</label>
            </div>
        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="floatingPassword" placeholder="Masukan Nama">
            <label for="floatingPassword">Nama</label>
        </div>
        <div class="form-floating mb-3">
            <select class="form-select" id="validationCustom04" required>
                <option selected value="admin">Admin</option>
                <option selected value="anggota">Anggota</option>
            </select>
        </div>

        

        <div class="btn-group" role="group" aria-label="Basic example">
            <a href="menu.php"><button type="button" class="btn btn-primary">Masuk</button></a>
        </div>

        <br><br>

        <p>Apakah Anda Sudah Memiliki Akun?</p>

        <div class="btn-group" role="group" aria-label="Basic example">
            <a href="sign-up.php"><button type="button" class="btn btn-primary">Buat</button></a>
        </div>

    </center>

</body>
</html>










