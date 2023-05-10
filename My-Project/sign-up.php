<?php

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign-Up</title>
    <!-- Menghubungkan ke Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css">
    <!-- Menghubungkan ke CSS Internal -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <br><br><br><br>

    <center>

    <h1>Daftar Peminjaman Mobil</h1>

    <br><br>

    <form class="row g-3">
        <div class="col-md-4">
            <label for="validationDefault01" class="form-label">NIK</label>
            <input type="text" class="form-control" id="validationDefault01" placeholder="NIK" required>
        </div>
        <div class="col-md-4">
            <label for="validationDefault01" class="form-label">Nama Lengkap</label>
            <input type="text" class="form-control" id="validationDefault01" placeholder="Nama Lengkap" required>
        </div>
        <div class="col-md-4">
            <label for="validationDefaultUsername" class="form-label">Email</label>
            <div class="input-group">
            <span class="input-group-text" id="inputGroupPrepend2">@</span>
            <input type="email" class="form-control" id="validationDefaultUsername"  aria-describedby="inputGroupPrepend2" required>
            </div>
        </div>
        <div class="col-md-4">
            <label for="inputPassword4" class="form-label">Password</label>
            <input type="password" class="form-control" id="inputPassword4">
        </div>
        <div class="col-md-4">
            <label for="validationCustom04" class="form-label">Jenis Kelamin</label>
            <select class="form-select" id="validationCustom04" required>
                <option selected value="laki">Laki - Laki</option>
                <option selected value="perempuan">Perempuan</option>
            </select>
            <div class="invalid-feedback">
            Tolong, Pilihlah Salah Satu.
            </div>
        </div>
        <div class="col-md-4">
            <label for="validationDefault01" class="form-label">No. HandPhone</label>
            <input type="text" class="form-control" id="validationDefault01" placeholder="Nomor Handphone" required>
        </div>
        <div class="col-md-12">
            <label for="inputAddress" class="form-label">Alamat</label>
            <input type="text" class="form-control" id="inputAddress" placeholder="Alamat Rumah">
        </div>

        <br><br>

        <div class="btn-group" role="group" aria-label="Basic example">
            <a href="menu.php"><button type="button" class="btn btn-primary">Daftar</button></a>
        </div>
    </form>

    </center>

</body>
</html>










